import java.util.Scanner;

public class Lab1 {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
//        question9();
//        question10();
//        question11();
//        question12();
//        question13();
//        question14();
//        question15();
//        question16();
//        question17();
//        question18();

    }


    public static void question1() {
        int firstNumber;
        int secondNumber;
        System.out.print("Please Enter First Number: ");
        firstNumber = data.nextInt();
        System.out.print("Please Enter Second Number: ");
        secondNumber = data.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));

    }

    public static void question2() {
        int number;
        int mult;
        System.out.print("Enter The Number: ");
        number = data.nextInt();
        for (int i = 1; i <= 10; i++) {
            mult = i * number;
            System.out.println(number + " x " + i + " = " + (mult));
        }
    }

    public static void question3() {
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }

    public static void question4() {
        int count;
        int integerNumbers;
        int sum = 0;
        System.out.print("Enter The count of numbers: ");
        count = data.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            integerNumbers = data.nextInt();
            sum = sum + integerNumbers;

        }
        System.out.println("The Average is: " + sum / count);
    }

    public static void question5() {
        int firstNum;
        int secondNum;
        int thirdNum;
        System.out.print("Enter the first number: ");
        firstNum = data.nextInt();
        System.out.print("Enter the second number: ");
        secondNum = data.nextInt();
        System.out.print("Enter the third number: ");
        thirdNum = data.nextInt();
        if (firstNum + secondNum == thirdNum) {
            System.out.println("The result is: True");
        } else {
            System.out.println("The result is: false");
        }
    }

    public static void question6() {
        String word;
        System.out.print("Input a word: ");
        word = data.nextLine();
        for (int i = word.length(); i > 0; i--) {
            System.out.print(word.charAt(i - 1));
        }
    }

    public static void question7() {
        int number;
        System.out.println("Enter The Number: ");
        number = data.nextInt();
        if (number % 2 != 0) {
            System.out.println("The Number is Odd");
        } else {
            System.out.println("The Number is Even");
        }
    }

    public static void question8() {
        double centigrade;
        System.out.println("Enter The Temperature in Centigrade: ");
        centigrade = data.nextDouble();
        double formula = 1.8;
        double fahrenheit = centigrade * formula + 32;
        System.out.println(fahrenheit);
    }

    public static void question9() {
        String input;
        int indexNumber;
        System.out.print("Input a string: ");
        input = data.nextLine();
        System.out.print("Input a number: ");
        indexNumber = data.nextInt();
        char charachter = input.charAt(indexNumber);
        System.out.println(charachter);

    }

    public static void question10() {
        //SKIP FOR LATER COZ THERE'S A CALCULATION
        double width = 5.6;
        double height = 8.5;
        double perimeter = 2 * (height + width);
        double area = width * height;
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }

    public static void question11() {
        //When i enter first and second numbers
        // i want it to show all true operations
        int firstNum;
        int secondNum;
        System.out.print("Input first integer: ");
        firstNum = data.nextInt();
        System.out.print("Input second integer: ");
        secondNum = data.nextInt();

        //This wrong solution
        if (firstNum != secondNum) {
            System.out.println(firstNum + " != " + secondNum);
        }

        if (firstNum < secondNum) {
            System.out.println(firstNum + " < " + secondNum);
        }

        if (firstNum <= secondNum) {
            System.out.println(firstNum + " <= " + secondNum);
        }

        if (firstNum == secondNum) {
            System.out.println(firstNum + " == " + secondNum);
        }

        if (firstNum > secondNum) {
            System.out.println(firstNum + " > " + secondNum);
        }

        if (firstNum >= secondNum) {
            System.out.println(firstNum + " >= " + secondNum);
        }

    }

    public static void question12() {
        int seconds;
        int minutes;
        int hours;

        System.out.println("Input seconds: ");
        seconds = data.nextInt();

        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void question13() {
        int firstNum;
        int secondNum;
        int thirdNum;
        int fourthNum;
        System.out.print("Input first number: ");
        firstNum = data.nextInt();
        System.out.print("Input second number: ");
        secondNum = data.nextInt();
        System.out.print("Input third number: ");
        thirdNum = data.nextInt();
        System.out.print("Input fourth number: ");
        fourthNum = data.nextInt();
        if (firstNum == secondNum ||
                firstNum == thirdNum ||
                firstNum == fourthNum ||
                secondNum == thirdNum ||
                secondNum == fourthNum ||
                thirdNum == fourthNum
        ) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }

    public static void question14() {
        int number;
        System.out.print("Enter The Number: ");
        number = data.nextInt();
        if (number < 0) {
            System.out.println("Number is Negative: ");
        } else if (number == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Positive");
        }
    }

    public static void question15() {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter numbers (enter -1 to stop): ");

        int number;
        do {
            number = data.nextInt();

            if (number != -1) {
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

        } while (number != -1);

        System.out.println(positiveCount + " positives");
        System.out.println(zeroCount + " zeros");
        System.out.println(negativeCount + " negatives");
    }

    public static void question16() {
        int number;
        int revers = 0;
        System.out.print("Enter the number: ");
        number = data.nextInt();

        while (number != 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;
            number /= 10;
            if (number == 0){
                System.out.println(revers);
            }


        }
    }

    public static void question17() {
        int numbers;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            numbers = data.nextInt();

            if (numbers == -1) {
                break;
            }
            if (numbers > largest) {
                largest = numbers;
            }

            if (numbers < smallest) {
                smallest = numbers;
            }
            ;

        }
        System.out.println("The largest number: " + largest);
        System.out.println("The smallest number: " + smallest);
    }

    public static void question18() {
        String word;
        int count = 0;
        System.out.println("Enter the word: ");
        word = data.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("Number of 'a's: " + count);
    }


}