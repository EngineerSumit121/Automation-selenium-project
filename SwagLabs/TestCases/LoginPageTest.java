package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
	          
  //successful login with valid credentials
  @Test(priority=1)

  public void verifyLogin() {
	  lp.doLogin("standard_user","secret_sauce");
	  
	  
	  
	  
  }
//unsuccessful login with invalid credential
  @Test(priority=3)
  public void verifyInvalidLogin()
  
  {
	 
	  lp.doLogin("staooodard_user", "settret_sauce");
  }  
	  
	 
	
	  {
		  
	  }
	 
  }
  
   
  
  
  
  
  
  
  
  
  
  
