public class Namenum {
    String getname(){
        String name="leena";
        return name ;
    }
    long getphone(){
        long n=7397178222L;
        return n;
    }
    public static void main(String[] args) {
        Namenum obj=new Namenum();
        String name=obj.getname();
         System.out.println(name);
        long phone=obj.getphone();
        System.out.println(phone);
    }
    
}
