public class Main {
    public static void main(String[] args) {
        Up up=new Up();
        Down down=new Down();
        On on=new On();
        Off off=new Off();

        Lamp lamp=new Lamp(up,down,on,off);
        lamp.onClicked();
        lamp.upClicked();
        lamp.upClicked();
        lamp.downClicked();
        lamp.offClicked();
    }
}
