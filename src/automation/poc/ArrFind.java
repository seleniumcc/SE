package automation.poc;

public class ArrFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={5,2,2,3,4,5,1};
		 int k = 9;
		 
		 String res =findNumber(arr,k);
		 System.out.println(res);

	}
	
	
	 public  static String findNumber(int[] arr, int k) {
	        
	        int counter=0;
	        String result =null;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]==k)
	            {
	                counter++;
	            }
	            
	        }
	        if(counter>0)
	        {
	             result ="Yes";
	        }
	        else{
	             result ="No";
	                
	        }
	        return result;

	    }



}
