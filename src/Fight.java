import java.util.Scanner;

public class Fight {
    private int enemyHp;
    private int enemyAtk;
    private int hp;
    private int atk;
    private boolean isBlocked;
    private boolean enemyIsBlocked;
    private String whatHappen="";



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
    public String getWhatHappen(){
        return whatHappen;
    }
    public void isHealing(boolean heal){
        if (heal){
            hp=hp+20;
            if (hp>=200){
                hp=200;
            }
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
                whatHappen="Your enemy has attacked and dealt "+halfEnemyAtk+" damage.\nAfter the enemy's attack your hp is now : " +hp+"\n---------------------";
                hp=hp-halfEnemyAtk;
                enemyIsBlocked=false;



            }
            else {
                hp=hp-enemyAtk;
                enemyIsBlocked=false;
                whatHappen= "Your enemy has attacked and dealt "+enemyAtk+" damage.\nAfter the enemy's attack your hp is now : " +hp+"\n---------------------";
            }


        }
        else {
            enemyIsBlocked=true;
            whatHappen= "Your enemy has blocked\n--------------------";



    }

    }

    }}



