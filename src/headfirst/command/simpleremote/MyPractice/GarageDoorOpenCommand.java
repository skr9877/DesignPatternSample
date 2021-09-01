package headfirst.command.simpleremote.MyPractice;

import headfirst.command.simpleremote.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
        garageDoor.up();
        garageDoor.lightUp();
    }
}
