package computer.adapter;


import computer.Hdmi;
import computer.TV;
import computer.VGA;
public class HdmiVgaAdapter implements VGA{

    private Hdmi hdmi;

    @Override
    public void print(String message){
        System.out.println("------------------adapter------------------");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("------------------adapter------------------");

    }

    public void setVga(Hdmi hdmi){
        this.hdmi = hdmi;

    }
    public void setHdmi(Hdmi hdmi){
        this.hdmi = hdmi;

    }

}
