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


        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Fight Gaem");
        //System.out.print("Please enter name: ");
        //name=s.nextLine();
        System.out.print("Please pick your difficulty:(e=easy, m=medium) ");
        diff=s.nextLine();
        Difficulty yourDiff=new Difficulty(diff);
        enemyHp=yourDiff.getEnemyHp();
        enemyAtk=yourDiff.getEnemyAtk();
        //Difficulty myStats=new Difficulty(125,15);



        yourDiff.round();


            }
        }





