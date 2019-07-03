
class Odometer{

  private double odometer, mile_dr, fuel, total_fuel;
  
  //Setters
  public void set_mile(double m){
    mile_dr = m;
  }

  public void set_fuel(double f){
    fuel = f;
  }

  public void set_odo(double o){
    odometer = o;
  }
  
  //Getters
  public double get_mile(){
   return mile_dr;
  }

  public double get_fuel(){
   return fuel;
  }
  
  public double get_odo(){
   return odometer;
  }
  
  //Methods
  public void rest_mile(){ //Reset Odometer
    mile_dr = 0;
  }
  
  public boolean is_reset(){
   boolean r = false;
   if(mile_dr == 0) r = true;
   return r;
  }

  public double fuel_efficiency(double m, double f){ //Check the fuel efficiency
   double fuel_eff = m / f;
   return fuel_eff;
  }

  public double fuel_consumption(double f, double m){
   total_fuel += f; 
   double fuel_left = m / fuel_efficiency(m, f);
   double fuel_consumption = total_fuel - fuel_left;
   return fuel_consumption;
  }
 
  public double total_driven(double m){
    return mile_dr += m;
  }

  public double odometer_total(double m){ //Calculate the total of odometer
    return odometer += m;
  }

  public double num_gallons(double m, double e){ //Return the number of gallons of gasoline since the odometer last reset
   double g = 0;    
   if(!is_reset()) g = m / e;
   else g = get_fuel();
   return g;
  }

}
