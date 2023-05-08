package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub 
		String host ="localhost";
		String port ="3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host +":"+ port +"/demo" , "root", "Sagar@2297");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(" select * from credentials where scenario='zerobalancecard'");
		while(rs.next()) {
			System.setProperty("webdriver.gecko.driver", "./javasel/geckodriver.exe");

	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.salesforce.com/in/form/sem/salesforce-crm/?d=7013y000002hbRLAAY&nc=7013y000002RHs6AAG&utm_source=google&utm_medium=sem&utm_campaign=in_br_alllobcon&utm_content=exact_7013y000002k1z5aakbr-google-/form/sem/salesforce-crm/&ef_id=Cj0KCQjw8qmhBhClARIsANAtbocA-F0Tx3JqIvjcQl3ssw0Bfc7L0sAkIyS0yxXW40m-ZQgDTA2iT4IaAr-iEALw_wcB:G:s&s_kwcid=AL!4720!3!592749491004!e!!g!!salesforce&&ev_sid=3&ev_ln=salesforce&ev_lx=kwd-94920873&ev_crx=592749491004&ev_mt=e&ev_n=g&ev_ltx=&ev_pl=&ev_pos=&ev_dvc=c&ev_dvm=&ev_phy=9062009&ev_loc=&ev_cx=16895847353&ev_ax=137218384684&ev_efid=Cj0KCQjw8qmhBhClARIsANAtbocA-F0Tx3JqIvjcQl3ssw0Bfc7L0sAkIyS0yxXW40m-ZQgDTA2iT4IaAr-iEALw_wcB:G:s&url=!https://clickserve.dartsearch.net/link/click?lid=43700074078535017&ds_s_kwgid=58700008151233901&gclid=Cj0KCQjw8qmhBhClARIsANAtbocA-F0Tx3JqIvjcQl3ssw0Bfc7L0sAkIyS0yxXW40m-ZQgDTA2iT4IaAr-iEALw_wcB&gclsrc=aw.ds");
	driver.findElement(By.name("UserFirstName")).sendKeys(rs.getString("username"));
	driver.findElement(By.name("UserLastName")).sendKeys(rs.getString("password"));
		 	     
		

	}

}
}
