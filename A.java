class Data{
	int rollno;
	String name;
	static String college="CUS";
<<<<<<< HEAD
	//constructor
	A(int r,String n){
=======
	Data(int r,String n){
>>>>>>> 2c0a068ba9863a02c92a329ce28be4f20546064b
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
