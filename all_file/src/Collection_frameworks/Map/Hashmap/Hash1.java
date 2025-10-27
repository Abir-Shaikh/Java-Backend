package Collection_frameworks.Map.Hashmap;

//to show collisions
public class Hash1 {
    public static void main(String[] args) {
        System.out.println(simplehash("ABC"));
        System.out.println(simplehash("CBA"));
    }
    public static int simplehash(String k){
        int sum = 0;
        for (char c : k.toCharArray()){
            sum += (int) c;
        }
        return sum%10;
    }
}
