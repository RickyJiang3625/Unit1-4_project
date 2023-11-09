public class Stats {
    private int hp;
    private int atk;
    private int enemyHp;
    private int enemyAtk;
    private boolean block;

    public Stats(int hp,int atk,String name){
        this.hp=hp;
        this.atk=atk;
    }
    public Stats(int enemyHp,int enemyAtk){
        this.enemyAtk=enemyAtk;
        this.enemyHp=enemyHp;
    }
    public Stats(boolean block){
        this.block=block;
    }


}
