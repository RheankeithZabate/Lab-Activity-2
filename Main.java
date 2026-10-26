public class Main {
    public static void printDetails(Vehicle vehicle){
        vehicle.displayInfo();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car("Toyota", "Corolla", 2020, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Honda", "XRM", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Cushman", "Truckster", 1957, 4);
        vehicle.displayInfo();
        System.out.println();

        System.out.println("\n--- 2. Method Parameter ---");
        Car car = new Car("Ford", "Mustang", 1965, 2);
        Motorcycle motor = new Motorcycle("Honda", "Click", 2006, "Automatic");
        Truck truck = new Truck("Ford", "F-150", 2023, 6);

        printDetails(car);
        System.out.println();
        
        printDetails(motor);
        System.out.println();
        
        printDetails(truck);
        System.out.println();

        System.out.println("\n--- 3. Polymorphic Array ---");

            Vehicle[] vehicles = {
            new Car("Honda", "Civiv", 2015, 2),
            new Motorcycle("Suzuki", "Raider J Crossover", 2022, "Manual"),
            new Truck("Mitsubishi", "Canter", 2020, 6)
        };


        for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
        }
    }  
}