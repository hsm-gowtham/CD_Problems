class Parent
{
		public static void foo()
		{
			System.out.println("Parent Class");
		}
}
class Child extends Parent
{
		public static void foo()
		{
			System.out.println("Child Class");
		}
}
public class ParentChild {

	public static void main(String[] args) {
		Child c=new Child();
		c.foo();
	}

}
