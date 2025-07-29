class Wrap
{
static int m(Integer v){
	return v;
}

	public static void main(String args[])
	{
		//Integer iob = new Integer(100);//BOXING
		//int i=iob.intValue();  //UNBOXING
		//System.out.println(iob+" "+i);

		Integer iob=100;
		int a=iob;
		System.out.println(iob+" "+a);


		Integer ob = m(500);
		System.out.println(ob);


	}
}