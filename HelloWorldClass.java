package TextbookExamples;
import java.util.Scanner;

public class HelloWorldClass {
    public String message = "Hello World";
    public void sayHello(String userMessage) {
         System.out.println(userMessage);
        System.out.println(this.message);
    }
}
