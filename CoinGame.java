public class CoinGame {
    public static void main(String[] args) {
        double[] coin = new double[3];
        int heads = 0;
        int tails = 0;

        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            System.out.print("Rounds " + (i + 1) + ": ");
            coin[i] = Math.floor(Math.random() * 2) + 1;

            if (coin[i] == 1) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                tails++;
            }
        }
        System.out.println("heads: " + heads + ", Tails: " + tails);

        if (heads > tails) {
            System.out.println("You won!");
        } else {
            System.out.println("You lose!");
        }
    }
}