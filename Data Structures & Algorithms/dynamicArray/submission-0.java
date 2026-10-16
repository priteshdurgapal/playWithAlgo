class DynamicArray {

    private int capacity;
    private int[] darray;
    private int size; 

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size=0;
        this.darray = new int[capacity];
    }

    public int get(int i) {
        return darray[i];
    }

    public void set(int i, int n) {
        darray[i]=n;
    }

    public void pushback(int n) {
        if(size==capacity) {
            resize(); 
        } 
        darray[size]=n;
        size++;
        
    }

    public int popback() {
        if(size>0) {
           size--;
            
        }
        return darray[size];
    }

    private void resize() {
        capacity*=2;
        int[] newArr = new int[capacity];
        for(int i=0;i<size;i++) {
            newArr[i]=darray[i];
        }
        darray = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
