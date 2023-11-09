import java.util.Scanner;

public class Difficulty {
    private String difficulty;
    private int enemyHp;
    private int enemyAtk;
    private int hp;
    private boolean isBlocked;
    private int atk;



    public Difficulty(String diff) {
        difficulty=diff;

        if (difficulty.equals("e")){
        enemyHp=100;
        enemyAtk=10;
        }
        else if (difficulty.equals("m")){
        enemyHp=150;
        enemyAtk=20;
        }
    }
    public Difficulty(boolean block){
        isBlocked=block;
    }
    public Difficulty(int yourHp, int yourAtk){
        hp=yourHp;
        atk=yourAtk;
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

    public void round(){

        boolean enemyIsBlocked=false;
        int enemyAction=0;
        if(enemyHp>0){
        enemyAction = (int) (Math.random()*10);
        if (enemyAction<=5){
            if (isBlocked){
                enemyAtk=enemyAtk/2;
                hp=hp-enemyAtk;
                System.out.println("Your enemy has attacked and dealt "+enemyAtk+" damage.");
                enemyAtk=enemyAtk*2;
            }
            else {
                hp=hp-enemyAtk;
                System.out.println("Your enemy has attacked and dealt "+enemyAtk+" damage.");
            }
            System.out.println("After the enemy's attack your hp is now : "+hp);
            System.out.println("---------------------");

        }
        else {
            System.out.println("Your enemy has blocked.");
            enemyIsBlocked=true;
            System.out.println("---------------------");



    }

    }

        } }


