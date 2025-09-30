package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

    @Test
    void test_hardassertions(){
        System.out.println("testig..........");
        System.out.println("testig..........");

        Assert.assertEquals(1,1); // hard assertion

        System.out.println("testig..........");
        System.out.println("testig..........");
    }
    @Test
    void test_softassertion(){
        System.out.println("testig..........");
        System.out.println("testig..........");

        SoftAssert sa= new SoftAssert();// soft assertion
        sa.assertEquals(1,1);

        System.out.println("testig..........");
        System.out.println("testig..........");
        sa.assertAll(); // mandatory
    }
}
