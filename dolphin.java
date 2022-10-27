class kangaroo
{
void jump()
{System.out.println("jumping...");}
}
class kuttykangaroo extends kangaroo
{
void walk()
{System.out.println("walking...");}
}
class chinnakangaroo extends kuttykangaroo
{
void sleep()
{System.out.println("sleeping...");}
}
class dolphin
{
public static void  main(String args[])
{
chinnakangaroo d= new chinnakangaroo();
d.jump();
d.walk();
d.sleep();
}
}