public class XSolarXBatteryPoweredMotor  extends BatteryPoweredMotor {
    @Override
    public int getHorsepower(){
        System.out.println("XSolarXBatteryPoweredMotor...getHorsepower");
        return 0;
    }
    public int getLumensToOperate(){
        System.out.println("XSolarXBatteryPoweredMotor...getLumensToOperate");
        return 0;
    }
    @Override
    public int getTimeToRecharge(){
        System.out.println("XSolarXBatteryPoweredMotor...getTimeToRecharge");
        return 0;
    }
}