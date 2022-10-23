package carsystem;

public class AirFlowController {
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir(){
        System.out.println("Air provided!");
    }

    public void off(){
        System.out.println("Air controller switched off.");
    }
}
