package com.lib.project.test;

import java.sql.Timestamp;

import com.lib.project.util.TimeGenerator;

public class TestTimeGenerator 
{
	public static void main(String[] args) 
	{
		TimeGenerator timeGenerator = new TimeGenerator();
		TimeGenerator parseTime = new TimeGenerator();	
		Timestamp borrowTime = parseTime.parseTimestamp(timeGenerator.getCurrentTime());
		System.out.println("The time is:" + borrowTime);
		String dateStr = String.valueOf(borrowTime);
		
		String year = dateStr.substring(0,4);
		String month = dateStr.substring(5,7);
		String day = dateStr.substring(8,10);
		String time = dateStr.substring(11,19);
		System.out.println("The year is:" + year);
		System.out.println("The month is:" + month);
		System.out.println("The day is:" + day);
		System.out.println("The time is:" + time);
		
	}

}
