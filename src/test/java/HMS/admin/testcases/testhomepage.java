package HMS.admin.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.FrontOffice;
import HMS.pages.homepage;
import HMS.pages.loginpage;

public class testhomepage extends testbase{
	homepage hpag;
	loginpage pobj1 = new loginpage();
	FrontOffice fo=new FrontOffice();
	//testlogin tlpag = new testlogin();
	public testhomepage()
	{
		super();
	}
	@BeforeClass
	public void startup()
	{
		setup();
		loginpage lpag = new loginpage();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		hpag=lpag.logintest(pop.getProperty("username"),pop.getProperty("password"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void checkfrtitle()
	{
		String ac=hpag.verifytitle();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String ex="Smart Hospital and Research";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Assert.assertEquals(ac, ex);
				
	}
	
	@Test(priority=2)
	public void checktext()
	{
	Assert.assertTrue(hpag.label());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	}

