// program to print Last index to first index
public class Array1
{
	public static void main(String[] args) 
	{
	// Declaring array
	int [] arr = {1,2,3,4,5};
	for (int i = arr.length-1; i>=0 ; i--)
	/** declare and initializing variable i in single step
	    i = 5-1 =4, index i=4 in first step
		second step is 4>=0 condition true so iteration starts to --
		until index 0 index goes --*/
	{
		System.out.println(arr[i]);
	}

		
	}
}