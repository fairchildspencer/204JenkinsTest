import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] cmdLine) throws IOException {
        System.out.println("Enter a command:");

        BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        String line;
        Calculator calculator = new Calculator();
        while((line = systemIn.readLine()) != null) {
            String[] args = line.split("\\s+");

            if (args[0].equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));
            } else if (args[0].equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(args[1])));
            } else if (args[0].equals("quit")) {
                break;
            }
        }
    }
}
