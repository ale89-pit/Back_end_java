import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static Logger log = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		log.info("Test Logger!!!");
		log.error("Test Error!");
		log.warn("Test Warning!");
		log.debug("Test Debug");
	}

}
