package automation.testcase;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Te {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*int x=0;
		int y=0;
		for(int z=0;z<5;z++)
		{
			if(++x>2&&++y>2 )
			{
				x++;
			}
			System.out.println(x+" "+y);
		}*/
		
		String dt ="5/2/17";
		
		String chageEffecitveDate="10/23/2017";
		
		Date date1;
        date1 = new SimpleDateFormat("MM/dd/yy").parse(dt.toString());
        System.out.println(date1);

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");     
        Calendar cal  = Calendar.getInstance();
                      cal.setTime(date1);
                        cal.add(Calendar.DATE, 60);
                        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                        date1=    cal.getTime();
                        chageEffecitveDate=   dateFormat.format(date1);
                        System.out.println(chageEffecitveDate);

	}

}
