package CommandPattern;

public class TurnOnLights implements Command {

    private Lights lights;

    public TurnOnLights(Lights lights)
    {
        this.lights = lights;
    }
    @Override
    public String execute() {
        return lights.switchOn();
    }
}
