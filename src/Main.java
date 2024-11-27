import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\t\t*** Добро пожаловать в калькулятор чисел!***");
        System.out.print("Ведите число: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("Ведите число: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a + "+"+b+"="+(a+b));
        System.out.println(a + "-"+b+"="+(a-b));
        System.out.println(a + "*"+b+"="+(a*b));
        System.out.println(a + "/"+b+"="+(a/b));
        System.out.println(a + "%"+b+"="+(a%b));
    }
}