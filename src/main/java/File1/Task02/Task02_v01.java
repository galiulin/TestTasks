package File1.Task02;

public class Task02_v01 {

    public static void main(String[] args) {
        programmFizzBuzz();
    }

    public static void programmFizzBuzz(){
        StringBuilder outputLine = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            for (Numbers number : Numbers.values()){
                if (i % number.getNumber() == 0){
                    outputLine.append(number.getOutputLine());
                }
            }
            System.out.println(outputLine.toString().isEmpty() ? i : outputLine);
            outputLine.delete(0, outputLine.length());
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

        public String getOutputLine(){
            return outputLine;
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




/**
 * Простое решение.
 * */
class Task02_v02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String outputString = "";
            if (i % 3 == 0){
                outputString += "Fizz";
            }
            if (i % 5 == 0){
                outputString += "Buzz";
            }
            System.out.println(outputString.isEmpty() ? i : outputString);
        }
    }
}