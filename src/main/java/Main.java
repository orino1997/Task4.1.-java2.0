public class Main {
    public static void main(String[] args) {
        int[] randomNumbersArray = new int[20];
        int min = -10;
        int max = 10;
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int i : randomNumbersArray) {
            System.out.print(i + " ");
        }
        int minPositiveDecimal = max;
        int maxNegativeDecimal = min;

        // -1 is an indicator of absence of number in the array
        int minPositiveIndex = -1;
        int maxNegativeIndex = -1;

        for (int j = 0; j < randomNumbersArray.length; j++) {
            int currentValue = randomNumbersArray[j];
            if (currentValue < 0 && currentValue > maxNegativeDecimal) {
                maxNegativeDecimal = currentValue;
                maxNegativeIndex = j;
            }
            if (currentValue > 0 && currentValue < minPositiveDecimal) {
                minPositiveDecimal = currentValue;
                minPositiveIndex = j;
            }
        }
        //if element is not found and has -1 index - print the message
        if (minPositiveIndex < 0 || maxNegativeIndex < 0) {
            System.out.println("Element is not found");
        } else {
            randomNumbersArray[minPositiveIndex] = maxNegativeDecimal;
            randomNumbersArray[maxNegativeIndex] = minPositiveDecimal;
        }
        System.out.println("\nGotten array: ");
        for (int element : randomNumbersArray) {
            System.out.print(element + " ");
        }

    }
}
