package Accessmodifier;

public class Staticfinal {
    static int c=40;//can access without object
    final double ba=4.66;//ccan access only with object
    static final int y=13;//can access without object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(c);
Staticfinal v=new Staticfinal();
System.out.println(v.ba);
System.out.println(y);

	}

}
