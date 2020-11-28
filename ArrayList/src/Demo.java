
public class Demo {
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
	

	}

}
