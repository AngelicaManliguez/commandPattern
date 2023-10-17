package CommandPattern;

public class ArrowLeft implements Command{

    private DevicesControl Device;

    public ArrowLeft(DevicesControl Device)
    {
        this.Device = Device;
    }

    @Override
    public String execute() {
        return Device.arrowLeft();
    }
}
