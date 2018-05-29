public class main {
    public static void main(String[] args) {

        boolean b0,b1,b2,b3;
        System.out.println("\n--------DualPoweredMotor----------");
        DualPoweredMotor aDPM = new DualPoweredMotor();
        aDPM.getHorsepower();
        aDPM.getLumensToOperate();
        aDPM.getTimeToRecharge();
        b0 = aDPM instanceof Motor;
        b1 = aDPM instanceof DualPoweredMotor;
        b2 = aDPM instanceof BatteryPoweredMotor;
        b3 = aDPM instanceof SolarPoweredMotor;
    }
}
