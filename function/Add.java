public class Add {
    int add(int a,int b){
       int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Add obj=new Add();
        int c=obj.add(10,20);
        System.out.println(c);
    }
        
    
}
