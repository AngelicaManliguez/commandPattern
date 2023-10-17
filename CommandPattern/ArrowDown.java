package CommandPattern;

public class ArrowDown implements Command{

    private DevicesControl Device;

    public ArrowDown(DevicesControl Device)
    {
        this.Device = Device;
    }

    @Override
    public String execute() {
        return Device.arrowDown();
    }
}
