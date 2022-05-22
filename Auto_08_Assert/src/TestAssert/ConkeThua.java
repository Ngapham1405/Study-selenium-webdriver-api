package TestAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ConkeThua extends Cha {

	        @Test(priority = 1)
	        public void RunTest() {

	            driver.get("https://anhtester.com");

	            String expectedTitle = "Anh Tester";
	            String originalTitle = driver.getTitle();

	            System.out.println("*** Checking For The Title ***");

	            //Hard Assert
	          //  Assert.assertEquals(originalTitle, expectedTitle);// Fail thì sẽ không chạy câu lệnh tiếp theo nữa
	         //   System.out.println("*** sai***");
	            
	            //Soft Assert
	            SoftAssert softAssert=new SoftAssert(); //Fail thì sẽ vẫn chạy câu lệnh tiếp theo nữa
	            softAssert.assertEquals(originalTitle, expectedTitle);
	            driver.get("https://anhtester.com/blog/selenium-java/selenium-java-bai-11-nhung-method-assert-do-testng-cung-cap");


	        }
	    }

