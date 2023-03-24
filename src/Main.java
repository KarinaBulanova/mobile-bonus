public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 300;

         int bonus;
        if (y>=500) {
            bonus = y/100;
        } else {
            bonus = 0;
        }
        System.out.println("Колличество бонусных рублей:" +bonus);
        int total = x+y+bonus;
        System.out.println("Итоговый счет:" +total);
    }
}