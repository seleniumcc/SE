package automation.poc;

import java.util.ArrayList;
import java.util.List;

public class FindOddNumber {

	public static void main(String args[]) {

		int a = 9;
		int b = 200;
		List<Integer> ai = new ArrayList<Integer>();
		if (b > a) {

			for (int i = a; i < b; i++) {
				if (i % 2 != 0) {
					ai.add(i);
				}
			}

		}
		Integer[] arr = new Integer[ai.size()];
	    arr = ai.toArray(arr);
	    
	    for(Integer s:arr)

		System.out.println(s);
	}

}
