package testListenersAndReporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestNGListeners extends Extendreporter implements ITestListener {

	ThreadLocal<ExtentTest> ThreadLocalReport = new ThreadLocal<ExtentTest>();
	private ExtentReports extentReport;
	private ExtentTest report;

	@Override
	public void onTestStart(ITestResult result) {
		report = extentReport.createTest(result.getName());
		ThreadLocalReport.set(report);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ThreadLocalReport.get().log(Status.PASS, "Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ThreadLocalReport.get().log(Status.FAIL, "Test failed. " + result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ThreadLocalReport.get().log(Status.SKIP, "There is exception in execution and skipped for another try " + result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		extentReport = getExtentReporter();
		cleanTestsBed();

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}