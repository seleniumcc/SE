package pack3;

import java.util.Date;

public class DT {

	public static void main(String[] args) {

		Date dt  = new Date();
		System.out.println(dt.toString());
      String d =dt.toString();
      d=d.replaceAll(" ", "_");
      d=d.replaceAll(":", "_");
      System.out.println(d);
	}

}
