package computer;

public class SuperVP implements VGA, Hdmi{
    @Override
    public void print(String message) {
        System.out.println("**************** SuperVP VGA ****************");
        System.out.println(message);
        System.out.println("******************* SuperVP VGA ***************");

    }

    @Override
    public void view(byte[] data) {
        System.out.println("**************** SuperVP HDMI ****************");
        String message = new String(data);
        System.out.println(message);
        System.out.println("******************* SuperVP HDMI ***************");

    }
}
