/**
 * @(#)MinPerimeterRectangle.java
 *
 *
 * @author
 * @version 1.00 2015/11/12
 */

import java.util.*;
public class MinPerimeterRectangle {

	public int solution(int N) {


                if (x * y == N){

            int x = 0;
            int y = N;
            int perimeter = 0;
            for (x = 1; x <= y; x++) {
                if (x * y == N){
                    perimeter = 2 * (x + y);
                    System.out.println("Perimeter: " + perimeter);
                }
                if (N % (x+1) == 0)
                    y = N/(x+1);
            }
            System.out.println("Value: " + x);

            return perimeter;
        }


}
