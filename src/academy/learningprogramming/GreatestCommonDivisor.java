package academy.learningprogramming;

public class GreatestCommonDivisor {
    public static boolean isValid(int num) {
        return num > 9;
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (isValid(first) && isValid(second)) {
            while (first != second) {
                if (first > second) {
                    first -= second;
                } else {
                    second -= first;
                }
            }
        }
        return first;
    }
}
