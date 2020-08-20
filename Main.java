import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.AWTException;

public class Main
{
    public static void main(final String[] args) throws AWTException {
        try {
            while (true) {
                System.out.println(String.valueOf(mouseInfo().toString()) + " " + time());
                move();
                Thread.sleep(5000L);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void move() throws AWTException {
        final Robot robot = new Robot();
        robot.mouseMove((int)mouseInfo() + 20, 500);
    }
    
    public static Object mouseInfo() {
        final int xPos = (int)MouseInfo.getPointerInfo().getLocation().getX();
        return xPos + 1;
    }
    
    public static Object time() {
        final String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }
}
