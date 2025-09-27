package array;

public class Existsornot {
    public static void main(String[] args) {
        int[] list={5,10,15,20,25};
        int num=15;

        for(int i=0;i<list.length;i++){
            if(list[i]==num){
                System.out.println("Yes, this number is in the array");
            }
            else{
                System.out.println("No, this number is not in the array");
            }
        }
        
    }
    
}
