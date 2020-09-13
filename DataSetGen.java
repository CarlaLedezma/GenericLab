package lab2_Generic;

public class DataSetGen<T> {
	private double sum;
	private T maximum;
	private int count;

	/**
	   Constructs an empty data set.
	*/
	public DataSetGen()
	{
	   sum = 0;
	   count = 0;
	   maximum = null;
	}

	//Better not to change the type of Mesurable to a T type
	/**
	   Adds a data value to the data set.
	   @param x a data value
	*/
	public void add(T x)
	{
		//In order to get access to the getMeasure() method,x or maximum
		//has to be of type Measurable
	   sum = sum + ((Measurable) x).getMeasure();
	   if (count == 0 || ((Measurable) maximum).getMeasure() < ((Measurable) x).getMeasure())
	      maximum = x;
	   count++;
	}

	/**
	   Gets the average of the added data.
	   @return the average or 0 if no data has been added
	*/
	public double getAverage()
	{
	   if (count == 0) return 0;
	   else return sum / count;
	}

	/*In order to get max as a BankAccount type, we have to catch the the value type
	   in getMaximum() method from the DataSetGen <T> class. So, in in that case we will
	   have a T Type as a return type 
	   */
	/**
	   Gets the largest of the added data.
	   @return the maximum or 0 if no data has been added
	*/
	@SuppressWarnings("unchecked")
	public T getMaximum()
	{
	   return maximum;
	}
	}
