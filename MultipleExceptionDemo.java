public class MultipleExceptionDemo{
	public static void main(String [] args){
	int a=10;
	int b=0;
	int result;
	try{
		result=a/b;
		System.out.println("Thr result:"+result);

		int[] nums = new int[5];	
		nums[10]=80;

		String str=null;
		System.out.println(str.length());
	}
	catch(ArithmeticException e){
		System.out.println("Caught an Arithmetic exception"+e);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Caught an Array out of bound"+e);
	}
	catch(NullPointerException e){
		System.out.println("Caught an null exception"+e);
	}
	finally{
		System.out.println("Finally code Executed");
	}
}

}

