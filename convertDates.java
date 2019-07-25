import java.util.Scanner;

class convertDates{
 private static int month = 0, day = 0, year = 0;

 public static int proofMonth() throws MonthException{
   Scanner input = new Scanner(System.in);
    int month;
    try{
    System.out.println("Please enter the month:");
    month = input.nextInt();
    if(month < 1 || month > 12) throw new MonthException();
    }catch(MonthException m){
      throw new MonthException();
    }
    return month;
  }

  public static int proofDay(int month) throws DayException{
   Scanner input = new Scanner(System.in);
   int day;
   try{
   System.out.println("Please enter the date:");
   day = input.nextInt();
   if(month != 2 && (day < 1 || day > maxDay(month))) throw new DayException();
   }catch(DayException d){
     throw new DayException();
   }
   return day;
  }

  public static int proofYear() throws YearException{
   Scanner input = new Scanner(System.in);
   int year;
   try{
   System.out.println("Please enter the year:");
   year = input.nextInt();
   if(year < 1000 || year > 3000) throw new YearException();
   }catch(YearException y){
      throw new YearException();
   }
   return year;
  }
  
  public static int maxDay(int month){
   switch(month){
    case 2: return 28;
    case 4:
    case 6:
    case 9:
    case 11:
      return 30;
    default:
      return 31;
   } 
  }

  public static int checkFeb(int d, int y) throws DayException{ //Check Feb days 
   int maximumDay = maxDay(2); //Assign the max days for Feb
   if(y % 4 == 0) maximumDay++; //Calculate how many max Days in every 4 years 
   if(d <= 0 || day > maximumDay) throw new DayException("Days must be btween 1 and 28");
   else return d;
  }


 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  boolean isMonth = false;
  boolean isDay = false;
  boolean isYear = false;

  while(!isMonth){ 
   try{
    month = proofMonth();
    isMonth = true;
   }catch(MonthException m){
    System.out.println(m.getMessage());
   }
  }

  while(!isDay){
   try{	  
    day = proofDay(month);
    isDay = true;
    }catch(DayException d){
     System.out.println(d.getMessage());
    }
  }

  while(!isYear){
   try{
    year = proofYear();
    isYear = true;
    }catch(YearException y){
     System.out.println(y.getMessage());
    }
  }
 
  if(month == 2){
   boolean febDays = false;
   while(!febDays){
    try{//Try to check if days between 1 to 28 for Feb
     day = checkFeb(day, year);
     febDays = true;
    }catch(DayException d){//If Exeption happened, print out message
     System.out.println(d.getMessage());
      try{ //If febDays return true, another try for assign days to Feb 
       day = proofDay(month);
      }catch(DayException e){
       System.out.println(e.getMessage());
      }
    }
   }
  } 

  System.out.println("Month:" + month + "/" + "Day:" + day + "/" + "Year:" + year);
 }
}

