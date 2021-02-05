package com.timedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class TimeDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		 DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 
		System.out.println("Program 1...");
		System.out.println("Day- " + date.getDayOfMonth());
		System.out.println("Month-" + date.getMonthValue());
		System.out.println("Year-" + date.getYear());
		

		System.out.println("Program 2....");
        System.out.println("Enter date of birth(yyyy-MM-dd)");
		String dobstr = sc.next();
		LocalDate dateofbirth = LocalDate.parse(dobstr);
		Period period = Period.between(dateofbirth, date);
		System.out.println(period.getYears() + " Year " + period.getMonths() + " Months " + period.getDays() + " Days ");
		
		System.out.println("Program 3....");
      System.out.println("Enter the date(yyyy-MM-dd)");
       LocalDate datenext=LocalDate.parse(sc.next());
      System.out.println(datenext.with(TemporalAdjusters.next(DayOfWeek.SATURDAY))); 
      
      System.out.println("Program 4...");
      	 System.out.println("Enter the date of birth(dd/mm/yyyy)");
      DateTimeFormatter dateformat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate date3=LocalDate.parse(sc.next(),dateformat);
      if(date3.plusYears(18).isAfter(date)) {
    	  System.out.println("You are not eligile for voting");
      }
      else {
    	  System.out.println("You are eligible for voting");
      }
      
       System.out.println("Program 5...");
      System.out.println("Enter the date1(dd-MM-yyyy)");
      DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
      LocalDate date1=LocalDate.parse(sc.next(),fmt);
      System.out.println("Enter the date2(dd-MM-yyyy)");
      LocalDate date2=LocalDate.parse(sc.next(),fmt);
      System.out.println("Number of days:"+ChronoUnit.DAYS.between(date1, date2));
      System.out.println("Number of months:"+ChronoUnit.MONTHS.between(date1, date2));
      
     
      
	System.out.println("Program 6.....");
       System.out.println("Enter date(yyyy-MM-dd)");
      LocalDate localdate=LocalDate.parse(sc.next(),dtf);
      System.out.println("First day: " + localdate.withDayOfMonth(1));
    System.out.println("Last day: " + localdate.withDayOfMonth(localdate.lengthOfMonth()));
  
		System.out.println("Program 7....");
		 System.out.println("Enter Tom's date of birth(dd/mm/yyyy)");
	      DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	      LocalDate tomdate=LocalDate.parse(sc.next(),format);
	      System.out.println("Enter Jerry's date of birth(dd/mm/yyyy)");
	      LocalDate jerrydate=LocalDate.parse(sc.next(),format);
	      if(tomdate.equals(jerrydate)) {
	    	  System.out.println("Both are of same age");
	      }
	      else if(tomdate.isBefore(jerrydate)) {
	    	  System.out.println("Tom is older than Jerry");
	      }
	      else {
	    	  System.out.println("Jerry is older than Tom");
	      }
	      
	      System.out.println("Program 8 is similar to 2");
	      
	    /*  System.out.println("Program 9...");
	      System.out.println("Enter the date(dd-MM-yyyy)");
	      String tempdate=sc.next();
	      LocalDate d1=LocalDate.parse(tempdate);
	      LocalDate checkdate;*/
	      
	      System.out.println("Program 10...");
		   LocalDateTime ldt=LocalDateTime.now();
		   System.out.println(ldt);
		  System.out.println(ldt.plusDays(2).plusHours(2).plusMinutes(10)); 
	      
	      System.out.println("Program 11....");
	      System.out.println("Leap year:"+date.isLeapYear());
	      
		
		System.out.println("Program 12...");
		System.out.println("Today:"+date);
	  System.out.println("Yesterday:"+date.withDayOfMonth(date.getDayOfMonth()-1));
	  System.out.println("Tomorrow:"+date.withDayOfMonth(date.getDayOfMonth()+1));  
	  
	  
	  System.out.println("Program 13....");
		System.out.println("Enter date of birth(yyyy-MM-dd)");
		LocalDate dob =LocalDate.parse(sc.next(),dtf);
		 System.out.println("Enter date of joining(yyyy-MM-dd)");
		LocalDate doj=LocalDate.parse(sc.next(),dtf);
		Period per=Period.between(doj,date);
		System.out.println(per);
		Period pere=Period.between(dob,date);
		System.out.println(pere);
      Period givenper=Period.of(58, 0, 0);
      System.out.println(givenper.minus(pere));
	 
	  
	  System.out.println("Program 14...");
	  System.out.println("Enter start date(yyyy-MM-dd)");
	LocalDate startDate =LocalDate.parse(sc.next(),dtf);
	 System.out.println("Enter end date(yyyy-MM-dd)");
	LocalDate endDate=LocalDate.parse(sc.next(),dtf);

	LocalDate fridaytemp = startDate.with( TemporalAdjusters.nextOrSame( DayOfWeek.FRIDAY ) );
	
	while( fridaytemp.isBefore( endDate ) || fridaytemp.isEqual( endDate ) ) {
	    System.out.println(fridaytemp);
	    fridaytemp = fridaytemp.plusWeeks( 1 );
	} 
		
	     
        
        System.out.println("Program 15...");
        System.out.println("Enter start date(yyyy-MM-dd)");
        LocalDate local1=LocalDate.parse(sc.next(), dtf);
        System.out.println("Enter end date(yyyy-MM-dd)");
        LocalDate local2=LocalDate.parse(sc.next(), dtf);
        System.out.println("Enter date to check(yyyy-MM-dd)");
        LocalDate local3=LocalDate.parse(sc.next(), dtf);
        if(local3.isAfter(local1)&&local3.isBefore(local2)) {
        	System.out.println("Given date is beteen range");
        }
        else {
        	System.out.println("Given date is not in range");
        }
	}  

}
