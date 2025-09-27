public class Square {
    int squ(int n){
        return  n*n;
    }
    
    
    public static void main(String[] args) {
        Square obj=new Square();
        int[] num={10,20,5,6,7,9};
        for(int i=0;i<=num.length;i++){
        System.out.println(obj.squ(num[i]));          
        }

    }
}
