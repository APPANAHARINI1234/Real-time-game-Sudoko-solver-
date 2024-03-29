package logic;
import player.Player;
import board.Board;
import java.util.*;

public class Logic {
   Player player;
   Board board;
   public Logic(Player player,Board board){
      this.player=player;
      this.board=board;
   }
   public void setPosition(int row,int col,int key){
    if(board.Fixedcontent.containsKey(row)){
        for(int i=0;i<board.Fixedcontent.get(row).size();i++){
            if(board.Fixedcontent.get(row).get(i)==col){
                System.out.println("You cant change fixed position");
                break;
            }
        }
       
        board.board[row][col]=key;
        
    }
    else{
        board.board[row][col]=key;
     }
   }
   public void checkPosition(int row,int col){
    //row
    HashMap<Integer,Integer>map=new HashMap<>();
    
    for(int i=0;i<9;i++){
        if(map.containsKey(board.board[row][i])){
           
            board.board[row][col]=0;
            break;
        }
        else
        map.put(board.board[row][i],1);
    }
    map.clear();
    for(int i=0;i<9;i++){
        if(map.containsKey(board.board[i][col])){
            
            board.board[row][col]=0;
            break;
        }
        else
        map.put(board.board[i][col],1);
    }
    map.clear();
    //3 sets
    int i=row/3;
    i=i*3+3;
    int j=col/3;
    j=j*3+3;
    int n=i+3;
    int m=j+3;
    for(;i<n;i++){
        for(;j<m;j++){
            if(map.containsKey(board.board[i][j])){
              
                board.board[row][col]=0;
                break;
            }
            else
            map.put(board.board[i][j],1);
        }
    }
    
   }
   public void resetPosition(int row,int col){
    if(board.Fixedcontent.containsKey(row)){
        for(int i=0;i<board.Fixedcontent.get(row).size();i++){
            if(board.Fixedcontent.get(row).get(i)==col){
                System.out.println("You cant change fixed position");
                break;
            }
        }
       
        board.board[row][col]=0;
        
    }
    else{
        board.board[row][col]=0;
     }
   }
   public boolean isWinner(){
    
    //row
  int flag=0;
    for(int j=0;j<9;j++){
    HashMap<Integer,Integer>map=new HashMap<>();
    
    for(int i=0;i<9;i++){
        if(map.containsKey(board.board[j][i])||board.board[i][j]==0){
           
            
            flag=1;
            break;
        }
        
    }
}
for(int j=0;j<9;j++){
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<9;i++){
        if(map.containsKey(board.board[i][j])||board.board[i][j]==0){
            
            flag=1;
            break;
        }
        
    }
}
   
    //3 sets
    // int i=row/3;
    // i=i*3+3;
    // int j=col/3;
    // j=j*3+3;
    // int n=i+3;
    // int m=j+3;
    int k=0;
    int i=0;
    int j=0;
    int n=0;
    int m=0;
    while(i<9&&j<9){
    i=k*3+3;
    j=k*3+3;
    n=i+3;
    m=j+3;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(;i<n;i++){
        for(;j<m;j++){
            if(map.containsKey(board.board[i][j])||board.board[i][j]==0){
              
              flag=1;
                break;
            }
           
        }
    }
    k++;
}
if(flag==0){
    System.out.println("Hooray you are winner!");
    return true;
}
else
return false;
   }
}
