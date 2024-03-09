package HomeWork11;
import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;
public class task01 extends TestBase {


    @Test
    public void test() {
        //Go to URL: https://facebook.com
        driver.get("https://facebook.com");

        Set<Cookie> cookies = driver.manage().getCookies();


        for (Cookie cookie: cookies){
            System.out.println(cookie);
        }
        //Get Cookie.
        Cookie secCookie = driver.manage().getCookieNamed("vegetable");
        System.out.println("secCookie = " + secCookie);
        System.out.println("------------------------------");

        System.out.println("secCookie.getValue() = " + secCookie.getValue()); // value of the cookie
        System.out.println("------------------------------");
    }
}