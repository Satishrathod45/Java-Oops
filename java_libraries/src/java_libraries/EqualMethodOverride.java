package java_libraries;

public class EqualMethodOverride {
    String name="Satish";
    
//    EqualMethodOverride(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
        EqualMethodOverride ob1 = new EqualMethodOverride();
        EqualMethodOverride ob2 = new EqualMethodOverride();
        EqualMethodOverride ob3 = new EqualMethodOverride();
        
        System.out.println(ob1.equals(ob2)); // Should print false
        System.out.println(ob1.equals(ob3)); // Should print true
    }
    
       public boolean equals(Object obj) {
       
            EqualMethodOverride that = (EqualMethodOverride) obj;
             return name.equals(that.name);
//    	return true;
//        
   }

}
