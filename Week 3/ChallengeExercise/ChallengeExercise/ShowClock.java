package ChallengeExercise;

/* Author: Peter Pasieka 
    Version: V1.2
*/

public class ShowClock // Class start
{
    // Variable initialisation start //
    private static TimeSettings hour;
    private static TimeSettings minute;
    private static TimeSettings second;
    private static String displayClock;
    // Variable initialisation end //

    
    public static void main(String[] args) // Main start
    {
        ShowClock clock = new ShowClock(15, 59, 55);

        /* Function pauses the current thread for 1000 mileseconds, used to count the clock in real time */
        int count = 0;
        for(int i = 0; i < 2; i++)
        {
            try
            {
                Thread.sleep(1000);
                count++;
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            clock.currentTime();
            i = 0;


        }


    } // Main end

    // Constructor block start //
    public ShowClock() 
    {
        hour = new TimeSettings(24);
        minute = new TimeSettings(60);
        second = new TimeSettings(60);

        updateClock();
    }

    public ShowClock(int hours, int minutes, int seconds) 
    {
        hour = new TimeSettings(24);
        minute = new TimeSettings(60);
        second = new TimeSettings(60);

        setTime(hours, minutes, seconds);
    }
    // Constructor block end //

    public void setTime(int hours, int minutes, int seconds) 
    {
        hour.setValue(hours);
        minute.setValue(minutes);
        second.setValue(seconds);

        updateClock();

    }

    public String getTime() 
    {
        return displayClock;
    }

    public void currentTime() 
    {
        second.timeIncrement();
        if (second.getTimeValue() == 60) 
        {
            minute.timeIncrement();
        }
    
        if (minute.getTimeValue() == 0) 
        {  
            hour.timeIncrement();
        }

        updateClock();
    }

    void updateClock() 
    {
        displayClock = hour.getValueFormat() + ":" + minute.getValueFormat() + ":" + second.getValueFormat();
        System.out.println("The current time is: " + displayClock);
    }




} // Class end