import java.util.Scanner;

public class Runner {
    private int enemyHp;
    private int enemyAtk;
    private int hp=125;
    // default player values
    private boolean isBlocked;
    private int atk=15;
    //default player values
    private boolean enemyIsBlocked;



    public Runner(String diff) {

        if (diff.equals("e")){
        enemyHp=100;
        enemyAtk=10;
        }
        else if (diff.equals("m")){
        enemyHp=150;
        enemyAtk=20;
        }
    }
    //public Difficulty(int yourHp,int yourAtk){
        //hp=yourHp;
        //atk=yourAtk;
    //}




    public int getEnemyHp() {
        return enemyHp;
    }

    public int getEnemyAtk() {
        return enemyAtk;
    }
    public int getHp(){
        return hp;
    }
    Scanner scanner=new Scanner(System.in);

    public void round(){
    int halfEnemyAtk=enemyAtk/2;
    int halfYourAtk=atk/2;
    String userAction="What action:(a=attack,b=block)? ";
        while (enemyHp>0 && hp>0){

            System.out.println("What action:(a=attack,b=block)? ");
            String action = scanner.nextLine();
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


        int enemyAction=0;
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


