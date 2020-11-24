import java.util.Arrays;

import apcs.Window;

public class Sorting {

	private static final int[] array = null;

	public static void main(String[] args) {
		Window.size(1000, 200);
		int barWidth = 1;
		int[] array = new int[Window.width() / barWidth];
		Window.frame();
		// initArray(array);
		// flatten(array);
		// draw(array);
		// quickSort(array);

		initArray(array);
		// Arrays.sort(array);
		reverse(array);

		draw(array);
		bubbleSort(array);

		// bubbleSort(array);

	}

	private static void siftDown(int[] array, int index, int size) {
		// first child: 2p + 1
		// second child: 2p + 2
		int bigger;

		int child1 = 2 * index + 1;
		int child2 = 2 * index + 2;

		if (child1 >= size) {
			return;
		}

		if (child2 >= size) {
			if (array[child1] > array[index]) {
				swap(array, child1, index);
				return;
			}
		}

		if (array[child1] > array[child2]) {
			bigger = child1;
		} else {
			bigger = child2;
		}

		if (array[bigger] > array[index]) {
			swap(array, bigger, index);
			draw(array);
			siftDown(array, bigger, size);
		}
	}

	private static void siftUp(int[] array, int index) {
		if (index > 0 && array[index] > array[(index - 1) / 2]) {
			swap(array, index, (index - 1) / 2);
			draw(array);
			siftUp(array, (index - 1) / 2);
		}
	}

	public static void heapify(int[] array) {
		for (int i = 0; i < array.length; i++) {
			siftUp(array, i);
		}
	}

	public static void heapSort(int[] array) {
		heapify(array);
		for (int i = array.length - 1; i > 0; i--) {
			swap(array, 0, i);
			siftDown(array, 0, i);
		}
	}

	public static void sort(int[] array) {
		Arrays.sort(array);
	}

	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			swap(array, i, array.length - 1 - i);
		}

	}

	public static void flatten(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] /= 50;
			array[i] *= 50;
		}
	}

	public static void quickSort(int[] array) {
		quickArrange(array, 0, array.length);
	}

	private static void quickArrange(int[] array, int low, int high) {
		if (high - low <= 1) {
			return;
		}
		int pivot = array[high - 1];
		int partition = low - 1;

		for (int i = low; i < high - 1; i++) {
			if (array[i] < pivot) {
				partition++;
				swap(array, i, partition);

			}
		}
		swap(array, high - 1, partition + 1);
		draw(array);
		quickArrange(array, low, partition + 1);
		quickArrange(array, partition + 2, high);
	}

	public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length);
	}

	private static void mergeSort(int[] array, int low, int high) {
		if (high - low <= 1) {
			return;
		}

		int mid = (low + high) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid, high);

		int[] lower = Arrays.copyOfRange(array, low, mid);
		int[] higher = Arrays.copyOfRange(array, mid, high);

		int lowerIndex = 0;
		int higherIndex = 0;
		int index = low;

		while (lowerIndex < lower.length && higherIndex < higher.length) {
			if (lower[lowerIndex] < higher[higherIndex]) {
				array[index] = lower[lowerIndex];
				index++;
				lowerIndex++;
			} else {
				array[index] = higher[higherIndex];
				index++;
				higherIndex++;
			}

		}

		while (lowerIndex < lower.length) {
			array[index] = lower[lowerIndex];
			index++;
			lowerIndex++;
		}

		while (higherIndex < higher.length) {
			array[index] = higher[higherIndex];
			index++;
			higherIndex++;
		}
		draw(array);
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = i;
			int currentValue = array[i];
			while (current > 0 && currentValue < array[current - 1]) {
				// swap(array, current, current - 1);
				array[current] = array[current - 1];
				current--;
			}
			array[current] = currentValue;
			draw(array);
		}
	}

	public static void selectionSort(int[] array) {
		for (int j = 0; j < array.length - 1; j++) {

			int smallest = j;
			for (int i = j; j < array.length; i++) {
				if (array[i] < array[smallest]) {
					smallest = i;
				}
			}
		}
	}

	public static void bubbleSort(int[] array) {
		boolean swapped = true;

		while (swapped) {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					swap(array, i, i - 1);
					swapped = true;
				}
			}
			draw(array);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void initArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Window.random(0, Window.height());
		}
	}

	private static void draw(int[] array) {
		int barWidth = Window.width() / array.length;
		Window.out.background("white");
		for (int i = 0; i < array.length; i++) {
			Window.out.color(0, 255 * array[i] / Window.height(), 255 - 255
					* array[i] / Window.height());
			Window.out.rectangle(i * barWidth + barWidth / 2, Window.height()
					- array[i] / 2, barWidth, array[i]);
		}
		Window.frame();
	}
}
