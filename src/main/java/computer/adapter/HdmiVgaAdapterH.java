package computer.adapter;


import computer.Hdmi;
import computer.VGA;
import computer.TV;

public class HdmiVgaAdapterH extends TV implements VGA{


    @Override
    public void print(String message){
        System.out.println("------------------adapter------------------");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("------------------adapter------------------");

    }



}
