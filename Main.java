import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int num1  = 27;
        int num2  = 5;
        int sum1 = num1 / num2;
        int sum2 = num1 % num2;
        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println("Завдання 2");

        int num =  57;
        int a = num / 10;
        int b = num % 10;
        int sum = a + b ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);

        System.out.println("Завдання 3");

        double n = 7.9;
        System.out.println(Math.round(n));



    }
}