public class Main {
    public static void main(String[] args) {

        int onAccount = 469; // на счету
        int refill = 1200; // сумма пополнения

        int bonus = refill / 100; // бонусы
        int sum; // итоговая сумма

        if (refill > 1000) {
            sum = onAccount + refill + bonus; // если сумма пополнения больше 1000, то начисляем бонусы
        } else {
            sum = onAccount + refill; // иначе - не начисляем
        }
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговая сумма: " + sum);
    }
}