package pack3;

import java.io.IOException;

public class KillProcessDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++)
			
		{
		Runtime.getRuntime().exec("taskkill "+"chromediver.exe");
		System.out.println("killed "+i);
		}

		System.out.println("done");
	}

}
