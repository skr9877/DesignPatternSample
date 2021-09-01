package headfirst.command.simpleremote.MyPractice;

import headfirst.command.simpleremote.Command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
        garageDoor.down();
        garageDoor.lightDown();
    }
}
