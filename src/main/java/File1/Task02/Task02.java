package File1.Task02;

import java.util.stream.IntStream;

public class Task02 {

    public static void main(String[] args) {
        programmFizzBuzz();
    }

    public static void programmFizzBuzz(){
        StringBuilder string = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            for (Numbers number : Numbers.values()){
                if (i % number.getNumber() == 0){
                    string.append(number);
                }
            }
            System.out.println(string.toString().isEmpty() ? i : string);
            string.delete(0, string.length());
        }
    }

    enum Numbers {
        THREE(3, "Fizz"),
        FIVE(5, "Buzz");

        int number;
        String outputLine;

        Numbers(int number, String outputLine) {
            this.number = number;
            this.outputLine = outputLine;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return outputLine;
        }
    }
}

/**
 * Если рассматривать гибкость, то enum плохое решение,
 * просто подумалось что будет более оригинально
 * да и избавило от коллекций\массивов.
 * Еще пытался сделать через Stream, но не получилось простого решения;
 * */