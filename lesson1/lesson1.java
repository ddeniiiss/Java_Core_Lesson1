package lesson1;

import java.util.Iterator;

public class lesson1 {
public static void main(String[] args) {
	
	byte num1 = 10;
	short num2 = 20;
	int num3 = 30;
	long num4 = 40;
	
	float num5 = 50.1f;
	double num6 = 60.1;
	
	char ch = '&';
	boolean bl = true;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(num5);
	System.out.println(num6);
	System.out.println(ch);
	System.out.println(bl);
	
	
	System.out.println("MIN Byte = "+Byte.MIN_VALUE+"\nMAX Byte = "+Byte.MAX_VALUE);
	System.out.println("MIN Short = "+Short.MIN_VALUE+"\nMAX Short = "+Short.MAX_VALUE);
	System.out.println("MIN Integer = "+Integer.MIN_VALUE+"\nMAX Integer = "+Integer.MAX_VALUE);
	System.out.println("MIN Long = "+Long.MIN_VALUE+"\nMAX Long = "+Long.MAX_VALUE);
	System.out.println("MIN Float = "+Float.MIN_VALUE+"\nMAX Float = "+Float.MAX_VALUE);
	System.out.println("MIN Double = "+Double.MIN_VALUE+"\nMAX Double = "+Double.MAX_VALUE);
	
	int [] array = {3, 7, 23, 9, 14, 1, 17, 9, 20, 10};
	
	int min = array[0];
	int max = array[0];

	for (int i = 1; i < array.length; i++) {
		if (array[i] < min) {
			min = array[i];
		}
		if (array[i] > max) {
			max = array[i];
		}
		
	}
	System.out.println("Мінімальне значення: "+min+"\nМаксимаьне ззначення: "+max);
}
}
