public class myClass {
    private static int instanceCount = 0; // Static variable to count instances
    private String name;

    public myClass(String name) {
        this.name = name;
        instanceCount++; // Increment the instance count when an instance is created
    }

    public String getName() {
        return name;
    }

    public static int getInstanceCount() {
        return instanceCount; // Static method to access the instance count
    }

    public static void main(String[] args) {
        myClass obj1 = new myClass("Instance 1");
        myClass obj2 = new myClass("Instance 2");
        myClass obj3 = new myClass("Instance 3");

        System.out.println("Number of instances created: " + myClass.getInstanceCount());
        System.out.println("Instances done:");
        System.out.println("1. " + obj1.getName());
        System.out.println("2. " + obj2.getName());
        System.out.println("3. " + obj3.getName());
    }
}
Write to Janessa Mejos Cordero
