package day43;

import org.testng.annotations.*;

/*
1)Login -- @BeforClass
2)Search -- @Test
3)Advanced search -- @Test
4)Logout ---AfterClass
 */
public class AnnotationDemo2 {
    @BeforeClass
    void login(){
        System.out.println("This is login......");
    }
    @AfterClass
    void logout(){
        System.out.println("Logout Successfully......");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("THis is search....");
    }
    @Test(priority = 2)
    void advancedsearch(){
        System.out.println("Advanced Search........");
    }

}
