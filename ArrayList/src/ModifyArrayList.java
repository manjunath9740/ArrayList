
public class ModifyArrayList {

	int arr[] = null;
	int capacity = 5;
	int size = 0;
	public Demo() {
		this.arr = new int[capacity];
	}
	public void add(int data) {
		modifyCapacity();
		arr[size++] = data;
		System.out.println(data+"is inserted value");
	}
	public void add(int data,int index) {
		if(index>(size-1)) {
			System.out.println("index out of range");
		}
		modifyCapacity();
		for(int i=size;i>index;i--) {
			arr[i] = arr[i-1];
		}
		
		arr[index] = data;
		size++;
		System.out.println(data+"is inserted value");
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(arr[i]).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
		
	}
	private void modifyCapacity() {
		if(size==capacity) {
			System.out.println("The array list is full");
			capacity = capacity+(capacity/2);
			System.out.println("The new capacity of array list is"+capacity);
			int newArray[] = new int[capacity];
			for(int i=0;i<size;i++) {
				newArray[i] = arr[i];
			}
			this.arr = newArray;
		}
	}
	public void remove(int index) {
		if(index>(size-1)||index<0) {
			System.out.println("Index out of range");
			return;
		}
		 int data = arr[index];
		 for(int i=index;i<size-1;i++) {
			 arr[i] = arr[i+1];
		 }
		 size--;
		 System.out.println(data+"removed from list");
	}
	public int indexOf(int data) {
		int index = -1;
		for(int i=0;i<size;i++) {
			if(arr[i]==data) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int lastIndexOf(int data) {
		int index = -1;
		for(int i=size-1;i>=0;i--) {
			if(arr[i]==data) {
				index = i;
				break;
			}
		}
		return index;
	}
	public void removeObject(int data) {
		remove(indexOf(data));
	}
	public int size() {
		return this.size;
	}
	public boolean contains(int data) {
		return indexOf(data) != -1;
	}
	public void clear() {
		this.size = 0;
	}
	public boolean isEmpty() {
		return this.size==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.add(10);
		d.add(20);
		d.add(30);
		System.out.println(d);
		d.add(40,1);
		System.out.println(d);
		d.add(50);
		d.add(60);
		System.out.println(d);
		d.add(70);
		d.add(80,0);
		System.out.println(d);
		d.remove(0);
		System.out.println(d);
		d.remove(3);
		d.remove(8);
		System.out.println(d);
		System.out.println("The indexof value 20 is"+d.indexOf(20));
		System.out.println("The last index of value 70 is"+d.lastIndexOf(70));
		d.removeObject(20);
		System.out.println(d);
		System.out.println("The size of the arraylist is"+d.size());
		System.out.println("The arraylist contains 80"+" "+d.contains(80));
		System.out.println("The arraylist is Empty"+d.isEmpty());
		d.clear();
		System.out.println("Arraylist is cleared");
	
	

	}

}



