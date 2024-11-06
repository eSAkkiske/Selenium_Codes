package seleniumInterviewQuestions;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class retryAnalyzer implements IRetryAnalyzer{
	int testCaseFailedCount = 0;
	int limit = 3;
	public boolean retry(ITestResult result) {
		if (testCaseFailedCount<limit) {
			testCaseFailedCount++;
			return true;
		}
		return false;
	}
}