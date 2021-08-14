package util;

import java.text.SimpleDateFormat;

public class Cellar 
{
	public Cellar() /*8mir*/
	{
		java.util.Date usi =  new java.util.Date();
		//Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("d.M.YYY");
				//GREEK GOR GREEK + "yy")
		//Format/convert the required Date object to String using the format() method, by passing it as a parameter.

		//Formatting the obtained date
		String formattedDate = formatter.format(usi);
		//String outi = String.format(usi);
		System.out.println(formattedDate);
	}
}
