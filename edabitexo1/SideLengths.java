
package serie4.edabitexo1;
public class SideLengths {
    public static double[] otherSides(int n) {
            double shortSide = n;
            double mediumeSide = shortSide * Math.sqrt(3);
            double longSide = shortSide * 2;
      
      return new double[]{longSide,mediumeSide};
  }
}
