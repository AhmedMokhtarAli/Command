public class Down implements ICommand {
    @Override
    public void excute() {
        System.out.println("decreasing lamp light");
    }

    @Override
    public void unexcute() {
        System.out.println("increasing lamp light");
    }
}
