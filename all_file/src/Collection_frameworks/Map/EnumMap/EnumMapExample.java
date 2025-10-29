package Collection_frameworks.Map.EnumMap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapExample {
    public static void main(String[] args) {

        /*Array of size same as enum
        no hashing
        ordinal/index is used`
        * */
        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.Friday , "Sleep");
        //System.out.println(Day.Friday.ordinal());
        System.out.println(map);
    }
}

enum Day{
    Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday
}
