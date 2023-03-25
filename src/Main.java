public class Main {
    public static void main(String[] args) {
        int initialMobileAccount = 100;
        int topUpMobile = 500;

        int bonus;
        if (topUpMobile >= 500) {
            bonus = topUpMobile / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Колличество бонусных рублей:" + bonus);
        int finalScore = initialMobileAccount + topUpMobile + bonus;
        System.out.println("Итоговый счет:" + finalScore);
    }
}