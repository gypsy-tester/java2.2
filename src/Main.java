public class Main {
    public static void main(String[] args) {

        int balance0 = 2000; //баланс начальный
        int refill = 300; //бонусное пополнение
        int bonusStep = 100; //шаг бонуса
        int bonus = refill / bonusStep; //бонусные рубли

        if (refill > 1000) {
            System.out.println("Итоговый счет: " + (bonus + balance0 + refill) + " руб");
        } else {
            System.out.println("Итоговый счет: " + (balance0 + refill) + " руб");
            System.out.println("Для получения бонусов пополните счет на сумму более 1000 рублей. Хорошего дня)");
        }

        if (refill > 1000) {
            System.out.println("Количество бонусных рублей: " + bonus);

        }
    }

}
