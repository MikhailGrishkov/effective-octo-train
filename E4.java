import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //Даны три вещественных числа a,b,c.
        // Проверить:1.выполняется ли неравенство a<b<c;
        // 2.выполняется ли неравенство b>a>c.
        System.out.println("Введите числа");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        if ((a<b)&&(b<c)) {
            System.out.println("Неравенство выполняется");
        } else {
            System.out.println("Неравенство  невыполняется");
        }
        if ((b>a)&&(a<c)) {
            System.out.println("Неравенство выполняется");
        } else {
            System.out.println("Неравенство  невыполняется");
        }

    }
}
