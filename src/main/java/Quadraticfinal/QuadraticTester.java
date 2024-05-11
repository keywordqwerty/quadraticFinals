/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quadraticfinal;

/**
 *
 * @author percy
 */
import java.util.Scanner;
import java.util.ArrayList;

public class QuadraticTester {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int a;
    	int b;
    	int c;
    	int x;
    	int a2;
    	int b2;
    	int c2;
    	int x2;
        int input;
        int input2;
    	boolean hi=true;
        ArrayList<Quadratic> quads = new ArrayList<Quadratic>();
    	while(hi==true){
   	boolean yes =true;
       
    	int answer = 0;
        while(yes){        
         System.out.println("1. Create quadratic equation ");
         System.out.println("2. Add two quadratic equations together ");
         System.out.println("3. Check if quadratic is a perfect square");
         System.out.println("4. Get value of x^1 and x^2");
         System.out.println("5. Evaluate the quadratic equation");
         System.out.println("6. Exit");
         
            try{
             answer = scanner.nextInt();
             yes = false;
            }catch(Exception e){
                System.out.println("Error. What you provided is not a proper integer.");
                scanner.nextLine();
                yes = true;
            }
         }
            
            
            
         switch (answer){
             //CASE 1 IS NOW OKAY
             case 1: //Create quadratic equation
                 while(true){
                        System.out.println("Enter the coefficients of the quadratic equation (a, b, c)");
                try{
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        c = scanner.nextInt();
                       
                        Quadratic quad = new Quadratic(a,b,c);
                        quads.add(quad);
                        System.out.println("Equation is now added to the list.\n");
                        break;                  
                }catch(Exception e){
                           System.out.println("Error occured while entering coefficients. Please enter only integers.\n");
                           scanner.nextLine();       	 
                    }
                 }
                  break;
               //CASE 1 IS NOW OKAY   
                  
              case 2: //Add two quadratic equations together
                 while(true){
                     try{
                     System.out.println("Select two quadratic equations to add together:");
                     for (int i = 0; i<quads.size(); i++){
                         System.out.println(i +" " + quads.get(i));
                     }
                    System.out.println("1st Quadratic equation: ");
                    input = scanner.nextInt();
                    System.out.println("2nd Quadratic equation:");
                    input2 = scanner.nextInt();
                    Quadratic quad1 = quads.get(input);
                    Quadratic quad2 = quads.get(input2);
                    Quadratic result = new Quadratic();
                    System.out.println("Result: "+ result.add(quad1, quad2));
                     }catch(Exception e){
                         System.out.println("Error occured while adding two equations together\n");
                     }
                    break;
                 }
                 
                 
              case 3: //Check if quadratic is a perfect square
                  while (true){ 
                      try{
                 System.out.println("Select a quadratic equation to check: ");
                 for(int i = 0; i<quads.size(); i++){
                     System.out.println(i + " " + quads.get(i));
                 }
                 System.out.println("\n");
                  input = scanner.nextInt();
                  quads.get(input).isPerfectSquare();
                  break;
            	}catch (Exception e){
                    System.out.println("Error finding the perfect square");
                }
             }
                  break;
                  
                  
              case 4: 
                  while (true){
                      System.out.println("Select a quadratic equation to enter value of x: ");
                      for (int i = 0; i<quads.size(); i++){
                          System.out.println(quads.get(i));
                      }
                      input = scanner.nextInt();
                      System.out.println("\nEnter value of x: ");
                      input2 = scanner.nextInt();
                      Quadratic forthex = quads.get(input);
                      forthex.setX(input2);
                      break;
                  }
              default: 
                      System.out.println("Option Unavailable.");
                      break;
               
         }
        }
        }
}
             


//boolean answer = true;
   	 //while(answer){
         
         /*  displayQuadratic()
    add(Quadratic otherAdd)
    isPerfectSquare()
    getSecondRoot()
    getFirstRoot()
    isImaginary()
    getDiscriminant()
    evaluate()

*/
//---------------------------------------------------












             /*
             case 2: add()
                     break;
            
                     
             case 3: 
         }
         //}
         }
        }
   	 /*
    	while(true){
    	System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
    	try{
     	a = scanner.nextInt();
     	b = scanner.nextInt();
     	c = scanner.nextInt();
     	break;
    	}catch(Exception e){
        	System.out.println("Error occured while entering coefficients.\n");
        	scanner.nextLine();       	 
        	}
   	}
        /*
    	while(true){
    	System.out.println("Enter the value of x:");
    	try{
         	x = scanner.nextInt();
         	break;
    	}catch(Exception e){
        	System.out.println("Error occured while entering value of x.\n");
        	scanner.nextLine();
      	 
    	}
   	}
    	Quadratic quad = new Quadratic(a, b, c, x);
   	 
    	//EVALUATION
    	System.out.println("Evaluating");
    	System.out.println(quad.evaluate());
    	System.out.println();
   	 
    	//GET DISCRIMINANT
	System.out.println("Getting Discriminant");
    	System.out.println(quad.getDiscriminant());
    	System.out.println();
   	 
    	System.out.println("Is it imaginary?");
    	quad.isImaginary();
    	System.out.println();
   	 
    	System.out.println("Get first root");
    	System.out.println(quad.getFirstRoot());
    	System.out.println();
   	 
    	System.out.println("Get second root");
    	System.out.println(quad.getSecondRoot());
    	System.out.println();
   	 
    	System.out.println("Is it a perfect square");
    	quad.isPerfectSquare();
    	System.out.println();
   	 
    	System.out.println("Adding two quadractic equations together");
   	 
    	while(true){
         	System.out.println("Enter coefficients for the second quadratic equation: (a,b,c)");
      	try{
     	a2 = scanner.nextInt();
     	b2 = scanner.nextInt();
     	c2 = scanner.nextInt();
     	break;
    	}catch(Exception e){
        	System.out.println("Error occured while entering coefficients.\n");
        	scanner.nextLine();
      	 
        	}
    	}
   	 
    	while(true){
    	System.out.println("Enter value of x: ");
    	try{
     	x2 = scanner.nextInt();
     	break;
    	}catch (Exception e){
        	System.out.println("Error occured while entering value of x.\n");
        	scanner.nextLine();
       	 
     	}
    	}
    	Quadratic otherQuad = new Quadratic(a2, b2, c2, x2);
    	Quadratic result = quad.add(otherQuad);
    	result.displayQuadratic();
    	scanner.nextLine();
           	 
           	 
    	while(true){
                 	System.out.println("Would you like to enter another set of quadratic equation?: Y/N");
         	try{
    	answer = scanner.next();
    	if(answer.equalsIgnoreCase("Y")){
        	hi = true;
        	break;
    	}else if(answer.equalsIgnoreCase("N")){
        	hi = false;
        	break;
        	}else{
        	System.out.println("Please enter 'Y' or 'N' \n");
        	scanner.nextLine();
    	}
 	}
    	catch(Exception e){
        	System.out.println("Error occured while entering response.\n");
        	}
     	}
    	}  
        */
	//}
        




/*for(int i = 0; i<quads.size(); i++){
                         System.out.println(quads.get(i));
                         }*/