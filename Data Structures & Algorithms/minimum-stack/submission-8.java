class MinStack {

    private ArrayList<Integer> internal;
    private ArrayList<Integer> min;

    public MinStack() {
        this.internal = new ArrayList<>();
        this.min = new ArrayList<>();
    }
    
    public void push(int val) {
        if (this.internal.isEmpty())
            min.add(val);
        else
            if (this.min.get(this.min.size()-1) >= val) {
                min.add(val);
                System.out.println("New min : " + this.min.get(this.min.size()-1));
            }
        this.internal.add(val);

    }
    
    public void pop() {
        if (this.internal.get(this.internal.size()-1).equals(this.min.get(this.min.size()-1)))
            this.min.remove(this.min.size()-1);
        this.internal.remove(this.internal.size()-1);
    }
    
    public int top() {
        return this.internal.get(this.internal.size()-1);
    }
    
    public int getMin() {
        return this.min.get(this.min.size()-1);
    }
}
