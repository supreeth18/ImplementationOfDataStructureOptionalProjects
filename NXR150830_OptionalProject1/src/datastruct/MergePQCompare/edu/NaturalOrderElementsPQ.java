package datastruct.MergePQCompare.edu;

/**
 * PriorityQueue
 * 
 * @author Nagasupreeth Ramesh
 *
 */
import java.util.PriorityQueue;

public class NaturalOrderElementsPQ {

	PriorityQueue<Integer> priorityQueue;

	// Initialize the priority-Queue in the Constructor
	public NaturalOrderElementsPQ() {
		priorityQueue = new PriorityQueue<Integer>();
	}

	// size of the array is assumed to be > 1 million
	int size = 5;
	int[] array = new int[size];

	public void initializeArray() {
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		insertIntoPriorityQueue(array);
	}

	/*
	 * Here By default Priority queue implements min-Heap i,e Natural Ordering
	 * but if you want to do other we have to use custom comparator for that.
	 */
	public void insertIntoPriorityQueue(int[] array) {

		for (int i = 0; i < size; i++) {
			priorityQueue.offer(array[i]);
		}
	}

	/*
	 * Here since the Priority queue acts as binary heap you the first element
	 * only will be arranged in proper state all other elements will be ordered
	 * in random order for eg: if we have 5 elements say 2,6,1,8,9 the priority
	 * queue will order the elements as 1,etc it doeznt care about other
	 * elements since by default it performs min-heap where root element has to
	 * be smaller.
	 * 
	 * so in-order to to proper sorting we have to pop all the elements from the
	 * priority queue and rearrange that is why i have used as follows.
	 */
	public void printElements() {
		while (!priorityQueue.isEmpty()) {
			Integer res = priorityQueue.poll();
			System.out.println(res);
		}
		
	}

	// Driver Program
	public static void main(String[] args) {
		NaturalOrderElementsPQ pq = new NaturalOrderElementsPQ();

		Timer timer = new Timer();
		timer.start();

		pq.initializeArray();

		pq.printElements();

		timer.end();
		System.out.println(timer);
	}

}
