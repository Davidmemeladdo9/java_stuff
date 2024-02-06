import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        Practice5 practice = new Practice5();
        practice.integers(8);
    }

    void integers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = i + 1;
            System.out.println(Arrays.toString(numbers)); // Initialize the array with consecutive integers starting from 1
        }
        // System.out.println(Arrays.toString(numbers));
    }
}



