package TestNGLearing;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners implements ITestListener
{
	@Override
	public void onStart(ITestContext context) {
		
	}
	@Override
	public void onFinish(ITestContext context) {
		
	}
	@Override
	public void onTestStart(ITestResult testResult) 
	{
		System.out.println("Started test cases are : "+testResult.getName());
	}
	@Override
	public void onTestSuccess(ITestResult testResult) 
	{
		System.out.println("Completed test cases are : "+testResult.getName());
	}
	@Override
	public void onTestFailure(ITestResult testResult)
	{
		System.out.println("Failed test cases are : "+testResult.getName());
	}
	@Override
	public void onTestSkipped(ITestResult testResult) 
	{
		System.out.println("Skipped test cases are : "+testResult.getName());
	}
}