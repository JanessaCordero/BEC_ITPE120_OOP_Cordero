public class Main {
    public static void main(String[] args) {
        Motor myMotor = new Motor("Hyundai", "Santafe", "black");

        myCar.startEngine(); 
        myCar.honkHorn();    
        myCar.stopEngine(); 

        
        System.out.println("My motor is a " + myMotor.make + " " + myMotor.model + " in " + myMotor.color + ".");
    }
}
