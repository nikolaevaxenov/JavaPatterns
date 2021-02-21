import java.util.Random;

public class RandomWordThread implements Runnable {
    private String[] words = {"capricious", "roasted", "check", "box", "day", "debonair", "coordinated", "observe", "beds", "jail", "wide-eyed", "anger", "attraction", "slimy", "thoughtless", "time", "drab", "pushy", "smiling", "helpful", "understood", "truck", "hobbies", "delight", "launch", "acoustic", "troubled", "thick", "cattle", "explode", "large", "melt", "release", "bashful", "hurried", "animal", "bite-sized", "kneel", "unaccountable", "squealing", "show", "drown", "telling", "aunt", "low", "superficial", "wave", "breath", "succeed", "complain"};
    private Random random = new Random();

    @Override
    public void run() {
            try {
                System.out.println(words[random.nextInt(words.length)]);
                Thread.sleep(random.nextInt(5001) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
