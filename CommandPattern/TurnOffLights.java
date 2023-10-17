package CommandPattern;

public class TurnOffLights implements Command {

    private Lights lights;

    public TurnOffLights(Lights lights)
    {
        this.lights = lights;
    }
    @Override
    public String execute() {
        return lights.switchOff();
    }
}
