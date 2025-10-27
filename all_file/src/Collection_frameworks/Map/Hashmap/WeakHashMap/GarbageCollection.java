package Collection_frameworks.Map.Hashmap.WeakHashMap;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class GarbageCollection {
    public static void main(String[] args) {
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("s24","Andriod"));
        System.out.println(phoneWeakReference.get());
//        System.out.println(phone);
//        phone = null;
//        System.out.println(phone);
        System.gc();
        try {
            Thread.sleep(1000);
        }catch (Exception Ignored){
        }
        System.out.println(phoneWeakReference.get());
    }
}
    class Phone{
        String brand;
        String model;

        public Phone(String model, String brand) {
            this.model = model;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Phone [brand=" + brand + ", model=" + model + "]";
        }
    }
