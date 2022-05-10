import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kaitlyn Gatineau
 * Codewars Java May 9th 2022 Solution
 *
 */

public class FindOutlier{
    static int[] ints;
    static int amt;
    static int count = 1;

    static int[] getInts(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = new ArrayList<Integer>();
        System.out.println("How many numbers would you like to enter? (min 3)");
        amt = scanner.nextInt();
        if (amt < 3){
            System.out.println("Error! Minimum of 3 numbers required");
            getInts();
        }

        while (amt > 0) {
            System.out.println("Enter number " + count + ":");
            intList.add(scanner.nextInt());
            amt--;
            count++;
        }

        Object[] objects = intList.toArray();
        ints = Arrays.stream(objects).mapToInt(o -> (int)o).toArray();
        return ints;

    }

    static int find(int[] integers) {
        int outlier = 0;
        int even = 0;
        int odd = 0;
        System.out.println(Arrays.toString(integers));

        for (int i : integers) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (even > odd) {
            for (int i : integers) {
                if (i % 2 != 0) {
                    outlier = i;
                }
            }

        } else {
            for (int i : integers) {
                if (i % 2 == 0) {
                    outlier = i;
                }
            }
        }
        System.out.println(outlier);
        return outlier;
    }
    public static void main(String[] args) {
        getInts();
        find(ints);
    }
}

/*
"Best practice" Solution (without Scanner): akaritakai, Erbolcode

public class FindOutlier{
    public static int find(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
 */