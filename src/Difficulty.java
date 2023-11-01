public class Difficulty {
    private String difficulty;
    private int enemyHp;
    private int enemyAtk;
    public int hp;

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

    public int getEnemyHp() {
        return enemyHp;
    }

    public int getEnemyAtk() {
        return enemyAtk;
    }
    public void round(){
        hp=125;
        int atk=15;
        boolean isBlocked=false;
        boolean enemyIsBlocked=false;
        int enemyAction=0;

        enemyAction= (int) (Math.random()*10);
        if (enemyAction<=5){
            System.out.println("Your enemy has attacked.");
            if (isBlocked){
                enemyAtk=enemyAtk/2;
            }
            hp=hp-enemyAtk;
            System.out.println("After the enemy's attack your hp is now : "+hp);
            System.out.println("---------------------");
            enemyAtk=enemyAtk*2;
        }
        else {
            System.out.println("Your enemy has blocked.");
            enemyIsBlocked=true;
            System.out.println("---------------------");



    }

    }
}

