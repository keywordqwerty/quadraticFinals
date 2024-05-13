/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quadraticfinal;
import java.util.ArrayList;

/**
 *
 * @author percy
 */
public class Quadratic {
	private int a;
	private int b;
	private int c;
	private int x;
    
	public Quadratic(int a,int b, int c){
    	this.a = a;
    	this.b = b;
    	this.c = c;
    	//this.x = x;
	}
    
        @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }

    
	public Quadratic() {
	}

public int setA(int ay){
this.a = ay;
return this.a;
}

public int setB(int by){
	this.b = by;
	return this.b;
}

public int setC(int cy){
	this.c = cy;
	return this.c;
}

public int setX(int xy){
	this.x = xy;
	return this.x;
}

public int getA(){
	return this.a;
}

public int getB(){
	return this.b;
}

public int getC(){
	return this.c;
}

public int getX(){
	return this.x;
}

public int evaluate(){
	int result = (a*x*x) + (b*x) + c;
	return result;
	///3,5,1
}

public int getDiscriminant(){
	int disc = (b*b)-(4*a*c);
   return disc;
}

public void isImaginary(){
	if (getDiscriminant()<0){
    	System.out.println("The roots are imaginary");
	}else{
	System.out.println("The roots are not imaginary");
}
}
public double getFirstRoot(){
   double result = (-b + java.lang.Math.sqrt(getDiscriminant())) / (2*a);
  
   return result;
}


public double getSecondRoot(){
	double result =  (-b - java.lang.Math.sqrt(getDiscriminant())) / (2*a);
        
	return result;
}


//Checks if its a perfect square. If Discriminant != 0 then it is not a perfect square
public void isPerfectSquare(){
	if(getDiscriminant()==0){
    	System.out.println("The equation is a perfect square\n");
	}else{
    	System.out.println("The equation is not a perfect square\n");
	}
}


public void /*Quadratic*/ add(Quadratic quad1, Quadratic quad2){
  Quadratic result = new Quadratic();
  result.setA(quad1.getA() + quad2.getA());
  result.setB(quad1.getB() + quad2.getB());
  result.setC(quad1.getC() + quad2.getC());
  //result.a = otherAdd.a + otherAdd2.a;
  //result.b = otherAdd.b + otherAdd2.b;
  //result.c = otherAdd.c + otherAdd.c;
  System.out.println("The result of two quadratic equations added together is: ");
  System.out.println(result);
}




public static void displayAllQuadratic(ArrayList<Quadratic> all){
    for(Quadratic quads : all){
        System.out.println(quads);       
        }
    }
}



//prevs

//Displaying the quadratic
/*public void displayAddedQuadratic(Quadratic result){
	System.out.println("The result of two quadratic equations added together is: ");
        System.out.println(this.a + "x^2 " +"+ " +  this.b + "x + " + this.c + " = 0"); 
}*/



//-----------------------



//SHITCODE
//java.lang.Math.sqrt


/*  displayQuadratic()
    add(Quadratic otherAdd)
    isPerfectSquare()
    getSecondRoot()
    getFirstRoot()
    isImaginary()
    getDiscriminant()
    evaluate()

*/