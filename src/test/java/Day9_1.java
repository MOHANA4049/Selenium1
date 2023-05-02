import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day9_1 {
  @Test(dataProvider="dp",priority=1)
  public void add(int num1,int num2,int expected) {
	  int actual=num1+num2;
	  Assert.assertEquals(expected,actual);
  }
  @Test(dataProvider="dp1",priority=2)
  public void sub(int num1,int num2,int expected) {
	  int actual=num1-num2;
	  Assert.assertEquals(expected,actual);
  }
  @Test(dataProvider="dp2",priority=3)
  public void mul(int num1,int num2,int expected) {
	  int actual=num1*num2;
	  Assert.assertEquals(expected,actual);
  }
  @Test(dataProvider="dp2",priority=4)
  public void div(int num1,int num2,int expected) {
	  int actual=num1*num2;
	  Assert.assertEquals(expected,actual);
  }
  @DataProvider
  public Object[][]dp()
  {
	  return new Object[][] {
		  new Object[] {1,2,3},
		  new Object[] {2,3,5},
		  new Object[] {4,2,6}	  
	  };
  }
  @DataProvider
  public Object[][]dp1()
  {
	  return new Object[][] {
		  new Object[] {3,2,1},
		  new Object[] {5,3,2},
		  new Object[] {4,2,2}	  
	  };
  }
  @DataProvider
  public Object[][]dp2()
  {
	  return new Object[][] {
		  new Object[] {3,2,6},
		  new Object[] {5,3,15},
		  new Object[] {4,2,8}	  
	  };
  }
  @DataProvider
  public Object[][]dp3()
  {
	  return new Object[][] {
		  new Object[] {3,9,0},
		  new Object[] {5,5,1},
		  new Object[] {4,2,2}	  
	  };
  }
}
