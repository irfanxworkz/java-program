class StringBufferExample6
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("java is my favorite language");
		System.out.println(sb.capacity());
		sb.ensureCapacity(37);
		System.out.println(sb.capacity());
	}
}