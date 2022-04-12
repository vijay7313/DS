package Arrays;

public class Array {
	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
	}

	public void insert(int item) {
		if (items.length == count) {
			int[] NewItems = new int[count * 2];
			for (int i = 0; i < count; i++)
				NewItems[i] = items[i];

			items = NewItems;
		}

		items[count++] = item;

	}

	public void remove(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		count--;
	}

	public int indexof(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item)
				return i;
		}
		return -1;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
}
