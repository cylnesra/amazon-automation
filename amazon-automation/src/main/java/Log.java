import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
  public class Log {

        static Logger logger = Logger.getLogger(Log.class);

        public Log(){
            DOMConfigurator.configure("log4j.xml"); //Implementing the log4j.xml file.
        }

        public void info(String message){ //To write messages to the log.
            logger.info(message);
        }

        public void warn(String message){ //To write warn to the log.
            logger.warn(message);
        }

        public void error(String message){ //To write error to the log.
            logger.error(message);
        }

    }

