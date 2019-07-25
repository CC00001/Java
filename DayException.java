class DayException extends Exception{
  public DayException(){
  super("Date is not valid");
  }
  public DayException(String s){
  super(s);
  }
}

