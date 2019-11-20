package pack3;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class WriteLog {

	public static void main(String[] args) {
		
		long uniqueVal= System.currentTimeMillis();
		String file="MyFile_"+uniqueVal;
		System.setProperty("logfilename", file);
		
		Logger log = Logger.getLogger(WriteLog.class);
		DOMConfigurator.configure("./log4j.xml");
		log.info("test");
		log.info("Another Test ...");
		System.out.println("Done");
		
		

		
	}

}
