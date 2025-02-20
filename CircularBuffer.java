import java.util.*;

class CircularBuffer {
    int[] buffer;
    int size, front, rear, count;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = rear = count = 0;
    }

    public void add(int val) {
        buffer[rear] = val;
        rear = (rear + 1) % size;
        if (count < size) count++;
        else front = (front + 1) % size; 
    }

    public List<Integer> getBuffer() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++)
            list.add(buffer[(front + i) % size]);
        return list;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        System.out.println(cb.getBuffer());
    }
}
