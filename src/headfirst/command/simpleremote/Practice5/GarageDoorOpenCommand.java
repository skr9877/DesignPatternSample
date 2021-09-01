package headfirst.command.simpleremote.Practice5;

public class GarageDoorOpenCommand implements Command {    // �ǽ� #6�� ���� Ŭ����
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
