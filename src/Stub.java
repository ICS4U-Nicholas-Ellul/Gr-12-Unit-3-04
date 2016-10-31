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
   
  Stack towerA = new Stack();
  Stack towerB = new Stack();
  Stack towerC = new Stack();
  int TILES = 3;
		  
  for(int counter = TILES ; counter <= TILES; counter ++){
  towerA.push(counter);
  System.out.println(counter);
  }
  
  henoi(TILES,"A","B","C");
  
  for(int counter = TILES; counter <= TILES; counter ++){
  
  System.out.println(towerC.push(counter));
  }
  
 }

}