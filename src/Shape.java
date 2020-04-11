 
import java.util.Scanner;
public abstract class Shape implements Movable  {
	
	private double x,y,x2,y2,mhkos,platos;
	final double pi = 3.14;
     String color = "Green";
     
     
	public  double perim,emvadon,radious,side;
	public static double v;
	public Shape(double x , double y , double radious ){
		setLocationX(x);
		setLocationY(y);
		
		this.radious = radious;
		
	}
	
	public Shape(double x,double y,double mhkos,double platos){
		this.x=x;
		this.y=y;
		this.mhkos=mhkos;
		this.platos=platos;
		
		
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public Shape(double x, double y){
		setLocationX(x);
		setLocationY(y);	
	}
	public void setLocationX(double x){
		if (x>= 0){  
                this.x=x;
                
                
                
                 
		}
		else{
			System.out.println("error locationX");
			
			
		}
	}
	public void setLocationY(double y){
		    if(y>=0){
			this.y=y;
			
		}
		else{
			System.out.println("error locationY");
		}
		
	}
	public double getLocationX(){
		return x;
	}
	public double getLocationY(){
		return y;
	}

	
	
	public void setCenter(){
		Scanner center = new Scanner(System.in);
		System.out.println("please gice a center you prefer");
		System.out.println("please give the x point");
		
		x2 = center.nextDouble();
		System.out.println("please give the x point");
		
		y2 = center.nextDouble();
	       
	}
    
	
	public static double sqrt1(double x,double y,double x2,double y2 ) {
		  v=  Math.sqrt(Math.pow(y2-y,2) + Math.pow(x2-x,2));
		return  v;
	}
	
	public abstract double getPerim();
	public abstract double getEmvadon();
	

	
	
	
	@Override
	public String toString(){
		return "a shape with color = " + color + " on the position" + " on the position " + getLocationX() +getLocationY();
	}
	
	
	
	 public void setMhkos(double mhkos){
		 this.mhkos = mhkos;
	 }
	
   public double getMhkos(){
	   return mhkos;
   }
   
  
   
   
  
			 	

public void moveX(double x){
	if (x>0){
		x=3*x;
		this.x=x;
       }
	else if (x<0){
		x=3*x;
		this.x=x;
		
	}
	else{
		System.out.println("the point x didnt move");
	}
		
}




public void moveY(double y){
	if(y>0){
		this.y=y;
	}
	else if(y<0){
		this.y=y;
		
	}
	else{
		System.out.println("the point y didnt move");
	}
}



public double getMoveX(){
	return x;
}
public double getMoveY(){
	return y;
}

public String toString4(){
	return "the x point moves 3 points" + getMoveX() + "and y point stays in the same point" +getMoveY();
	
}
	

	
}



		
	

	
		
		
	
	
	
	


