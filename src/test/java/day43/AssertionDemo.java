package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
    @Test
    void titleTest(){
        String exp_title = "Openshop";
        String act_title = "Opencart";
       /* if (exp_title.equals(act_title)){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }*/

        //Assert.assertEquals(exp_title,act_title);

        if (exp_title.equals(act_title)){
            System.out.println("test passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("test failed");
            Assert.assertTrue(false);
        }
    }
}
