public class subject53 {
    public static void main(String []arg){
        int a=8;
        int b =12;

        boolean greaderthan=(a>b);
        boolean lessthan=(a<b);
        boolean lessthenandgreat=(a>b)&(a<b);
        boolean grterthenorlessthen=(a>b)|(a<b);


        System.out.println(a+">" +b+ "="+greaderthan);
        System.out.println(a+">"+b+"="+lessthan);
        System.out.println(a+"<" +b+ "="+lessthenandgreat);
        System.out.println(a+">"+b+"="+grterthenorlessthen);
    }
}
