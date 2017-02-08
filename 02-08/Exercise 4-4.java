public static int max(int[] arr) {
    if (arr.length == 0) {
        throw new IllegalArgumentException();
        // ignore this case
    } else {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ret < arr[i]) {
                ret = arr[i];
            }
        }
        return ret;
    }
}
// Relevant inputs = length of arr
// Operations to count = assignments to ret
// Worst: T(n) = n
// Best: T(n) = 1
// Avg: T(n) = n/2

