class TestReturnArray
{
	//creating method which returns an array
	static int[] get()
	{
		return new int[]{10,20,40,30,50,90};
	}
	public static void main(String args[])
	{
		//calling method which return an array
		int arr[]=get();

		//printing the value of an array
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}