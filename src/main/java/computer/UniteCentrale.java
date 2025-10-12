package computer;

public class UniteCentrale {

    private  VGA vga ;

    public void print(String message){
        System.out.println("*********unitecentrale***********");
        vga.print(message);
        System.out.println("*********unitecentrale***********");
    }

    public void setVga(VGA vga) {

        this.vga = vga;
    } 

}
