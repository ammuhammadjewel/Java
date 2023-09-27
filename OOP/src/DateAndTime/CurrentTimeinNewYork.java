//Write a Java program to get the current time in New York.
package DateAndTime;

import java.util.*;
public class CurrentTimeinNewYork {
    public static void main(String[] arg){
        Calendar CalNewYork = Calendar.getInstance();
        CalNewYork.setTimeZone(TimeZone.getTimeZone("American/New_York"));
        System.out.println();
        System.out.println("Time in new york: " + CalNewYork.get(Calendar.HOUR_OF_DAY) + ":"
         + CalNewYork.get(Calendar.MINUTE)+":"+CalNewYork.get(Calendar.SECOND));
        System.out.println();
    }  
}