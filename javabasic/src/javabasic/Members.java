package javabasic;

public class Members 
{
     String fname;
     String lname;
     int age;
     String gender;
     
     public Members(String fname,String lname, int age,String ger)
     {
    	 this.fname=fname;
    	 this.lname=lname;
    	 this.age=age;
    	 this.gender=ger;
    	 
    	 
    	 System.out.println(this.fname);
    	 System.out.println(this.lname);
    	 System.out.println(this.age);
    	 System.out.println(this.gender);
    	 
     }
     
//     public  void display(String fname,String lname,int age,String gender)
//     {
//    	 
//    	 String f=fname;
//    	 String l=lname;
//    	 int a=age;
//    	 String ge=gender;
//    	 
//    	 
//    	 System.out.println(f);
//    	 System.out.println(l);
//    	 System.out.println(a);
//    	 System.out.println(ge);
//    	
//    	 
//     }
	public static void main(String[] args) 
	{
		Members m=new Members("satish","Rathod",22,"male");
		System.out.println();
//         m.display("krishna","Rathod",20,"male");
	}

}
