package tugas2;

public class queue2 {
    public static void main(String[] args) {
        queue queue = new queue(4);
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        queue.queue(4);
        queue.tampilkan();
        queue.dequeue();
        queue.tampilkan();
        queue.dequeue();
        queue.tampilkan();
        queue.dequeue();
        queue.tampilkan();
        queue.dequeue();
        queue.tampilkan();



    }
}
