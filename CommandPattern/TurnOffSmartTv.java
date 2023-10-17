package CommandPattern;

public class TurnOffSmartTv implements Command{

    private SmartTV tv;

    public TurnOffSmartTv(SmartTV tv)
    {
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOff();
    }
}
