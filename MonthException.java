class MonthException extends Exception{
   public MonthException(){
   super("Month must be between 1 to 12 integer.");//Call the Exception class constructor
   }
   public MonthException(String s){
   super(s);
   }
}

