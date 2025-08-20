import java.util.*;
abstract class Telegram
{
   abstract void send();
}
class Message extends Telegram
{
   void send()
   {
      System.out.println("Hi buddy!!");
   }
}
class Main
{
	public static void main(String[] args) 
	{
	   Message obj = new Message();
	   obj.send();
	}
}