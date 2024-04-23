package TestingCode;

public class Exercise {
    public static void main (String[] args) {
        var numbers = new double[]{1.5, 2, 3.6, 4, 5.4};

        System.out.println("First Element" + numbers[0]);
        System.out.println("Last element: " +numbers[4]);

        System.out.println("Elements in reverse order: ");

        for (int i = numbers.length-1 ; i>=0; i--)

        {
            System.out.println(numbers[i]);

        }


        System.out.println("Total elements in the array: " + numbers.length);
    }
}
