public class Main {
    public static void main(String[] args) {

        int sumOnAccaunt = 100;
        int addSum = 1000;

        if(addSum > 1000) {
            int bonusSum = addSum/100;
            System.out.println("Сумма бонусов " + bonusSum);
            int finalSumOnAccaunt = bonusSum + sumOnAccaunt + addSum;
            System.out.println("Сумма на балансе " + finalSumOnAccaunt);

        } else {

            int finalSumOnAccaunt = sumOnAccaunt + addSum;
            System.out.println("Сумма на балансе " + finalSumOnAccaunt);
            
        }





        System.out.println("Hello world!");
    }
}