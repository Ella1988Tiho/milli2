public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1200;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = account + deposit + bonus;
        System.out.println("Итоговая сумма на счету:");
        System.out.println(totalAmount);
        System.out.println("В том числе бонусные рубли за пополнение:");
        System.out.println(bonus);
    }
}

