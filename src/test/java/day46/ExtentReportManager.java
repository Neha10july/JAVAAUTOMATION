package day46;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter; //UI of the report.
    public ExtentReports extentReports; // populate common info on the report.
    public ExtentTest test; // creating test case entries in the report and update status of the test methods

    public void onStart(ITestContext context){
        sparkReporter = new ExtentSparkReporter(System.getProperty("urer.dir") + "/reports/myReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of the report
        sparkReporter.config().setReportName("Functional Testing"); // Name to the report
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);

        extentReports.setSystemInfo("Computer Name", "localhost");
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Tester Name","Pavan");
        extentReports.setSystemInfo("os","Windows11");
        extentReports.setSystemInfo("Browser name", "Chrome");
    }

    public void onTestSuccess(ITestResult result){
        test = extentReports.createTest(result.getName()); //create a new entry in the report.
        test.log(Status.PASS,"Test case PASSED is:" + result.getName()); // update status p/f/s
    }

    public void onTestFaliure(ITestResult result){
        test = extentReports.createTest(result.getName());
        test.log(Status.FAIL,"Test case FAILED is: " + result.getName());
        test.log(Status.FAIL,"Test case FAILED cause is: " + result.getThrowable());

    }

    public void onTestSkipped(ITestResult result){
        test = extentReports.createTest(result.getName());
        test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName());
    }
}

