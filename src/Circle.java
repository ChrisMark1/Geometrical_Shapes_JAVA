
public  class Circle extends Shape {
	private double radious;
    final double pi = 3.14;
	public Circle( double x ,double y,double radious){
		super(x,y);
		setRadious(radious);
		
		
		
	}

	
	
	
	public void setRadious(double radious){
		if (radious> 0.0){
			this.radious=radious;
			}
		else{
			System.out.println("error programming");
		}
	}
	public double getRadious(){
		return radious;
	}
	
	public  double getPerim(){
		
		perim = 2*radious*pi;
		return perim;
	}
	
	public double getEmvadon(){
		
		emvadon = pi*radious*radious;
		return emvadon;
	}
		
	
	
	@Override
	 public String toString(){
			return "a circle with radious = " + getRadious() + "whitch is a subclass of " + super.toString();
		}
	
}
