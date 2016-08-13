/**
 * Created by Alex Novikov on 13.08.2016.
 *
 * Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно,
 * что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он
 * получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
 *
 * Входные данные для задач можно указывать просто переменными в коде, например, для последней
 * задачи:
 *
 * int days = 18;
 * int pricePerDay = 40;
 * и т.д.
 */
public class Task_7_Total_Rent {

    public static void main(String[] args) {

        int days = 20;
        int pricePerDay = 40;

        int totalRent = days * pricePerDay;

        if (days > 5 && days <= 7)
            totalRent = totalRent - 20;

        if (days > 7)
            totalRent = totalRent - 50;

        System.out.println("The rent for " + days + " days is " + totalRent + " UAH.");
    }
}
