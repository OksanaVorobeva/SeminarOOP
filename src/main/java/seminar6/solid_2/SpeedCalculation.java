package seminar6.solid_2;

public class SpeedCalculation {
   /* public double calculateAllowedSpeed(Vehicle vehicle){
        if(vehicle.getType().equalsIgnoreCase("Car")){
            return vehicle.getMaxSpeed()*0.8;
        }else  if (vehicle.getType().equalsIgnoreCase("Bus")){
            return  vehicle.getMaxSpeed()*0.6;
        }
        return 0.0;
    }*/



    public double calculateAllowedSpeed(Vehicle vehicle){
        return vehicle.calculateAllowedSpeed();
    }
}
