import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceHandler {
    private ExecutorService exec;
    private Random random = new Random();

    public ExecutorServiceHandler(int number) {
        exec = Executors.newFixedThreadPool(number);

        int bound = random.nextInt(30) + 1;
        System.out.println("Запуск " + bound + " потоков, при возможных " + number + " потоках..\n");

        for(int i = 0; i < bound; i++) {
            System.out.println("Запуск потока №" + (i + 1));
            exec.execute(new RandomWordThread());
        }
        exec.shutdown();
        System.out.println("Завершение работы потоков...");
    }
}
