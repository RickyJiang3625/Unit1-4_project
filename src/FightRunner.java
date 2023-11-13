import java.util.Scanner;
public class FightRunner {
    public static void main(String[] args) {
        String diff = "";
        String action = "";
        int hp = 125;
        int atk = 15;
        int enemyHp = 0;
        int enemyAtk = 0;
        int enemyAction = 0;
        String name = "";
        boolean enemyIsBlocked = false;
        boolean isBlocked = false;


        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fight Game");
        //System.out.print("Please enter name: ");
        //name=s.nextLine();
        System.out.print("Please pick your difficulty:(e=easy, m=medium) ");
        diff = s.nextLine();
        Fight yourDiff = new Fight(diff);
        enemyHp = yourDiff.getEnemyHp();
        enemyAtk = yourDiff.getEnemyAtk();
        Fight allStats = new Fight(hp, atk, enemyHp, enemyAtk);


        while (enemyHp > 0 && hp > 0) {
            int halfEnemyAtk = enemyAtk / 2;
            int halfYourAtk = atk / 2;
            System.out.print("What action:(a=attack,b=block)? ");
            action = s.nextLine();
            System.out.println("---------------------");
            System.out.println("Your current hp: " + hp);
            System.out.println("Enemy's hp is  " + enemyHp);
            if (action.equals("a")) {
                if (allStats.getIsEnemyIsBlocked()) {
                    enemyHp = enemyHp - halfYourAtk;
                } else {
                    enemyHp = enemyHp - atk;
                }
                System.out.println("After your attack the enemy's hp is now " + enemyHp);
                isBlocked=false;
                allStats.isBlocking(isBlocked);
            }

            if (action.equals("b")) {
                System.out.println("You blocked, you will take less damage from the next attack.");
                isBlocked=true;
                allStats.isBlocking(isBlocked);

            }
            allStats.round();
            hp=allStats.getHp();
        }
    }
}










