package function;

public class Sum {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Sum obj1=new Sum();
        obj1.sum(10,5);
        obj1.div(10,5);
        obj1.mul(10,5);
    }
    
}
