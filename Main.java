// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {

    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2}; 
        int maxElement = findMaximum(array);
        System.out.println("Maximum element: " + maxElement);
    }
}
