public class Main {
    public static void main(String[] args) {
        int account = 0;
        int refill = 1000;
        int bonus = 0;
        if (refill >= 1000) {
            bonus = refill / 100;
        }
        System.out.println("Итоговый счет:" + (account+refill));
        System.out.println("Количество бонусных рублей:" + bonus);

    }
}
