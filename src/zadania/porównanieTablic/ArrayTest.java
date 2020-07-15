package zadania.porównanieTablic;

class ArrayTest {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 2, 3, 4};

        boolean compare = ArrayComparator.compare(test1, test2);
        if(compare)
            System.out.println("Tablice są równe");
        else
            System.out.println("Tablice są różne");

        int[][] test3 = {{1, 2, 3}, {2, 3, 4}};
        int[][] test4 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        boolean compare2 = ArrayComparator.compare(test3, test4);
        if(compare2)
            System.out.println("Tablice dwuwymiarowe są równe");
        else
            System.out.println("Tablice dwuwymiarowe są różne");

    }
}
