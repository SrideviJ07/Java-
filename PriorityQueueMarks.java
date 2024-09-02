import java.util.*;
public class PriorityQueueMarks {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(88);
        pq.add(8);
        pq.add(98);
        pq.add(23);
        pq.add(18);
        pq.add(60);
        while(pq.size()>1)
        {
            pq.remove();
        }
        System.out.println(pq.peek());

    }
}
