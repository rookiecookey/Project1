package Accessmodifier;

public class Access {
    private int a;
    int b;
    protected int c;//access in anither pkg by creating an inheritance using the current class where the protected is made (Access),also make an object 
	public static void main(String[] args) {
		Access ob=new Access();
		ob.a=10;
		ob.b=30;
        ob.c=4;
	}

}
