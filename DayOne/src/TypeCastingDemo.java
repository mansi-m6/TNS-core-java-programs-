//Program to demonstrate type casting between primitive types

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		// widening / implicit type casting
		byte b=6;
		int i=b;
		System.out.println(i);
		
		float f = 15.5f;
		double d=f;
		System.out.println(d);
		
		char c ='M';
		int i3=c;
		System.out.println(i3);
		
		char var1 = '\u00A7';
		int i4 = var1;
		System.out.println(i4);

		
		// narrowing/explicit type casting
		double f1 = 10.52f;
		long l = (long) f1;
		System.out.println(l);
		
		long l1 = 8857867546854775806l;
		int i5 =(int)l1;
		System.out.println(i5);
		
		float f2 = 34.56f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println(ch1);
		
		

	}

}
