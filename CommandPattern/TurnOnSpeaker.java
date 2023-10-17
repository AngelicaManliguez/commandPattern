package CommandPattern;

public class TurnOnSpeaker implements Command {

    private Speaker speaker;

    public TurnOnSpeaker(Speaker speaker)
    {
        this.speaker = speaker;
    }
    @Override
    public String execute() {
        return speaker.switchOn();
    }
}
