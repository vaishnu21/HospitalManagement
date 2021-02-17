package HMS.admin.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import HMS.base.testbase;
import HMS.pages.FrontOffice;
import HMS.pages.addvisitorpage;
import HMS.pages.homepage;
import HMS.pages.loginpage;

public class TestFrontOffice extends testbase {
	homepage hpag;
	FrontOffice fo;
	addvisitorpage adv;
public TestFrontOffice()
{
	super();
}
@Test
public void startup()
{
	setup();
	loginpage lpag = new loginpage();
	hpag=lpag.logintest(pop.getProperty("username"),pop.getProperty("password"));
	fo=hpag.ClickFrontOffice();
	Assert.assertTrue(fo.VerifyFofc());
	adv=fo.ClickVisitorBook();
}
}
