public class main {
    public static void main(String[] args) {

        AstyleBatteryPoweredMotor aBM = new AstyleBatteryPoweredMotor();
        BstyleBatteryPoweredMotor bBM = new BstyleBatteryPoweredMotor();
        if( aBM instanceof BatteryPoweredMotor){
            aBM.getHorsepower();
        }
        if( bBM instanceof BatteryPoweredMotor){
            bBM.getTimeToRecharge();
        }
        MstyleSolarPoweredMotor mSM = new MstyleSolarPoweredMotor();
        NstyleSolarPoweredMotor nSM = new NstyleSolarPoweredMotor();
        if( mSM instanceof MstyleSolarPoweredMotor){
            mSM.getHorsepower();
        }
        if( nSM instanceof NstyleSolarPoweredMotor){
            nSM.getLumensToOperate();
        }

        boolean b0,b1,b2,b3;
        System.out.println("\n--------XSolarBatteryPoweredXMotor----------");
        XSolarBatteryPoweredXMotor aXSBXM = new XSolarBatteryPoweredXMotor();
        aXSBXM.getHorsepower();
        aXSBXM.getLumensToOperate();
        aXSBXM.getTimeToRecharge();
        b0 = aXSBXM instanceof Motor;
        b1 = aXSBXM instanceof XSolarBatteryPoweredXMotor;
//      b2 = aXSBXM instanceof BatteryPoweredMotor;    //xxxx
//      b3 = aXSBXM instanceof SolarPoweredMotor;      //xxxx


        System.out.println("\n--------XSolarXBatteryPoweredMotor----------");
        XSolarXBatteryPoweredMotor bXSXBM = new XSolarXBatteryPoweredMotor();
        bXSXBM.getHorsepower();
        bXSXBM.getLumensToOperate();
        bXSXBM.getTimeToRecharge();
        b0 = bXSXBM instanceof Motor;
        b1 = bXSXBM instanceof XSolarXBatteryPoweredMotor;
//      b2 = bXSXBM instanceof BatteryPoweredMotor;    //xxxx
//      b3 = bXSXBM instanceof SolarPoweredMotor;      //xxxx

    }
}
