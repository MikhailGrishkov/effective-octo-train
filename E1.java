import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
      //В чемпионате по футболу команде за выигрыш дается 3 очка,
        // за проигрыш—0,за ничью—1. Известно количество очков,
        // полученных командой за игру.
        // Определить словесный результат игры (выигрыш,проигрыш или ничья).
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество очков");
        int score = sc.nextInt();
        sc.close();

        if (score == 3) {
            System.out.println("Выйгрыш");
        } else if (score == 1) {
            System.out.println("Ничья");
        }else if(score == 0) {
            System.out.println("Проигрыш");
        }
        else {
            System.out.println("Не правильное количество очков");
        }
    }
}
