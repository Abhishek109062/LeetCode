class MyCircularQueue {
    int length = 0;
        int left = -1;
        int right = 0;
    int ar[];
    public MyCircularQueue(int k) {
        ar = new int[k];
        // length = k;
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            left = (left+1) % ar.length;
            ar[left] = value;
            length++;
            return true;
        }
        else
            return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            right = (right+1) % ar.length;
            length--;
            return true;
        }
        else
            return false;
    }
    
    public int Front() {
        return isEmpty() ? -1 : ar[right];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : ar[left];
    }
    
    public boolean isEmpty() {
        return length == 0;
    }
    
    public boolean isFull() {
        return length == ar.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */