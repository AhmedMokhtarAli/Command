public class Lamp {
    ICommand up;
    ICommand down;
    ICommand on;
    ICommand off;

    public Lamp(ICommand up, ICommand down, ICommand on, ICommand off) {
        this.up = up;
        this.down = down;
        this.on = on;
        this.off = off;
    }
    public void upClicked()
    {
        up.excute();
    }
    public void downClicked()
    {
        down.excute();
    }
    public void onClicked()
    {
        on.excute();
    }
    public void onDoubleClicked()
    {
        on.unexcute();
    }
    public void offClicked()
    {
        off.excute();
    }
    public void offDoubleClicked()
    {
        off.unexcute();
    }
}
