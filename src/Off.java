public class Off implements ICommand {
    @Override
    public void excute() {
        System.out.println("lamp is off");
    }

    @Override
    public void unexcute() {
        System.out.println("lamp is on");
    }
}
