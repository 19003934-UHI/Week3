package ChallengeExercise;

/* Author: Peter Pasieka 
    Version: V1.2
*/

public class TimeSettings // Class start
{
    private int limit;
    private int value;

    public TimeSettings(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 0;
    }


    public int getTimeValue()
    {
        return value;
    }

    public String getValueFormat()
        {
        if (value < 10)
        {
            return "0" + value;
        } else {
            return "" + value;
        }

    }

    public void setValue(int updatedValue)
    {
        if((updatedValue >= 0) && (updatedValue < limit))
        {
            value = updatedValue;
        }
    }

    public void timeIncrement()
    {
        value = (value + 1) % limit;
    }



    
} // Class end
