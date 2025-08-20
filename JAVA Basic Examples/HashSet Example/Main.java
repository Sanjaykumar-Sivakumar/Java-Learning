import java.util.*;
class Main
{
	public static void main(String[] args) {
		Set <String>ns = new HashSet<String>();
		ns.add("b");
		ns.add("o");
		ns.add("y");
		ns.add("s");
		ns.add("s");
		for(String s : ns)
		{
		    System.out.print(s+" ");
		}
	}
}