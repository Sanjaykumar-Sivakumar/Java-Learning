import java.util.*;
interface Father
{
	void display();
}
interface Mother {
	void display();
}
class baby implements Father,Mother
{
	public void display()
	{
		System.out.println("Hi,my dear parents");
	}
}

public class Main
{
	public static void main(String[] args) {
		baby ob = new baby();
		ob.display();
	}
}