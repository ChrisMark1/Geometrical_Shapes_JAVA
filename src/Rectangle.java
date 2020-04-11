
public   class  Rectangle extends Square {
	private  double mhkos;
	public Rectangle(double x,double y ,double side){
		super(x,y,side);
		setMhkos(mhkos);
		
		
	}
	public Rectangle(double x,double y,double mhkos,double platos){
		super(x,y,mhkos,platos);
	}
	public void setMhkos(double mhkos){
		if(mhkos>=0){
		this.mhkos=mhkos;
	}
		else{
			System.out.println("error mhkos");		
			}
	}
	public double getMhkos(){
		return mhkos;
	}
	public double getEmvadon(){
		emvadon = side*mhkos;
		return emvadon;
		
	}
	
	public double getPerim(){
		perim = 2*side + 2*mhkos;
		return perim;
	}
	
	
	@Override
	public String toString(){
		return "a rectangle with width = " + getMhkos() + "whitch is a subclass of " + super.toString();
	}
    
	
		
	
	
	
	
	

}
