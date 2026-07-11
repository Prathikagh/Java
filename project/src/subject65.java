public class subject65 {
    public static void ordercoffee(){
       System.out.println("orderd a default coffee");
    }
    public static void orderCoffee(String type){
        System.out.println("ordered a" + type + "coffee.");
    }
    public static String orderCookie(){
        return "order a default cookie.";
    }
    public static void main(String[]args){
        ordercoffee();
        orderCoffee("Black");

        String cookie = orderCookie();
        System.out.println("cookies");
    }
}