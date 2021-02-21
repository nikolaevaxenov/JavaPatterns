public class TypesTester {
    static class t1 extends Thread {
        @Override
        public void run() {
            SetLock<Integer> sl = new SetLock<>();

            sl.add(5);
            sl.add(15);
            sl.add(25);

            System.out.println(sl);
            System.out.println(sl.contains(25));
            sl.remove(15);
            System.out.println(sl.size());
        }
    }

    static class t2 extends Thread {
        @Override
        public void run() {
            MapSemaphore<Integer, String> ms = new MapSemaphore<>();

            ms.put(1, "Ivan");
            ms.put(2, "Petr");
            ms.put(3, "Mikhail");

            System.out.println(ms);
            System.out.println(ms.values());
            System.out.println(ms.keySet());

            ms.remove(2);

            System.out.println(ms.size());
        }
    }

    public static void main(String[] args) {
        t1 th11 = new t1();
        t1 th12 = new t1();
        th11.start();
        th12.start();

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------");

        t2 th21 = new t2();
        t2 th22 = new t2();
        th21.start();
        th22.start();
    }
}
