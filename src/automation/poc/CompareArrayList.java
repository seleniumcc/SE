package automation.poc;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {

		List<String> a = new ArrayList<String>();
		a.add("delhi");
		a.add("kolkata");
		a.add("patna");
		a.add("Bhopal");
		a.add("mumbai");
		
		List<String> b = new ArrayList<String>();
		b.add("mumbai");
		b.add("pata");
		b.add("kolkata");
		b.add("Bhopal");
		b.add("delhi");
		
		if(a.size()==b.size())
		{ 
			for(int i=0;i<a.size();i++){
				if(a.contains(b.get(i))){
					System.out.println("Exist : "+a.get(i));
				}else{
					System.out.println("Not Exist : "+b.get(i));
				}
			}
			
		}
		
		

	}

}
