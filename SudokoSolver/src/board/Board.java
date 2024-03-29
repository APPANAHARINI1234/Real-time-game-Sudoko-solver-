package board;
import java.util.*;
public class Board {
   public int[][]board=new int[9][9];
   public HashMap<Integer,ArrayList<Integer>>Fixedcontent=new HashMap<>();
   public Board(){
    // int[][]board=new int[9][9];
    board[0][1]=4;
    board[0][5]=7;
    board[0][6]=6;
    board[1][0]=8;
    board[1][2]=6;
    board[1][4]=4;
    board[1][7]=3;
    board[2][1]=2;
    board[2][2]=7;
    board[2][8]=8;
    board[3][3]=4;
    board[3][4]=8;
    board[3][8]=3;
    board[4][1]=9;
    board[4][3]=7;
    board[4][5]=6;
    board[4][7]=4;
    board[5][0]=2;
    board[5][4]=1;
    board[5][5]=3;
    board[6][0]=4;
    board[6][6]=8;
    board[6][7]=1;
    board[7][1]=5;
    board[7][4]=3;
    board[7][6]=2;
    board[7][8]=4;
    board[8][2]=1;
    board[8][3]=5;
    board[8][7]=6;
    for(int i=0;i<9;i++){
        ArrayList<Integer>list=new ArrayList<>();
        for(int j=0;j<9;j++){
           
            if(board[i][j]!=0){
                list.add(j);
            }
            Fixedcontent.put(i,list);
        }
       
    }


    }
    public void getBoardConfig(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
   
}
