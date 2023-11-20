import java.util.Scanner;

public class Fight {
    private int enemyHp;
    private int enemyAtk;
    private int hp;
    private int atk;
    private boolean isBlocked;
    private boolean enemyIsBlocked;
    private String whatHappen="";


    /**
     *
     * @param diff represents the difficulty and checks if diff equals e or m to set enemyhp and enemyatk
     */
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

    /**
     *
     * @param yourHp is your hp
     * @param yourAtk is your attack
     * @param enemyHp is enemy's hp
     * @param enemyAtk is enemy's attack
     */
    public Fight(int yourHp,int yourAtk,int enemyHp,int enemyAtk) {
    hp=yourHp;
    atk=yourAtk;
    this.enemyHp=enemyHp;
    this.enemyAtk=enemyAtk;
    }


    /**
     *
     * @return returns enemyhp
     */
    public int getEnemyHp() {
        return enemyHp;
    }

    /**
     *
     * @return returns enemy Attack
     */
    public int getEnemyAtk() {
        return enemyAtk;
    }

    /**
     *
     * @return returns user hp
     */
    public int getHp(){
        return hp;
    }

    /**
     *
     * @return returns enemyIsBlocked
     */
    public boolean getIsEnemyIsBlocked(){
        return enemyIsBlocked;
    }

    /**
     *
     * @param block checks if block is true or false and sets isBlock accordingly
     */
    public void isBlocking (boolean block){
        if (block){
            isBlocked=true;
        }
        else{
            isBlocked=false;
        }
    }

    /**
     *
     * @return returns what happens
     */
    public String getWhatHappen(){
        return whatHappen;
    }

    /**
     *
     * @param heal checks if user is healing and increases user hp
     */
    public void isHealing(boolean heal){
        if (heal){
            hp=hp+20;
            if (hp>=200){
                hp=200;
            }
        }

    }

    Scanner scanner=new Scanner(System.in);

    /**
     * round method will pick a random number and according to that number it will attack or block. If attack is picked it will check if user is blocked
     * if user is blocked it will do half it's damage, if user isn't blocked it will do normal damage. If block is picked it will set enemyIsBlocked to true.
     *
     *
     */

    public void round(){

    int halfEnemyAtk=enemyAtk/2;
    int halfYourAtk=atk/2;
        int enemyAction=0;
        if(enemyHp>0){
        enemyAction = (int) (Math.random()*10);
        if (enemyAction<=5){

            if (isBlocked){
                whatHappen="Your enemy has attacked and dealt "+halfEnemyAtk+" damage.\n---------------------";
                hp=hp-halfEnemyAtk;
                enemyIsBlocked=false;



            }
            else {
                hp=hp-enemyAtk;
                enemyIsBlocked=false;
                whatHappen= "Your enemy has attacked and dealt "+enemyAtk+" damage.\n---------------------";
            }


        }
        else {
            enemyIsBlocked=true;
            whatHappen= "Your enemy has blocked\n--------------------";



    }

    }

    }

    /** toString method will return a String with information about the user and enemy.
     *
     * @return returns user and enemy's current hp and returns how much damage user and enemy does.
     */
    public String toString(){
        return "Player now has "+hp+" health and does "+atk+" damage.\nEnemy now has "+enemyHp+" health and does "+enemyAtk+" damage.";
}
}



