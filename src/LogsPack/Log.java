package LogsPack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log {

	public static Logger log = (Logger) LogManager.getLogger(Baseclass.class.getName());

	public static void startTestCase(String sTestCaseName){
		log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		}
	
	public static void endTestCase(String sTestCaseName){
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		}
}
