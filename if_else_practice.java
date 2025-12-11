package Learning;

public class if_else_practice {
public static void main(String[] args) {
	int result = findValue(2,3,7);
	System.out.println(result);
}

static int findValue(int a, int b, int c) {
	if(a==b)
		return c;
	else if(a==c)
		return b;
	else
		return a;
}

// return (a==b)?c:(a==c)?b:a

}
