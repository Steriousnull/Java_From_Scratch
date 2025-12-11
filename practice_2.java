package Learning;

public class practice_2 {
	public static void main(String args[]) {
		int a=3,b=4, c;
		c = a+b+a++ +b++ + ++a + ++b;
		//my thinking //  3+4+4+5+3+4
		
		/*
		 c = a    + b    + a++  + b++  + ++a  + ++b
             3      4      3      4       5       6

		 */
		System.out.println(c);
	}

}
