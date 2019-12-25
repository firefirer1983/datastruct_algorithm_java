


public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> ary = new DynamicArray<Integer>(16) ;
        ary.add(5);
        ary.add(6);
        for (Integer elm: ary) {
            System.out.println(elm);
        }
    }
}
