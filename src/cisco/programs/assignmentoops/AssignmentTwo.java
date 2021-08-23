package cisco.programs.assignmentoops;

class Area{
	private float radius = 2.0f;
	private int side = 4;
	private int length = 3;
	private int width = 5;
	private float area;
	
	
	Area(){
		
	}
	
	Area(int s){
		this.side = s;
		area = side*side;
		DisplayArea();
		
	}
	Area(float r){
		this.radius=r;
		area = (float)(3.14*radius*radius);
		DisplayArea();
	}
	Area(int l, int w){
		this.length=l;
		this.width=w;
		area = length*width;
		DisplayArea();
	}
	
	public void aarea(int h, int b){
		area= (h*b)/2;
		DisplayArea();
	}
	
	public void aarea(float p, float q){
		area = (p*q)/2;
		DisplayArea();
	}
	
	
	public void DisplayArea(){
		
		System.out.println("Area is: "+area);
		
	}
	
	
}


public class AssignmentTwo extends Area{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Area square = new Area(4);
		
		Area circle = new Area(3.4f);
	
		Area rectangle = new Area(4,5);
		
		Area Rhombus = new Area();
		Rhombus.aarea(4, 5);
		
		Area Triangle = new Area();
		Triangle.aarea(4.6f, 5.0f);
	}

}
