import java.util.Random;

public class theDiceMan {
    private String activity; // "Heads" eller "Tails"
    private Random random;

    public theDiceMan() {
        this.activity = "Eat breakfast";
        this.random = new Random();
    }

    public void getActivity() {
        int result = random.nextInt(6);
        if (result == 0) {
            activity = "Heads";
        } else if (result == 1) {
            activity = "Tails";
        } else if (result == 2) {
            activity = "Tails";
        } else if (result == 3) {
            activity = "Tails";
        } else if (result == 4) {
            activity = "Tails";
        } else {
            activity = "Tails";
        }
    }

}
