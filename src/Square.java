
public  class Square extends Shape {
	protected  double side;
	public Square(double x,double y,double side){
		super(x,y);	
		setSide(side);
	}
    public Square(double x,double y,double mhkos,double platos){
    	super(x,y,mhkos,platos);
    
    	
    	
    	
    }	

	
	public void setSide(double side){
		if(side>=0){
			this.side = side;	
		}
		else{
			System.out.println("error side");
		}
		
	}
	
	public double getSide(){
		return side;
	}
	public double getEmvadon(){
		emvadon = Math.pow(side,2);
		return emvadon;
		
	}
	
	public double getPerim(){
		perim = 4*side;
		return perim;
	}
	
	
	
	
	
	@Override
	public String toString(){
		return"a square with length = " + getSide() + "whitch is a subclass of" + super.toString();
	}
	    
	
}
