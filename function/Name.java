public class Name {
    
    String greet(String name){
        String a="Hello, <name>";
        return a;
    }
    
    
    
    public static void main(String[] args) {
        Name obj=new Name();
        System.out.println(obj.greet("leena"));
     }
    
}
