public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 1000;
        int bonus = 0;
        if (y >= 1000) {
            bonus = y / 100;
        }
        System.out.println("Итоговый счет:" + (x+y));
        System.out.println("Количество бонусных рублей:" + bonus);

    }
}
