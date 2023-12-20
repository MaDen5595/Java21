package Task1;

import java.util.Arrays;
import java.util.List;

public class Converter {
    public static List<Object> arrayToList(Object[] objectArray){
        return Arrays.asList(objectArray);
    }
    public static void main(String[] args){
        String[] strArray = new String[] {"a","b"};
        Integer[] intArray = new Integer[] {1,2};
        List<Object> strList = arrayToList(strArray);
        List<Object> intList = arrayToList(intArray);
        for(int i = 0;i<2;i++){
            System.out.println(strList.get(i));
        }
        for(int i = 0;i<2;i++){
            System.out.println(intList.get(i));
        }
    }
}
