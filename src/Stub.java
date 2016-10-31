import java.util.Stack;

public class Stub {
  

  public static void henoi(int numberOfTiles, String start, String temp, String end){
    
    if(numberOfTiles >0){

     	henoi(numberOfTiles - 1, start, end, temp);
       
    	System.out.println("Move from tower " + start + " to " + end  );
    	
    	henoi(numberOfTiles - 1, temp, start, end);
       	
    }
  
  }
  
  
  
  
  
 public static void main(String[] args)
 {
   
  String towerA = "A";
  String towerB = "B";
  String towerC = "C";
  int TILES = 3;
	
  
  henoi(TILES,towerA,towerB,towerC);
  
 
 }
}
 