package Task2;

public class Xranitel<O> {
    O[] array;
    Xranitel(O[] array){
        this.array = array;
    }
    public void outArray(){
        for (Object o : array) {
            System.out.println(o);
        }
    }

}
