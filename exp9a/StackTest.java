package exp9a;

interface Stack{
    public void push(int item);
    public int pop();
    public boolean isEmpty();
    public boolean isFull();
}

class StackImpl implements Stack{
    int[] stack;
    int top;
    int size;

    StackImpl(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = item;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }
}

public class StackTest {
    public static void main(String[] args) {
        StackImpl s = new StackImpl(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
