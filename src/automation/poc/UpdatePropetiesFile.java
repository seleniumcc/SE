package automation.poc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;

public class UpdatePropetiesFile {

	public static void main(String[] args) throws IOException {


		FileInputStream in = new FileInputStream("./conf/a.properties");
		Properties props = new Properties();
		props.load(in);
		in.close();

		FileOutputStream out = new FileOutputStream("./conf/a.properties");
		props.setProperty("country", "america");
		props.store(out, null);
		out.close();

		System.out.println("done");
	}

}
