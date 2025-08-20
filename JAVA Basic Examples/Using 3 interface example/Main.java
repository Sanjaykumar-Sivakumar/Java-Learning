import java.util.*;
interface readable
{
	void read();
}
interface Writable {
	void write();
}
interface Storable {
	void store();
}
class Memory implements readable,Writable,Storable
{
	public void read()
	{
		System.out.println("Data can be readable");
	}
	public void write()
	{
		System.out.println("Data can be Writable");
	}
	public void store()
	{
		System.out.println("Data can be Storable");
	}

}

public class Main
{
	public static void main(String[] args) {
		Memory ob = new Memory();
		ob.read();
		ob.write();
		ob.store();
	}
}