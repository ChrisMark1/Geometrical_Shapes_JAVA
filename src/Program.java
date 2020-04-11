
import java.util.Scanner;
public class Program{
		
		
	    
		public static void main(String[] args) {
			
			
		     
			 
			@SuppressWarnings("resource")
			Scanner sxhmata = new Scanner(System.in);
			
			
	
			
			int k;   
			System.out.println("please give the number of shapes you you want to create \n");
			
			int i=sxhmata.nextInt();
			Shape[] shapes  = new Shape[i];
			
			System.out.println("you want to create " +i +" Shapes");
			
			
			
			System.out.println("the available shapes is three");
			
			
			
			
		
			for(k = 0; k<i ; k++){
				
				System.out.println("these is: \n CIRCLE = 1 \n SQUARE = 2 \n RECTANGLE = 3 \n");
				
				int choise = sxhmata.nextInt();
				
				if(choise == 1){
				   
	                System.out.println("please give \n radious ");
	                
					double radious =sxhmata.nextDouble();
					
					
				   
					
					System.out.println("please give \n color ");
					
				     String color= sxhmata.next();
				     sxhmata.nextLine();
				     
				     System.out.println("please give \n x point ");
				     
				    double x = sxhmata.nextDouble();
				    
				    System.out.println("please give \n y point ");
				    
				    double y = sxhmata.nextDouble();
				    
				    
				   shapes[k] = new Circle(x,y,radious);
				   
					System.out.println("you have given");
			    	
			    	System.out.println(" \n radious is = ");
			    	
			    	 System.out.printf("%f",radious);
			    	 
			    	 System.out.println(" \n the color  is = ");
				    	
			    	 System.out.printf("%s",color);
			    	 
			    	 System.out.println(" \n the x point is = ");
				    	
			    	 System.out.printf("%f",x);
			    	 
			    	 System.out.println(" \n the y point is = ");
				    	
			    	 System.out.printf("%f",y);
				   
				   if(k==0){
					   shapes[0].setLocationX(x);
					   shapes[0].setLocationY(y);
				   }
				   else if(k==1){
				   shapes[1].setLocationX(x);
				   shapes[1].setLocationY(y);
				   }
				   
				   
				   
				    
				}
				
				    else if(choise == 2){
				    	System.out.println("please give \n mhkos pleuras \n");
				    	
				    	double mhkos = sxhmata.nextDouble();
				    	
				    	System.out.println("please give \n the color \n");
				    	
				    	String color = sxhmata.next();
				    	sxhmata.nextLine();
				    	System.out.println("please give \n x point \n");
				    	
				    	double x = sxhmata.nextDouble();
				    	
				    	System.out.println("please give \n y point \n");
				    	
				    	double y = sxhmata.nextDouble();
				    	
				    	shapes[k] = new Square(x,y,mhkos);
				    	
				    	System.out.println("you have given");
				    	
				    	System.out.println(" \n mhkos is = ");
				    	
				    	 System.out.printf("%f",mhkos);
				    	 
				    	 System.out.println(" \n the color  is = ");
					    	
				    	 System.out.printf("%s",color);
				    	 
				    	 System.out.println(" \n the x point is = ");
					    	
				    	 System.out.printf("%f",x);
				    	 
				    	 System.out.println(" \n the y point is = ");
					    	
				    	 System.out.printf("%f",y);
					    
					    if(k==0){
							   shapes[0].setLocationX(x);
							   shapes[0].setLocationY(y);
						   }
						   else if(k==1){
							   shapes[1].setLocationX(x);
							   shapes[1].setLocationY(y);
						   }
					    
					    
						  
				    }
					    else if(choise ==3){
					    	System.out.println("please give \n mhkos pleuras \n");
					    	
					    	double mhkos = sxhmata.nextDouble();
					    	
					    	System.out.println("please give \n platos pleuras \n");

					    	double platos = sxhmata.nextDouble();
					    	
					    	System.out.println("please give \n the color \n");

					    	String color = sxhmata.next();
					    	sxhmata.nextLine();
					    	System.out.println("please give \n x point \n");

					    	double x =sxhmata.nextDouble();
					    	
					    	System.out.println("please give \n y point \n");

					    	double y = sxhmata.nextDouble();
					    	
					    	shapes[k] = new Rectangle(mhkos,platos,x,y);
					    	
					    	System.out.println("you have given");
					    	
					    	System.out.println(" \n mhkos is = ");
					    	
					    	 System.out.printf("%f",mhkos);
					    	 
					    	 System.out.println(" \n the platos is = ");
						    	
					    	 System.out.printf("%f",platos);
					    	 
					    	 System.out.println(" \n the color  is = ");
						    	
					    	 System.out.printf("%s",color);
					    	 
					    	 System.out.println(" \n the x point is = ");
						    	
					    	 System.out.printf("%f",x);
					    	 
					    	 System.out.println(" \n the y point is = ");
						    	
					    	 System.out.printf("%f",y);


						    
						    if(k==0){
								   shapes[0].setLocationX(x);
								   shapes[0].setLocationY(y);
								   shapes[0].moveX(x);
								   shapes[0].moveY(y);
								   shapes[0].setColor(color);
								   shapes[0].setMhkos(mhkos);
							   }
							   else if(k==1){
								   shapes[1].setLocationX(x);
								   shapes[1].setLocationY(y);
							   }
					
						    
						    
					    }
				}
				     double s=0,max=0;
				     int p=0;
		                for( k =0;k<i;k++){
		                	if(shapes[k] instanceof Circle){
		                		Circle rad = (Circle) shapes[k];
		                        s = s + rad.getPerim();
		                        p++;
		                       
		                        	
		                        }
		                        
		                	
		                	else if(shapes[k] instanceof Rectangle){
		                		
		                		
		                		if(shapes[0] instanceof Rectangle){
		                			
		                			System.out.println("\n the points are " + shapes[0].toString() + "the color is " + shapes[0].getColor() );
		                			
		                			System.out.println("the move of the first rectangle type's shapes is" + shapes[0].toString4());
		                		}
		                		
		                		
		                	}
		                	else if(shapes[k] instanceof Square){
		                		Square sqr = (Square) shapes[k];
		                		if(sqr.getEmvadon()>max){
		                			max = sqr.getEmvadon();
		                		}
		                		
		                		
		                	}
		                	
		                }
		                
		                
		                // mesos oros perimetrou olwn twn antikeimenwn tupou circle
		                
		                System.out.println("\n the pososto of perimeter in circle shapes is : " + s/p*100);
		                
		                //h megisth timh twn emvadon olwn twn antikeimenwn square
		                
	                	System.out.println("\n the max value of emvadon in square shapes is : " + max);
		                //upologismos eukleidias aposteshs
	                	
	                	    if(shapes[0] != null && shapes[1] != null){
	                		System.out.println("the distance is : " + Shape.sqrt1(shapes[0].getLocationX(),shapes[0].getLocationY(),shapes[1].getLocationX(),shapes[1].getLocationY()));
	                	    }
		                	
		                
		                    
		                	
		                
			
				
				
			}
		}


			
			     
			     
				
			    
			    
				
					
				
					
				

				
							
				
				
				
					

			     
