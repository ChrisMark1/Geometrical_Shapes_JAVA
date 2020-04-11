
public  class Point implements Movable {
	private double x;
	private double y;
	private final double pi=3.14;
	public boolean set = true;
	private String locationX,locationY;
	double emvadon,perim;
	

	public Point(double x,double y){
	   setLocationX(x);
	   setLocationY(y);
	   	
	}

		
	
	public void setLocationX(double x){
		if (x>= 0){  
                this.x=x;
                
                locationX = ("(" + x  );
                
                 
		}
		else{
			System.out.println("error locationX");
			
			
		}
	}
	public void setLocationY(double y){
		    if(y>=0){
			this.y=y;
			locationY = (x + ")");
			
		}
		else{
			System.out.println("error locationY");
		}
		
	}
	public String getLocationX(){
		return locationX;
	}
	public String getLocationY(){
		return locationY;
	}
	
	
	
	
	
	@Override
	public String toString(){
		return " the position is " + getLocationX() + getLocationY();
	}
	
	public void moveX(double x){
		if (x>0){
			this.x=x;
           }
		else if (x<0){
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
	
	
	

}
