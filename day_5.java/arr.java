public class arr {
    public static void main(String[] args) {
        float[] var1 = new float[]{55.8F, 45.8F, 78.9F, 69.4F, 55.9F};
      float var2 = 0.0F;
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2 += var6;
      }

      System.out.println(var2);
    }
}
