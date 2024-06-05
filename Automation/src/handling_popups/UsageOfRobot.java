package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UsageOfRobot {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_WINDOWS);
//	r.keyPress(KeyEvent.VK_5);
//	r.keyRelease(KeyEvent.VK_WINDOWS);
	Runtime.getRuntime().exec("notepad");Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_E);
	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_B);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
}
}
