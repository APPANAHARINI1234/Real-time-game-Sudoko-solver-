import board.Board;
import player.Player;
import logic.Logic;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Board board=new Board();
        board.getBoardConfig();
        Player player=new Player();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter player details:");
        System.out.println("Enter name:");
        player.setName(sc.next());
        System.out.println("Enter age:");
        player.setAge(sc.nextInt());
        System.out.println("Enter college name:");
        player.setCollegeName(sc.next());
        System.out.println("Enter contact:");
        player.setContact(sc.next());
        System.out.println("Enter email:");
        player.setEmail(sc.next());
        Logic logic=new Logic(player,board);
        while(true){
           board.getBoardConfig();
           System.out.println("Enter where  want to insert:");
           System.out.println("Enter row and col:");
           
           logic.setPosition(sc.nextInt(),sc.nextInt(),sc.nextInt());
           System.out.println("If u want to reset any position press 1: ");
           int in=sc.nextInt();
           if(in==1){
            logic.resetPosition(sc.nextInt(),sc.nextInt());
           }
           System.out.println("If you want to submit press 1:");
           int sub=sc.nextInt();
          if(sub==1){
            if(logic.isWinner()){
              System.out.println("Hooray you are the winer");
              player.getPlayer();
            }
              else
              System.out.println("Sorry there is some mistake \n Better luck next time");
              break;
          }
           
        }
    }
}
