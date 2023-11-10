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
        String name="";
        boolean enemyIsBlocked = false;
        boolean isBlocked=false;



        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Fight Game");
        //System.out.print("Please enter name: ");
        //name=s.nextLine();
        System.out.print("Please pick your difficulty:(e=easy, m=medium) ");
        diff=s.nextLine();
        Runner yourDiff=new Runner(diff);
        enemyHp=yourDiff.getEnemyHp();
        enemyAtk=yourDiff.getEnemyAtk();
        //Difficulty myStats=new Difficulty(hp,atk);

        while (enemyHp>0 && hp>0){
            int halfEnemyAtk=enemyAtk/2;
            int halfYourAtk=atk/2;

            System.out.print("What action:(a=attack,b=block)? ");
             action = s.nextLine();
            System.out.println("---------------------");
            System.out.println("Your current hp: "+hp);
            System.out.println("Enemy's hp is  "+enemyHp);
            if (action.equals("a")){
                if(enemyIsBlocked){
                    enemyHp=enemyHp-halfYourAtk;
                }
                else{
                    enemyHp=enemyHp-atk;
                }
                System.out.println("After your attack the enemy's hp is now "+enemyHp);
                isBlocked=false;
            }

            if (action.equals("b")){
                System.out.println("You blocked, you will take less damage from the next attack.");
                isBlocked=true;

            }
            if(enemyHp>0){
                enemyAction = (int) (Math.random()*10);
                if (enemyAction<=5){
                    if (isBlocked){

                        hp=hp-halfEnemyAtk;
                        System.out.println("Your enemy has attacked and dealt "+halfEnemyAtk+" damage.");
                        enemyIsBlocked=false;

                    }
                    else {
                        hp=hp-enemyAtk;
                        System.out.println("Your enemy has attacked and dealt "+enemyAtk+" damage.");
                    }
                    System.out.println("After the enemy's attack your hp is now : "+hp);
                    System.out.println("---------------------");
                    enemyIsBlocked=false;

                }
                else {
                    System.out.println("Your enemy has blocked.");
                    enemyIsBlocked=true;
                    System.out.println("---------------------");



                }

            }

        }
        if(enemyHp<=0){
            System.out.println("YOU WIN");
        }
        if (hp<=0){
            System.out.println("YOU LOSE");
        }
    }}









