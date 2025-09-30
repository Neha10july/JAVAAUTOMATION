package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1)Login -- @BeforMehtod
2)Search -- @Test
3)Logout ---@AfterMethod
4)Login
5)Advanced search -- @Test
6)Logout
 */
public class AnnotationDemo1 {
    @BeforeMethod
    void login(){
        System.out.println("This is login......");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("THis is search....");
    }
    @Test(priority = 2)
    void advancedsearch(){
        System.out.println("Advanced Search........");
    }
    @AfterMethod
    void logout(){
        System.out.println("Logout Successfully......");
    }
}
