package lab5;

/**
 * a small integer is defined as an integer k where
 * Integer.MIN_VALUE <= k's value <= Integer.MAX_VALUE
 */
public class SmallInt implements Process
{
    //private final String s;
    //private int sInt;
    private int kVal;
    //private String s;

    public SmallInt(int kVal) //default constructor
    {
        this.kVal = 0; //Integer.MIN_VALUE <= k's value <= Integer.MAX_VALUE
        //this.s = "";
        //int sum = 0;
    }

    public int getValue()
    {
        return this.kVal;
    }

    public int setValue(String s)
    {
        //return -1;
        //int kVal = Integer.parseInt(s);
        try
        {
            int kVal = Integer.parseInt(s);

            if ((kVal <= Integer.MIN_VALUE) | (kVal >= Integer.MAX_VALUE))
            {
               throw new IllegalArgumentException();
            }
        } catch (NumberFormatException nfe)
        {
            kVal = -1;
        } catch (IllegalArgumentException iae)
        {
            //System.out.println("Must input an integer!");
            kVal = 0;
        }
        return kVal;
    }

    public int add(SmallInt sInt)
    {
        int sum;
        //return -1;
        sum = sInt.getValue() + this.getValue();

        if (Integer.MIN_VALUE > sum || Integer.MAX_VALUE < sum)
        {
            sum = 0;
        }

        return sum;
    }

    @Override
    public void processInput(String s)
    {

    }
}
