package day43.day43pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
    void test(){
        //Assert.assertEquals("XYZ", "XYZ1");
        //Assert.assertEquals("123", "456");
        //Assert.assertEquals("123",256);
        //Assert.assertEquals("XYZ", 123);
        //Assert.assertEquals(123, "XYZ1");

        //Assert.assertNotEquals(123,123); //false
        //Assert.assertNotEquals(123,345); //true

        //Assert.assertTrue(true); //true
        //Assert.assertTrue(false); // false

        //Assert.assertTrue(1==2); // fail
       //Assert.assertTrue(1==1); // passed

        //Assert.assertFalse(1==2); // Passed
        //Assert.assertFalse(1==1); // Failed

        Assert.fail();
    }
}
