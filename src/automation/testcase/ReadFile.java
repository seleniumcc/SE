package automation.testcase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	//private static final String FILENAME = "C://Mukesh//ab.txt";

	public static void main(String[] args) {

		try {
            System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner(System.in);

            File file = new File(input.nextLine());

            input = new Scanner(file);
            	int i =1; ;
            	int j=0;
            
            while (input.hasNextLine())
            {
            	        	
            		 String line = input.nextLine();
            		
            			 System.out.println(line);
            			 
            		 
            		
            	 
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
