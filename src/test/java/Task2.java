import org.testng.annotations.Test;

import junit.framework.Assert;


public class Task2 {
	int a=10,b=20,c;
@Test(priority=1)
public void add()
{
	int c=a+b;
	Assert.assertEquals(c, 30);
}
@Test(priority=2)
public void subtract()
{
	int c=a-b;
	Assert.assertEquals(c, -10);
}
@Test(priority=3)
public void multiply()
{
	int c=a*b;
	Assert.assertEquals(c, 200);
}
@Test(priority=4)
public void divide()
{
	int c=a/b;
	Assert.assertEquals(c, 0);
}
}
