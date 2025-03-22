class Data{
	int rollno;
	String name;
	static String college="CUS";
	Data(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);
		}

public static void main(String[] args) {
		// TODO Auto-generated method stub
Data s1=new Data(111,"rakshi");
Data s2=new Data(222,"siva");
s1.display();
s2.display();
	}

}
