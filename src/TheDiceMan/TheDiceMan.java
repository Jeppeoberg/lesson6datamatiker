package TheDiceMan;

import java.util.Random;

public class TheDiceMan {
    private String activity; // "Heads" eller "Tails"
    private Random random;

    public TheDiceMan() {
        this.activity = null;
        this.random = new Random();
    }

    public void getActivity() {
        int result = random.nextInt(6);
        if (result == 0) {
            activity = "Eat breakfast";
        } else if (result == 1) {
            activity = "Study";
        } else if (result == 2) {
            activity = "Go swimming";
        } else if (result == 3) {
            activity = "Go fishing";
        } else if (result == 4) {
            activity = "Call his mom";
        } else {
            activity = "Go back to bed";}
    }

    @Override
    public String toString() {
        return activity;
    }
}
