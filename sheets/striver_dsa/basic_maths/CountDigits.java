import java.util.Scanner;

// link: https://takeuforward.org/data-structure/count-digits-in-a-number/

class CountDigits {
    public static int findIntCount(Integer n) {
        int count = 0;

        if (n == null) {
            count = -1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int input;
        int output;

        Scanner s = new Scanner(System.in);
        input = s.nextInt();
        
        output = findIntCount(input);

        System.out.println(output);
    }
}
