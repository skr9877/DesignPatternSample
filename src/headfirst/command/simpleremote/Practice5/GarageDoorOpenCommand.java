package headfirst.command.simpleremote.Practice5;

public class GarageDoorOpenCommand implements Command {    // 실습 #6을 위한 클래스
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
