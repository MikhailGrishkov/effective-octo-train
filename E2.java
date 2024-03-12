import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
    //Даны радиус круга и сторона квадрата.У какой фигуры площадь больше?
        //S = pi*r^2 площадь круга
        // S = a^2  площадь квадрата
        System.out.println("Введите радиус");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextShort();
        double Sc = Math.PI* Math.pow(r, 2);

        System.out.println("Введите длину стороны квадрата");
        Scanner sn = new Scanner(System.in);
        double a = sn.nextShort();
        double Ss = Math.pow(a,2);

        System.out.println("Площадь круга  = " + Sc);
        System.out.println("Площадь квадрата  = " + Ss);

        if (Sc > Ss) {
            System.out.println("Площадь круга больше");
        } else if( Sc < Ss) {
            System.out.println("Площадь квадрата больше");
        } else {
            System.out.println("Площади фигур равны");
        }


    }
}
