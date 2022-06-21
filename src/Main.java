public class Main {
    public static void main(String[] args) {

        int balans = 0;
        int replenishmentAmount = 1100;
        int bonus = replenishmentAmount / 100;

        if (replenishmentAmount > 1000) {
            System.out.println("Ваш баланс: " + (balans + replenishmentAmount + bonus));
            System.out.println("Количество бонусных рублей: "+ bonus);
        } else {
            System.out.println("Ваш баланс: " + (balans + replenishmentAmount));
            System.out.println("Количество бонусных рублей: 0");
        }
    }
}
