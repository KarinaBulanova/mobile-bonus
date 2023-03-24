public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 500;
        int bonus = y/100;
        int total = x+y+bonus;

        if (y>=500) {
            System.out.println("Колличество бонусных рублей:" +bonus);
        } else {
            System.out.println("Колличество бонусных рублей: 0 ");
        }

        System.out.println("Итоговый счет:" +total);
    }
}