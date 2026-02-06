package d260202_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataMain {

	public static void main(String[] args) {
		java.util.Date udate=new Date();
		System.out.println(udate);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//sdf.format(udate);
		System.out.println(sdf);
		System.out.println(sdf.format(udate));
		
		java.sql.Date sdate=new java.sql.Date((new java.util.Date()).getTime());
		System.out.println(sdate);
		
	}

}
