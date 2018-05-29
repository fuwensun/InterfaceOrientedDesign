public class DualPoweredMotor implements SolarPoweredMotor, BatteryPoweredMotor{
    public int getHorsepower(){
        System.out.println("DualPoweredMotor...getHorsepower");
        return 0;
    }
    @Override
    public int getLumensToOperate(){
        System.out.println("DualPoweredMotor...getLumensToOperate");
        return 0;
    }
    @Override
    public int getTimeToRecharge(){
        System.out.println("DualPoweredMotor...getTimeToRecharge");
        return 0;
    }
}
