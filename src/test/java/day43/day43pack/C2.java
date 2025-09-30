package day43.day43pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
    @Test
    void xyz(){
    System.out.println("This is abc form C2...");
    }
    @AfterTest
    void at(){
        System.out.println("This is AfterTest method...");
    }
}
