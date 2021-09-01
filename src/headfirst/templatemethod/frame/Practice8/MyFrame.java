package headfirst.templatemethod.frame.Practice8;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	public void paint(Graphics graphics) {   // 실습#8에서 수정할 부분 - Hook!
		super.paint(graphics);
		String msg = "JUNBEOM YOO";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
