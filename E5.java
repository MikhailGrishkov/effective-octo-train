import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        //Даны два числа. Если квадратный корень из второго числа меньше
        // первого числа,то увеличить второе число в пять раз.
        System.out.println("Введите числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       // int sqrt = Math.sqrt(b);
        if(Math.sqrt(b)< a){
            b = b*5;
        } else {
            b=b;
        }
        System.out.println("Второе число равно " +b);

    }
}
