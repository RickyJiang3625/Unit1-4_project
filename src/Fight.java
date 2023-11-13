import java.util.Scanner;

public class Fight {
    private int enemyHp;
    private int enemyAtk;
    private int hp;
    private int atk;
    private boolean isBlocked;
    private boolean enemyIsBlocked;



    public Fight(String diff) {

        if (diff.equals("e")){
        enemyHp=100;
        enemyAtk=10;
        }
        else if (diff.equals("m")){
        enemyHp=150;
        enemyAtk=20;
        }
    }
    public Fight(int yourHp,int yourAtk,int enemyHp,int enemyAtk) {
    hp=yourHp;
    atk=yourAtk;
    this.enemyHp=enemyHp;
    this.enemyAtk=enemyAtk;
    }
    public int getEnemyHp() {
        return enemyHp;
    }

    public int getEnemyAtk() {
        return enemyAtk;
    }
    public int getHp(){
        return hp;
    }
    public boolean getIsEnemyIsBlocked(){
        return enemyIsBlocked;
    }
    public void isBlocking (boolean block){
        if (block){
            isBlocked=true;
        }
        else{
            isBlocked=false;
        }
    }
    Scanner scanner=new Scanner(System.in);

    public void round(){
    int halfEnemyAtk=enemyAtk/2;
    int halfYourAtk=atk/2;
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

        }}



