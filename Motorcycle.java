<<<<<<< HEAD
public class Motorcycle extends Vehicle{
      private String engineType;
      
      
      public Motorcycle(
          String brand,
          String model,
          int year,
          String engineType
       ) {
            super(brand, model, year);
            this.engineType = engineType;

      }
      
      @Override
      public void displayInfo() {
            super.displayInfo();
            System.out.println("Engine Type:" + engineType);
      }
    }        
=======
public class Motorcycle extends Vehicle implements Serviceable {

    private String engineType;

    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("A motorcycle moves backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }
     @Override
    public void service(){
                 System.out.println("A Motorcycle requires a brake inspection");
  }              

}
>>>>>>> 2ec41b2 (Implement interfaces and serviceable classes)
