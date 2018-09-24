public class Lab00
{
   public static void main(String[] args) {
      int x = 5;
      String y = "hello";
      double z = 9.8;
      System.out.println("x: " + x + " y: " + y + " z: " + z);
      int i = 0;
      int[] num = {3, 6, -1, 2};
      for (i = 0; i < num.length; i++) {
         System.out.println(num[i]);
      }
      int numFound = char_count(y, 'l');
      System.out.println("Found: " + numFound);
      for (i = 1; i < 11; i++)
      {
          System.out.print(i + " ");
      }
      System.out.println();
   }
   public static int char_count(String s, char c)
   {
         int count = 0;
         for(int i = 0; i < s.length();i++)
         {
            if(s.charAt(i) == c)
            {
               count ++;
            }
         }
         return count;
   }
}
