 public class MyStack {

        private Double[] stack;
        private int stackSize;
        private int capacity;

        public MyStack(int capacity) {
            this.stack = new Double[capacity];
            this.stackSize = 0;
            this.capacity = capacity;
        }


        public boolean isEmpty() {


            return stackSize == 0;
        }

        public boolean isFull() {


            return stackSize == capacity;

        }
        public void push(double value) {
            stack[stackSize] = value;
            stackSize++;
        }
        public double pop() {
            if(isEmpty()) {
                System.out.println("Stack ist leer");
                return Double.NaN;
            }
            stackSize--;
            return stack[stackSize];
        }
    }

