public class Main {
    public static void main(String[] args) {

        int onAccount = 100; // на счету
        int refill = 300; // сумма пополнения

        int bonus = refill / 100; // бонусы
        int sum; // итоговая сумма

        if (refill > 1000) {
            sum = onAccount + refill + bonus; // если сумма пополнения больше 1000, то начисляем бонусы
            System.out.println("Бонус: " + bonus);
        } else {
            sum = onAccount + refill; // иначе - не начисляем
            System.out.println("Бонус: 0");
        }

        System.out.println("Итоговая сумма: " + sum);
    }
}