package CommandPattern;

public class ArrowRight implements Command{

    private DevicesControl Device;

    public ArrowRight(DevicesControl Device)
    {
        this.Device = Device;
    }

    @Override
    public String execute() {
        return Device.arrowRight();
    }
}