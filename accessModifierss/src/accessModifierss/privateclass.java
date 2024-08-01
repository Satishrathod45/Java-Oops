package accessModifierss;

class privateclass
{
    private String name;
    private int id;
    
    private privateclass(String n,int i)
    {
    	this.name=n;
    	this.id=i;
    }
    
    private void display()
    {
    	System.out.println("Name: "+this.name+ " ,id: "+this.id);
    }
    
    public static void main(String args[])
    {
    	privateclass p=new privateclass("Satish",23);
    	p.display();
    }
}
