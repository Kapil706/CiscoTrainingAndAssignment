package cisco.programs.oops;

// HAS-A relationship between two objects of different class
// 
class Operation{
	int square(int n){
		return n*n;
	}
}


class Aggregation {
	
	
	Operation op;
	double pi = 3.14;
	
	double area(int radius){
		op = new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aggregation ag= new Aggregation();
        double result = ag.area(5);
        System.out.println(result);
	}

}
