public class AverageCalcu {
    public static double calculateAverage(String text) {
        if (text == null || text.isEmpty()) {
            return 0.0;
        }

        int letterCount = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        return (double) letterCount / text.length();
    }

    public static void main(String[] args) {
        String sampleText = "Hi, Universe!";
        double average = LetterAverageCalculator.calculateAverage(sampleText);
        System.out.println("Average of letters in the text: " + average);
    }
}
