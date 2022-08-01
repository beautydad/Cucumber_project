package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ExtendUtil {
    public static ExtentReports extent;
   public static  ExtentSparkReporter spark;
   public static ExtentTest test;
    public static void startReport(){
         spark = new ExtentSparkReporter("Spark.html");
        spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

               test.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");

    }
    public static void test (String tname){
        test=extent.createTest(tname);
    }
    public static void log(String subject,boolean isTure){
        if(isTure) {
            test.log(Status.PASS, subject);
        }else{
            test.log(Status.FAIL, subject);
        }
    }
    public static void log(String subject, boolean isTrue, WebDriver driver) {
        if (isTrue) {
            test.log(Status.PASS, subject);
        } else {
            String screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
            test.addScreenCaptureFromBase64String(screenshot, "screenshot").fail(MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());

        }
    }
    public static void log(String subject){
        test.log(Status.INFO,subject);
    }

    public static void saveReport(){
        extent.flush();
    }
}
