public class Store {
    void getchocolate(int money){
        System.out.println("chocolate price: "+money);
    }
    void getpowder(int money){
       System.out.println("powder price: "+money);
    }
    public static void main(String[] args) {
        Store obj1=new Store();
        obj1.getchocolate(20);
        obj1.getpowder(30);
    }
    
}
