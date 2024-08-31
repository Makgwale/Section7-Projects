import java.util.*;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        //String str = ג€Java
        int[] codes = new int[5];
        codes[1] = 10;
        codes[2] = 20;
        codes[3] = 30;
        codes[4] = 40;
        //codes[5] = 50;
        System.out.println("Code " + Arrays.toString(codes));
        System.out.println();
        

        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(Arrays.equals(bugs, alias));
        System.out.println(Arrays.toString(bugs));

        for (int i = 0; i < codes.length; i++) {
          //  System.out.println("index " + codes[i] + ":");
        }

        System.out.println("abcabc".replace('a', 'A'));

        StringBuilder sb = new StringBuilder("animals");
        String a = sb.toString();
        String sub = String.valueOf(sb.append(" just 2"));
        System.out.println("sb : " + sb + " sub : " + sub + " a : " + a);

        String num = "10";
        int no = Integer.parseInt(num);

        System.out.println(no);

        StringBuilder name1 = new StringBuilder("Kgwale");
        StringBuilder name = name1;
        StringBuilder name2 = new StringBuilder("Kgwale");

        System.out.println(name1.equals(name));
        System.out.println((name1.toString()).contentEquals(name2));

        int[] numbers = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.remove(Integer.valueOf(1));
        System.out.println(numbers1);

        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list.remove(1); // throws UnsupportedOperation Exception


        int [] v = {1, 2, 2,3};
    }
}