public class EvenorOdd {
    public static void main(String[] args) {
        int[] num={1,3,5,7,9};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println("even: "+evencount);
        System.out.println("odd: "+oddcount);
    }
    
}
