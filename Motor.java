class Motor {
    String make;
    String model;
    

    public Motor(String make, String model) {
        this.make = make;
        this.model = model;
        
    }

    public void startEngine() {
        System.out.println("The " + make + " " + model + "'s engine is starting.");
    }

    public void stopEngine() {
        System.out.println("The "  + make + " " + model + "'s engine is stopping.");
    }
