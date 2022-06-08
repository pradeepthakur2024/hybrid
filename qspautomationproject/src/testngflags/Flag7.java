package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag78 {
  @Test(groups="FUNCTIONAL")
  public void fT1() {

  Reporter.log("ft1",true);
  }
  @Test(groups="INTEGRATION")
  public void it1()
  {
	  Reporter.log("it1",true);
  }
  @Test(groups="SMOKE")
  public void st1() {
	  Reporter.log("st1",true);
  }
  //_--------------------------
  @Test(groups="FUNCTIONAL")
  public void fT2() {

  Reporter.log("ft2",true);
  }
  @Test(groups="INTEGRATION")
  public void it2()
  {
	  Reporter.log("it2",true);
  }
  @Test(groups="SMOKE")
  public void st2() {
	  Reporter.log("st2",true);
  }
//-----------------------
  
  @Test(groups="FUNCTIONAL")
  public void fT3() {

  Reporter.log("ft3",true);
  }
  @Test(groups="INTEGRATION")
  public void it3()
  {
	  Reporter.log("it3",true);
  }
  @Test(groups="SMOKE")
  public void st3() {
	  Reporter.log("st3",true);
  }

  //---------------------------
  
  @Test(groups="FUNCTIONAL")
  public void fT4() {

  Reporter.log("ft4",true);
  }
  @Test(groups="INTEGRATION")
  public void it4()
  {
	  Reporter.log("it4",true);
  }
  @Test(groups="SMOKE")
  public void st4() {
	  Reporter.log("st4",true);
  }
//-----------------------------
  
  @Test(groups="FUNCTIONAL")
  public void fT5() {

  Reporter.log("ft5",true);
  }
  @Test(groups="INTEGRATION")
  public void it5()
  {
	  Reporter.log("it5",true);
  }
  @Test(groups="SMOKE")
  public void st5() {
	  Reporter.log("st5",true);
  }
//---------------------
  
  @Test(groups="FUNCTIONAL")
  public void fT6() {

  Reporter.log("ft6",true);
  }
  @Test(groups="INTEGRATION")
  public void it6()
  {
	  Reporter.log("it6",true);
  }
  @Test(groups="SMOKE")
  public void st6() {
	  Reporter.log("st6",true);
  }

  
  
}
