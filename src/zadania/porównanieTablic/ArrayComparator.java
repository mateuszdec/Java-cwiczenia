package zadania.porównanieTablic;

class ArrayComparator {

    //{1, 2, 3} {1, 2}
    //{1, 2, 3} null
    //null {1, 2, 3}
    //{1, 2, 3} {1, 2, 3}

    static boolean compare(int[] array1, int[] array2) {
        if((array1 != null && array2 == null) || (array1 == null && array2 != null))
            return false;
        if(array1 == null && array2 == null)
            return true;
        if(array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i])
                return false;
        }
        return true;
    }

    static boolean compare(int[][] array1, int[][] array2) {
        if((array1 != null && array2 == null) || (array1 == null && array2 != null))
            return false;
        if(array1 == null && array2 == null)
            return true;
        if(array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if(!compare(array1[i], array2[i]))
                return false;
        }
        return true;
    }

}
