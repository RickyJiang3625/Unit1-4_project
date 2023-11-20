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
        String whatHappen="";
        boolean isHealing=false;


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
            System.out.println();
            System.out.print("What action:(a=attack, b=block, h=heal)? ");
            action = s.nextLine();
            System.out.println("---------------------");
            System.out.println("Your current hp: " + hp);
            System.out.println("Enemy's hp is  " + enemyHp);
            System.out.println();
            if (action.equals("a")) {
                if (allStats.getIsEnemyIsBlocked()) {
                    enemyHp = enemyHp - halfYourAtk;
                }
                else {
                    enemyHp = enemyHp - atk;
                }
                System.out.println("You have attacked and dealt "+atk+" damage");
                isBlocked=false;
                allStats.isBlocking(isBlocked);
                isHealing=false;
                allStats.isHealing(isHealing);
            }

            if (action.equals("b")) {
                System.out.println("You blocked, you will take less damage from the next attack.");
                isBlocked=true;
                allStats.isBlocking(isBlocked);
                isHealing=false;
                allStats.isHealing(isHealing);

            }
            if (action.equals("h")){
                System.out.println("You have healed for 20 hp. You cannot go over 200 hp");
                isHealing=true;
                allStats.isHealing(isHealing);
                isBlocked=false;
                allStats.isBlocking(isBlocked);

            }
            Fight updateEnemyHp=new Fight(hp, atk, enemyHp, enemyAtk);
            allStats.round();
            whatHappen=allStats.getWhatHappen();
            System.out.println(whatHappen);
            hp=allStats.getHp();
            System.out.println(updateEnemyHp.toString());
        }
        if (enemyHp<=0){
            System.out.println("You Win!!!");
        }
        if(hp<=0){
            System.out.println("You Lost :(((((((((");
        }
    }
}










