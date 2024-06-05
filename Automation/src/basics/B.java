package basics;

public class B {
public static void main(String[] args) {
	A a1=new A();
	System.out.println(a1.i);//10
	A a2=new A();
	a1.i=20;
	System.out.println(a2.i);//20
	}
}
