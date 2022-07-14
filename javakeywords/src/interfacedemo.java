interface showable
{
	public final int a=9;
	void show();
}
interface printable
{
	void print();
}
 class interfacedemo implements showable,printable {
public void show()
{
	System.out.println("hello");
}
public void print()
{
System.out.println("Welcome SVKP");
}
	public static void main(String[] args) {
		int a=30;
interfacedemo obj=new interfacedemo();
obj.show();
obj.print();
	}

}
