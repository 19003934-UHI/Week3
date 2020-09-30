import java.util.Timer;
import java.util.TimerTask;

public class test 
{
    Timer timer;

    public test(int seconds) 
    {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask 
    {
        public void run() 
        {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) 
    {
        new test(5);
        System.out.println("Task scheduled.");
    }

}
