import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        //Дано двузначное число. Определить:остаток от деления десятков на единицы,
        // результат деления единиц на десятки
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        int a = (number/ 10) ; //десятки
        int b = number - a * 10; //единицы
        int x = (a% b);
        int y = (b% a);


        System.out.println("Остаток от десятков на единицы : "  + x);
        System.out.println("Остаток от деления единиц на десятки: " + y);

    }
}