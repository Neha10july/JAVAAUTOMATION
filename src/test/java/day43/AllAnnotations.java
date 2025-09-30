package day43;

import org.testng.annotations.*;

public class AllAnnotations {
    @BeforeSuite
    void bs(){
        System.out.println("This is before suite...");
    }

    @AfterSuite
    void as(){
        System.out.println("This is After suite...");
    }

    @BeforeTest
    void bt(){
        System.out.println("This is before test...");
    }

    @AfterTest
    void at(){
        System.out.println("This is after test...");
    }

    @BeforeClass
    void bc(){
        System.out.println("This is before class...");
    }

    @AfterClass
    void ac(){
        System.out.println("This is after class...");
    }

    @BeforeMethod
    void bm(){
        System.out.println("This is before Method...");
    }

    @AfterMethod
    void am(){
        System.out.println("This is after Method...");
    }

    @Test (priority = 1)
    void login(){
        System.out.println("This is Login .....");
    }
    @Test(priority = 2)
    void logout(){
        System.out.println("This is Logout...........");
    }
}
