package thread;
import java.util.*;


class stackpush  extends zthreadnew implements Runnable
{
 
public void run()
{
for(int i=1;i<=10;i++)
{
   System.out.println("pushing and The Size of Stack is "+s.size());
   s.push(i);
}
}
}

class stackpush2  extends zthreadnew implements Runnable
{
 
public void run()
{
for(int i=1;i<=10;i++)
{
   System.out.println("pushing and The Size of Stack is "+s.size());
   s.push(i);
}
}
}

class stackpop extends zthreadnew implements Runnable
{ 
public void run() 
{
if(s.isEmpty())
{
	System.out.println("The Stack is Empty"); 	
}
  else 
{
	  
	  for(int i=1;i<=10;i++)
		{
		System.out.println("poping"+s.peek());
		s.pop();
		s.
		}   
}
}
}

class zthreadnew
{
 static Stack<Integer>s=new Stack<>();
public static void main(String[] args)
{
stackpush pp= new stackpush();
stackpush2 pp2= new stackpush2();
stackpop po= new stackpop();
Thread p= new Thread(pp);
Thread o= new Thread(po);
Thread p2=new Thread(pp2);
p.start();
o.start();
p2.start();
 
}
}
