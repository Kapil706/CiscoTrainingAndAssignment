package cisco.programs.assignmentoops;

class student{
	
	private String name;
	private int age;
	private char section;
	private char gender;
	private int sub1;
	private int sub2;
	private int sub3;
	private int totalmarks;
	private int percentage;
	
	student(String name,int age, char section, char gender,int sub2,int sub3){
		this.name=name;
		this.section=section;
		this.age=age;
		this.gender= gender;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		TotalMarks(sub1,sub2,sub3);
	}
	
	
	student(String name,int age, char section, char gender,int sub1, int sub2,int sub3){
		this.name=name;
		this.section=section;
		this.age=age;
		this.gender= gender;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		TotalMarks(sub1,sub2,sub3);	
	}
	
	public void TotalMarks(int sub1,int sub2,int sub3){
		totalmarks = sub1+sub2+sub3;
		Percentage(totalmarks);
		System.out.println("Total marks for This Student is: "+totalmarks);
		System.out.println("Percentage for This Student is:"+percentage);
	}
	public void Percentage(int totalmarks){
		percentage = (totalmarks*100)/300;
	}		
}

public class AssignmentThree {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new student("Kapil",23,'A','M',90,90,90);
		student s2 = new student("Lak",22,'B','M',90,90);
		student s3 = new student("Suee",25,'C','F',90,90);
		student s4 = new student("Micy",28,'A','F',90,90,90);

	}

}
