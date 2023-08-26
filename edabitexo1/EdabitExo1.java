
package serie4.edabitexo1;

import java.util.Arrays;


public class EdabitExo1 {
    public static int [] ArrayOfMultiple (int n , int length ){
         int [] res = new int[length];
         
       for(int i = 0;i<length ;i++){
           res[i] = n *(i+1);
       }  
       return res ;
    }
            
    public static void main(String[] args) {
         int [] multi = ArrayOfMultiple(2, 4);
         System.out.println(Arrays.toString(multi));
         double [] resultat = SideLengths.otherSides(1);
        System.out.println(resultat[0]+" ,"+resultat[1]);
    }
}
