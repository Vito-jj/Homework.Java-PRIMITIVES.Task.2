public class Main {

    public static void main(String[] args) {

        int startingBalance = 100; // Начальный баланс счета
        int replenishmentAmount = 1200; // Сумма пополнения счета

        int totalBalanceWithoutBonus = startingBalance + replenishmentAmount; // Общий баланс до расчета бонуса

        int receivedFunds;
        if (totalBalanceWithoutBonus > 1000) {
            receivedFunds = replenishmentAmount / 100 + totalBalanceWithoutBonus;
        } else {
            receivedFunds = totalBalanceWithoutBonus;
        }

        System.out.println(("Баланс вашего счета_") + (receivedFunds));
    }
}
