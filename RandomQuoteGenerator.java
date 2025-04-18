import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    private static final String[] quotes = {
        "The best way to get started is to quit talking and begin doing.",
        "Don’t let yesterday take up too much of today.",
        "It’s not whether you get knocked down, it’s whether you get up.",
        "If you are working on something exciting, it will keep you motivated.",
        "Success is not in what you have, but who you are.",
        "The harder you work for something, the greater you'll feel when you achieve it.",
        "Dream bigger. Do bigger.",
        "Push yourself, because no one else is going to do it for you.",
        "Sometimes later becomes never. Do it now.",
        "Great things never come from comfort zones."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input;

        do {
            int index = random.nextInt(quotes.length);
            System.out.println("\nRandom Quote:\n" + quotes[index]);
            System.out.print("\nPress Enter to generate another quote or type 'exit' to quit: ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        scanner.close();
        System.out.println("Thank you for using Random Quote Generator!");
    }
}
