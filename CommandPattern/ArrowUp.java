package CommandPattern;

public class ArrowUp implements Command{

    private DevicesControl Device;

    public ArrowUp(DevicesControl Device)
    {
        this.Device = Device;
    }

    @Override
    public String execute() {
        return Device.arrowUp();
    }
}
