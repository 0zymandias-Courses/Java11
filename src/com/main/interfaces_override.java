package com.main;

interface Vehicle {
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
     
    int speed;
    int gear;
     
    // to change gear
    @Override
    public void changeGear(int newGear){
         
        gear = newGear;
    }
     
    // to increase speed
    @Override
    public void speedUp(int increment){
         
        speed = speed + increment;
    }
     
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
         
        speed = speed - decrement;
    }
     
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

class interfaces_override {
  public static void main( String [] args) {
    //instantiation of the object from Bicycle Class
    Bicycle bicycle = new Bicycle();
    //calling override functions
    bicycle.changeGear(2);
    bicycle.printStates();
    bicycle.speedUp(3);
    bicycle.printStates();
    bicycle.applyBrakes(1);
    bicycle.printStates();
    
  }
}
