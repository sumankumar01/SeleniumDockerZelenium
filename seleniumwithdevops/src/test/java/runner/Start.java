package runner;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Start {

	//public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		// TODO Auto-generated method stub
     
		//System.setProperty("webdriver.chrome.driver", "D:\\jenkins\\DevOps\\src\\test\\resources\\chromedriver.exe");
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");*/
		
		
		public static void main(String []args) throws MalformedURLException, UnknownHostException, SocketException, InterruptedException
		{
		new DesiredCapabilities();
		// DesiredCapabilities dc = DesiredCapabilities.chrome();
		 DesiredCapabilities dc = DesiredCapabilities.chrome();
		 dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		    dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		    
	      /*  if (System.getProperty("browser").equals("firefox"))
	            dc = DesiredCapabilities.firefox();
*///dc.setCapability("something", true);

ChromeOptions options = new ChromeOptions();
options.addArguments("--no-sandbox");
options.setAcceptInsecureCerts(true);
options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
//options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
/*options.setCapability(CapabilityType.PLATFORM_NAME, Platfoptionsorm.WINDOWS);
options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
//options.merge(dc);

Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
for (NetworkInterface netint : Collections.list(nets))
{ Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
	for (InetAddress inetAddress : Collections.list(inetAddresses)) {
		System.out.printf("InetAddress: %s\n", inetAddress);
    }
}


InetAddress IP=InetAddress.getLoopbackAddress();
System.out.println(IP);
RemoteWebDriver  driver = new RemoteWebDriver(new URL("http://192.168.33.10:4444/wd/hub"), dc);
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(5000);
	        System.out.printf(driver.getCurrentUrl());
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(5000);
	        System.out.printf(driver.getCurrentUrl());
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(5000);
	        System.out.printf(driver.getCurrentUrl());
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(5000);
	        System.out.printf(driver.getCurrentUrl());
	        driver.get("https://stackoverflow.com/questions/50042753/how-to-build-docker-images-using-a-declarative-jenkinsfile");
	        Thread.sleep(5000);
	        System.out.printf(driver.getCurrentUrl());
	}

}
