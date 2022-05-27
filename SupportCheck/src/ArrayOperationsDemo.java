
public class ArrayOperationsDemo {

	int[] arr;
	int capacity;
	int size=0;

	//parametrised constructor
	ArrayOperationsDemo(int capacity){
	this.capacity= capacity;
	arr= new int[capacity];
	}
	//inserting element at end
	void insert(int element) {
	if(size==capacity)
	growArray();
	arr[size++]= element;
	}
	//inserting element at index
	void insertAtIndex(int element, int index) {
	if(size-1==capacity)
	growArray();
	for(int i=index; i<size; i++) {
	arr[i+1]=arr[i];
	}
	arr[index]= element;
	size++;
	}
	//deleting element form end
	int delete() {
	int deletedElement= arr[size-1];
	size--;
	return deletedElement;
	}
	//deleting element at index
	int deleteAtIndex(int index) {
	int deletedElement= arr[index];
	for(int i=index+1; i<size; i++) {
	arr[i-1]= arr[i];
	}
	return deletedElement;
	}
	//searching by element
	boolean searchElement(int element) {
	for(int i=0; i<size; i++) {
	if(arr[i]==element)
	return true;
	}
	return false;
	}
	//sorting using Bubble Sort
	void bubbleSort() {
	for(int i=0; i<size; i++) {
	//for(int j=0; j<=size-1-i; j++) {
		for(int j=0; j<=size-1; j++) {
	if(arr[j]>arr[j+1]) {
	int temp= arr[j];
	arr[j]= arr[j+1];
	//arr[j+1]= arr[j];
	arr[j+1]=temp;
	}
	}
	}
	}
	//traversing array
	void traverse() {
	System.out.print("\nCurrent array is ");
	//for(int i=0; i<size; i++) {
		for(int i=0; i<=size; i++) {
	System.out.print(arr[i]+" ");
	}
	}
	//growing the array
	void growArray() {
	int[] temp= new int[2*size];
	for(int i=0; i<size; i++)
	temp[i]=arr[i];
	arr= temp;
	capacity= 2*size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperationsDemo demo= new ArrayOperationsDemo(3);

		//invoking methods for operations
		demo.insert(71);
		demo.insert(22);
		demo.insert(33);
		demo.insert(20);
		demo.traverse();
		//demo.insertAtIndex(44,1);
		//demo.insertAtIndex(55, 0);
		//demo.traverse();
		//demo.delete();
		//demo.deleteAtIndex(2);
		//demo.searchElement(22);
		demo.bubbleSort();
		demo.traverse();
	}

}
