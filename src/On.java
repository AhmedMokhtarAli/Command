public class On implements ICommand {
    @Override
    public void excute() {
        System.out.println("lamp is on");
    }

    @Override
    public void unexcute() {
        System.out.println("lamp is off");
    }
}
