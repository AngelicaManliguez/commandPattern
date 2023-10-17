package CommandPattern;

public class TurnOnSmartTv implements Command {

    private SmartTV tv;

    public TurnOnSmartTv(SmartTV tv)
    {
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOn();
    }
}
