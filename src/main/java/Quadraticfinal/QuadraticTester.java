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
        int input =0;
        int input2 = 0;
    	boolean hi=true;
        ArrayList<Quadratic> quads = new ArrayList<Quadratic>();
    	while(hi==true){
   	boolean yes =true;
       
    	int answer = 0;
        while(yes){        
         System.out.println("1. Create quadratic equation ");
         System.out.println("2. Add two quadratic equations together ");
         System.out.println("3. Check if quadratic is a perfect square");
         System.out.println("4. Get first and second root");
         System.out.println("5. Evaluate the quadratic equation");
         System.out.println("6. Display all quadratic");
         System.out.println("7. Check if roots are imaginary");
         System.out.println("8. Get discriminant");
         System.out.println("9. Exit");
         
         
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
                       
                        if(a == 0){
                            System.out.println("This is not a quadratic equation.");
                           break;                  
                        }else{
                        Quadratic quad = new Quadratic(a,b,c);
                        quads.add(quad);
                        System.out.println("Equation is now added to the list.\n");
                        break;   
                        }
                }catch(Exception e){
                           System.out.println("Error occured while entering coefficients. Please enter only integers.\n");
                           scanner.nextLine();       	
                           break;
                    }
                 }
                  break;
               //CASE 1 IS NOW OKAY   
               
                  
              //CASE 2 NOW OKAY
              case 2: //Add two quadratic equations together
                    boolean yessir = true;
                    if(quads.size()<=1){
                         System.out.println("Must have at least 2 quadratic equations in the list.");
                         yessir = false;
                     }else{
                        
                        while(yessir == true){
                      try{
                      System.out.println("Select two quadratic equations to add together:");
                   
                     
                     for (int i = 0; i<quads.size(); i++){
                         System.out.println(i +" " + quads.get(i));
                     }                   
                         
                    System.out.println("1st Quadratic equation: ");
                    input = scanner.nextInt();                 
                    System.out.println("2nd Quadratic equation:");
                    input2 = scanner.nextInt();
                    
                    if(input > quads.size() || input2 > quads.size()){
                         System.out.println("Cannot add from an empty equation. Please only enter numbers that are within the choices.");
                         break;
                    }else{
                        
                    Quadratic quad1 = quads.get(input);
                    Quadratic quad2 = quads.get(input2);
                    Quadratic result = new Quadratic(); 
                    result.add(quad1, quad2);
                  
                                          
                    }
                    
                    
                     }catch(Exception e){
                         System.out.println("Error occured in the process of addition.\n");
                         scanner.nextLine();
                         break;
                     }   
                     break;
                 }                
                    }    
                      break;  
                  //CASE 2 NOW OKAY    
                      
                 //CASE 3 NOW OKAY
              case 3: //Check if quadratic is a perfect square
                  if(!quads.isEmpty()){               
                      try{
                 System.out.println("Select a quadratic equation to check: ");
                 for(int i = 0; i<quads.size(); i++){
                     System.out.println(i + " " + quads.get(i));
                 }
                  System.out.println("\n");
                   input = scanner.nextInt();
                   
                 if(input > quads.size()){
                     System.out.println("Cannot check on empty equation.");
                 }else{               
                  quads.get(input).isPerfectSquare();
                   break;
                 }
                 
            	}catch (Exception e){
                    System.out.println("Error finding the perfect square. Only enter integers or options that are in the choices.\n");
                    scanner.nextLine();   
                    break;
                }
             
                  break;
                  }else{
                  System.out.println("No quadratic option to choose from.");
                  break;
                  }
                  //CASE 3 NOW OKAY
                  
                  
              case 4: //Get first root and second root
                  
                  if(!quads.isEmpty()){
                      try{
                      System.out.println("Select a quadratic equation to check: ");
                      for(int i=0; i<quads.size(); i++){
                          System.out.println(i + " " + quads.get(i));
                      }
                      input = scanner.nextInt();
                    
                       if(input > quads.size()){
                     System.out.println("Cannot check on empty equation.");
                         }else{  
                           Quadratic objectparaniroot = quads.get(input);
                           objectparaniroot.getFirstRoot();
                           objectparaniroot.getSecondRoot();
                           double first = objectparaniroot.getFirstRoot();
                           double second = objectparaniroot.getSecondRoot();
                           
                        if (first == 0.0 && second == 0.0) {
                         System.out.println("The quadratic equation has a single real root or a repeated root.");
                            System.out.println("First root: " + first);
                            System.out.println("Second root: " + second);
                              } else {
                             System.out.println("First root: " + first);
                             System.out.println("Second root: " + second);
                              }
                           break;
                       }             
                      }catch(Exception e){
                          System.out.println("Error getting first root or second root. Enter only integers or existent options.");
                          scanner.nextLine();
                      }
                  }else{
                      System.out.println("No quadratic equations existent in the list.");
                      break;
                  }
                  
              case 5: //EVALUATE A QUADRATIC EQUATION
                  
                  break;
               
                  
                  //OK NA
              case 6:  //DISPLAY ALL QUADRATICS IN THE LIST
                  if(!quads.isEmpty()){
                  Quadratic.displayAllQuadratic(quads);
                 System.out.println("");
                  }else{
                      System.out.println("No quadratic equations exist in the list.\n");
                  }
                  break;
                   //OK NA      
              case 7:
                  break;
              
              case 8:
                  break;
              
              case 9:
                  System.exit(0);
                  
              default: 
                      System.out.println("Option Unavailable.");
                      break;
               
       }
     }
   }
}
             

                  
                  
                                    

                  
                  



                    //Addition quad (REMOVED)
                    /*result.setA(quad1.getA() + quad2.getA());
                    result.setB(quad1.getB() + quad2.getB());
                    result.setC(quad1.getC() + quad2.getC());*/      
                    //result.displayAddedQuadratic(result); 


//-----------------

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