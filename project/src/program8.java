public class program8 {
    public static void main (String []arg) {
        int a = 8;
        int res = leftshift(a);
        System.out.println("left shift of " + a + "is" + res);
    }
      public static int leftshift (int a)
      {
          int b=a<<1;
          return b;
    }
}
