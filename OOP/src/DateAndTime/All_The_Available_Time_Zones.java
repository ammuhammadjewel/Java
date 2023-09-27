//Write a Java program to get the current time in all the available time zones.
package DateAndTime;

import java.time.*;
public class All_The_Available_Time_Zones {
    public static void main(String[] arg){
        ZoneId.SHORT_IDS.keySet().
        stream().forEach(
        zoneKey ->System.out.println(" "+ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey))+": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)))));  
    }
    
}