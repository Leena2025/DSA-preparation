 public class Even{
    boolean iseven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Even obj=new Even();
        System.out.println(obj.iseven(10)); 

    }
 }
   