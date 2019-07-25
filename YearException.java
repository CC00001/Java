class YearException extends Exception{
  public YearException(){
  super("Year must be between 1000 to 3000");
  }
  public YearException(String s){
  super(s);
  }
}

