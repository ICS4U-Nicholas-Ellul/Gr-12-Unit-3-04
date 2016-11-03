/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Oct 2016
 * This program tells you the solution to a tower of hanoi problem.
 ****************************************************************************/

import java.util.Stack;
import java.util.Arrays;

public class Stub {
  

  public static void henoi(int numberOfTiles, String start, String temp, String end){
    
    if(numberOfTiles >0){

     	henoi(numberOfTiles - 1, start, end, temp);
       
    	System.out.println("Move from tower " + start + " to " + end  );
    	
    	henoi(numberOfTiles - 1, temp, start, end);
       	
    }
  
  }
  
  public static void printStack(Stack a, Stack B, Stack C){
	  
	  System.out.println(Arrays.toString(a.toArray()));
  }
  
  public static void henoi(int numberOfTiles, Stack start, Stack temp, Stack end){
	    
	    if(numberOfTiles >0){

	     	henoi(numberOfTiles - 1, start, end, temp);
	       
	    	System.out.println("Move from tower " + start + " to " + end  );
	    	int holder = (int)start.pop();
	    	end.push(holder);
	    	
	    	henoi(numberOfTiles - 1, temp, start, end);
	       	holder = (int)temp.pop();
	       	end.push(holder);
	    }
	  
	  }
	  
  
  
  
 public static void main(String[] args)
 {
   
  String towerA = "A";
  String towerB = "B";
  String towerC = "C";
  
  Stack A = new Stack();
  Stack B = new Stack();
  Stack C = new Stack();
  
  int TILES = 3;
	
  
  henoi(TILES,towerA,towerB,towerC);
  
 
 }
}
 