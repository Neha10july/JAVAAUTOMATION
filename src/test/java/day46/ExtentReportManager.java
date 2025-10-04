package day46;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extentReports;
    public ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // ✅ Create timestamp for unique report name
        try {
            String reportFolder = System.getProperty("user.dir") + "/reports/";
            new java.io.File(reportFolder).mkdirs();

            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String reportPath = reportFolder + "ExtentReport_" + timeStamp + ".html";

            sparkReporter = new ExtentSparkReporter(reportPath);
        } catch (Exception e) {
            e.printStackTrace();  // 🔎 This will show the real cause in console
        }

        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);

        extentReports.setSystemInfo("Computer Name", "localhost");
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Tester Name", "Pavan");
        extentReports.setSystemInfo("OS", "Windows 11");
        extentReports.setSystemInfo("Browser", "Chrome");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extentReports.createTest(result.getName());
        test.log(Status.PASS, "Test case PASSED: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test = extentReports.createTest(result.getName());
        test.log(Status.FAIL, "Test case FAILED: " + result.getName());
        test.log(Status.FAIL, "Cause: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extentReports.createTest(result.getName());
        test.log(Status.SKIP, "Test case SKIPPED: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
