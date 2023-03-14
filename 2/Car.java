class Car {
    private int speed =0;
    private int fuelConsumption = 12;
    private int gasTank = 60;
    private int travelledTime = 0;

    Car(){
        speed = 0; 
        fuelConsumption = 12;
        gasTank = 60;
        travelledTime = 0;
    }

    void speedUp(int increment){
        speed += increment;
    }

    void applyBrakes(int decrement){
        speed -= decrement;
    }

    void travelledTimeUp(int time){
        travelledTime += time;
    }  

    void printStateTank(){
        double tank = (double)gasTank - (((double)speed * travelledTime ) / (double)fuelConsumption);
       System.out.println(tank);
    }

}