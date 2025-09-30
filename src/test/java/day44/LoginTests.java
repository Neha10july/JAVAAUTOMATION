package day44;

import org.apache.logging.log4j.core.config.AppenderRef;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority =1 , groups = {"sanity"})
    void loginByEmail(){
        System.out.println("This is Login by Email...");
    }

    @Test(priority =2 , groups = {"sanity"})
    void loginByFacebook(){
        System.out.println("This is Login by Facebook...");
    }

    @Test(priority =3 , groups = {"san" +
            "ity"})
    void loginByTwitter(){
        System.out.println("This is Login by Twitter...");
    }
}
