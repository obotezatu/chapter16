//16.21
package chapter16;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueOrder {

	public static void main(String[] args) {

		PriorityQueue<Double> queue = new PriorityQueue<Double>(10, new NumberComparator());

		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);

		System.out.print("Polling from queue: ");
		while (queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek());
			queue.poll();
		}
	}
}

class NumberComparator implements Comparator<Double> {

	public int compare(Double first, Double second) {
		if (first < second)
			return 1;
		else if (first > second)
			return -1;
		return 0;
	}

}
