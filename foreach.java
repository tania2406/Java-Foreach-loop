package basic;

public class foreach {
	public static void main(String args[])
	{
 // we can define array in three type :
		
	 int data[]= {12,13,44};
	 int[]pp= {56,66,32};
	 int x[]=new int[]{12,21,23,44,55};
	 
	 for(int a:x)
	 System.out.println(a+" ");
System.out.println();
for(Integer a1:pp)
	System.out.println(a1+" ");
System.out.println();
for(Object a11:data)
	System.out.println(a11+" ");
}
}
