public class AstyleBatteryPoweredMotor extends BatteryPoweredMotor{
    @Override
    public int getHorsepower(){
        System.out.println("AstyleBatteryPoweredMotor...getHorsepower");
        return 0;
    }
    public int getTimeToRecharge(){
        System.out.println("AstyleBatteryPoweredMotor...getTimeToRecharge");
        return 0;
    }
}
