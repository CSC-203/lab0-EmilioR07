public class Lab00 {

   public static void main(String[] args) {

      int x = 20;
      String y = "hello";
      float z = 9.8F;

      System.out.println("x: " + x + " y: " + y + " z: " + z);



      int[] nums = {3, 6, -1, 2};
      for (int n : nums) {
         System.out.println(n);
      }

      int numFound = char_count(y,'l');
      System.out.println("Found:" + numFound);

      for (int i = 1; i <= 10; i++) {
         System.out.print(i + " ");
      }
      System.out.println();
   }

   public static int char_count(String str, char character) {
      int count = 0;
      for(char ch : str.toCharArray()){
         if(ch == character)
            count++;

      }
      return count;
   }
}
