package TextbookExamples;
import java.lang.String;
import java.util.Scanner;
public class HelloWorldRunner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String userMessage = userInput.nextLine();
        HelloWorldClass hello = new HelloWorldClass();
        hello.sayHello(userMessage);
    }
}
