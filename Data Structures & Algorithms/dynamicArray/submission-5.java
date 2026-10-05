class DynamicArray {

    int[] internalArray;
    int size;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.internalArray = new int[capacity];
            this.size = 0;
        }
    }

    public int get(int i) {
        return this.internalArray[i];
    }

    public void set(int i, int n) {
        if (i >= 0 && i < this.getSize())
            this.internalArray[i] = n;
    }

    public void pushback(int n) {
        if (this.getSize() == this.getCapacity())
            this.resize();

        this.internalArray[this.getSize()] = n;
        ++this.size;
    }

    public int popback() {
        int result =  this.internalArray[this.getSize()-1];
        --this.size;
        return result;
    }

    private void resize() {
        int n = this.internalArray.length;
        int[] newArray = new int[2*n];


        for (int i = 0; i < n; ++i)
            newArray[i] = this.internalArray[i];

        this.internalArray = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.internalArray.length;
    }
}
