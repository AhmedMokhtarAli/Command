public class Up implements ICommand {
    @Override
    public void excute() {
        System.out.println("increasing lamp light ");
    }

    @Override
    public void unexcute() {
        System.out.println("decreasing lamp light");
    }
}
