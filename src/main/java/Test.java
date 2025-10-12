
import computer.*;
import computer.adapter.HdmiVgaAdapter;
import computer.adapter.HdmiVgaAdapterH;
import static computer.UniteCentrale.*;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uc = new UniteCentrale();
        //uc.setVga(new Ecran());
        uc.setVga(new Ecran());
        uc.print("Bonjour");
        uc.setVga(new VideoProjecteur());
        uc.print("bONJOUR");


        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uc.setVga(hdmiVgaAdapter);
        uc.print("salut");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uc.setVga(hdmiVgaAdapter);
        uc.print("salut");

        uc.setVga(new SuperVP());
        uc.print("coucou");

        HdmiVgaAdapter hdmiVgaAdapter2 = new HdmiVgaAdapter();
        hdmiVgaAdapter2.setHdmi(new SuperVP());
        uc.setVga(hdmiVgaAdapter2);
        uc.print("bonsoir");
    }    

}
