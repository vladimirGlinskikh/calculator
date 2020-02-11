import calculator.Context;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to integer Calculator");
        Context calculator = new Context();

        while (true) {
            char key = (char) System.in.read();
            if (key >= ' ') {
                calculator.press(key);
                System.out.println(calculator);
            }
        }
    }
}
