class SportsMotor extends Motor {
    String color;

    public SportsCar(String make, String model, String color) {
        super(make, model);  // Call the base class constructor
        this.color = color;
    }

    @Override
    public void startEngine() {
        super.startEngine(); // Call the base class method
        System.out.println("The SportsCar is ready to go!");
    }

    public void honkHorn() {
        System.out.println("The " + color + " car is honking its horn.");
    }
}
