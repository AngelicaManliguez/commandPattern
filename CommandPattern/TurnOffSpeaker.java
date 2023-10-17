package CommandPattern;

public class TurnOffSpeaker implements Command {

    private Speaker speaker;

    public TurnOffSpeaker(Speaker speaker)
    {
        this.speaker = speaker;
    }
    @Override
    public String execute() {
        return speaker.switchOff();
    }
}
