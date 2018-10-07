/**
 * @author nickel
 * @date 2018/10/07 15:46
 */
public class Person {
    // prsf
    private static final int A = 5;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Person.main");
        String[] names = new String[]{"nickel", "haah", "matrxi"};
        // fori
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // iter
        for (String name : names) {
            System.out.println(name);
        }
        // itar
        for (int i = 0; i < names.length; i++) {
            String name = names[i];

        }
        if (names == null) {

        }
        if (names != null) {

        }

        if (names != null) {

        }

    }
}
