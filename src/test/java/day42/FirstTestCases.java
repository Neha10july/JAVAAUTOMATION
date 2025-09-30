package day42;

import org.testng.annotations.Test;

/*1)Open the application.
  2)Login
  3)Logout*/
public class FirstTestCases {
    @Test(priority=100)
    void logout(){
        System.out.println("Logout the application.");
    }

    @Test(priority=50)
    void login(){
        System.out.println("Login the application.");
    }

    @Test(priority=10)
    void openapp()
    {
        System.out.println("Launch the application");
    }

}
