package main;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(57);
        queue.add(12);
        queue.add(-6);
        queue.add(0);
        queue.add(98);
        queue.add(1);
        while (!queue.isEmpty()){
            System.out.println(queue.removeFirst());
        }
    }

}
