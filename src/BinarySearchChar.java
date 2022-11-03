public class BinarySearchChar {
    public static void main(String[] args) {
        char[] charArrayToSearch = {'a', 'b','f', 'j', 'p', 't','w','y','z'};

        int result = binarySearch(charArrayToSearch, 'p', 0, charArrayToSearch.length - 1);
        System.out.println(result);
    }
    private static int binarySearch(char[] arrayToSearch, char elementToSearch, int start, int end){
        while(start <= end) {
            int middle = (start + end) / 2;

            if (arrayToSearch[middle] == elementToSearch) {
                return middle;
            } else if(arrayToSearch[middle] < elementToSearch){
                start = middle + 1;
            } else{
                end = middle - 1;
            }
        }

        return -1;
    }
}
