import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String diff="";
        String action="";
        int hp=125;
        int atk=15;
        int enemyHp=0;
        int enemyAtk=0;
        int enemyAction=0;
        boolean isBlocked=false;
        boolean enemyIsBlocked=false;

        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Fight Gaem");
        System.out.print("Please pick your difficulty:(e=easy, m=medium) ");
        diff=s.nextLine();
        Difficulty yourDiff=new Difficulty(diff);
        enemyHp=yourDiff.getEnemyHp();
        enemyAtk=yourDiff.getEnemyAtk();

        while (enemyHp>0 && hp>0){
            System.out.print("What action:(a=attack,b=block)? ");
            action=s.nextLine();
            System.out.println("---------------------");
            System.out.println("Your current hp: "+hp);
            System.out.println("Enemy's hp is  "+enemyHp);
            if (action.equals("a")){
                enemyHp=enemyHp-atk;
                System.out.println("After your attack the enemy's hp is now "+enemyHp);
            }
            if (action.equals("b")){
                System.out.println("You blocked, you will take less damage from the next attack.");
                isBlocked=true;

            }
            yourDiff.round();

            }
        }
        }




