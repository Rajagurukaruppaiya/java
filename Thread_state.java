class classX extends Thread
{
    public void run()
    {
        System.out.println("start Thread X...");
        for(int i=1; i<=5; i++)
        {

System.out.println("from Thread Y:i="+i);
}
        }
        System.out.println("...Exit Thread X");
    }
}

class classY extends Thread
{
    public void run()
    {
        System.out.println("start Thread Y...");
        for(int j=1; j<=5; j++)
        {

System.out.println("from Thread Y:j="+j);
if(j==2) wait(1000);

        }
        System.out.println("...Exit Thread Y");
    }
}


class classZ extends Thread
{
    public void run()
    {
        System.out.println("start Thread Z...");
        for(int j=1; j<=5; j++)
        {

System.out.println("from Thread Z:j="+k);
if(j==2)
{
try{
sleep(1000);
 }
 catch (Exception e){}
}

       }
        System.out.println("...Exit Thread C");
    }
}

public class ThreadState extends Thread
{
public static void main(String args[])
{
    classX t1 = new classX ();
    t1.yield();
    classY t2 = new classY ();
    classZ t3 = new classZ ();
    t1.start();t2.start();t3.start();
}
}