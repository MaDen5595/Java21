package Task3;

public class Element {
    public static <E> E elementRet(E[] array, int num){
        return array[num];
    }

    public static void main(String[] args) {
        Integer[] inter = new Integer[] {1,2,3,4,5};
        String[] str = new String[] {"a","e","l","f"};
        System.out.println(elementRet(inter,2));
        System.out.println(elementRet(str,0));
    }
}
