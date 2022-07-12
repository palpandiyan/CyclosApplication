package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.pommod.Dashboardpage;
import org.pommod.Homepage;

public class Page_Object_manager123 {

	public WebDriver driver;
	private Homepage hp;
	
	private  Dashboardpage  dp;
	
	private Homepage get_Instance_Hp() {
		
		
		Homepage  hp = new Homepage(driver);
		return hp;

	}

	}


