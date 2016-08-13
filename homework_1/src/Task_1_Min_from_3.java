/**
 * Created by Alex Novikov on 12.08.2016.
 *
 * Найти минимальное из 3х чисел
 */
public class Task_1_Min_from_3 {

    public static void main(String[] args) {

        int x = 28;
        int y = 25;
        int z = 18;

        if (x < y && x < z)
            System.out.println("Min is " + x);
            else if (y < x && y < z)
            System.out.println("Min is " + y);
               else System.out.println("Min is " + z);
    }
}
