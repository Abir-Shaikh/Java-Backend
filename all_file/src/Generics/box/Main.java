package Generics.box;
//generic class
public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(23);
        int i = box.getValue();
        System.out.println(i);
    }
}
