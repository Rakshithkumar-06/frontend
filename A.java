class A{
	int rollno;
	String name;
	static String college="CUS";
	//constructor
	A(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);
		}

public static void main(String[] args) {
		// TODO Auto-generated method stub
A s1=new A(111,"rakshi");
A s2=new A(222,"siva");
s1.display();
s2.display();
	}

}
