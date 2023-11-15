
    class Queue {
        int size = 5;
        int front, rear;
        int[] A = new int[size];

        Queue() {
            front = -1;
            rear = -1;

        }

        boolean isFull() { // if the queue is full
            return front == 0 && rear == size - 1;
        }

        public boolean isEmpty() { // Queue is empty or no
            if (front == -1)
                return true;
            else
                return false;
        }

        /* insert elements to the queue */
        void enqueue(int n) {

            // if queue is full
            if (isFull()) { // or rear=size-1
                System.out.println("Queue is full");
            } else {
                if (front == -1) {//when it is full front =0
                    // mark front denote first element of queue
                    front = 0;
                }

                rear++;//we will increment the rear since insert element at rear
                // insert element at the rear
                A[rear] = n;
                System.out.println("Insert " + n);
            }
        }

        // delete element from the queue
        int dequeue() {
            int element;

            // if queue is empty
            if (isEmpty()) {//front=-1
                System.out.println("Queue is empty");
                return (-1);
            } else {
                // remove element from the front of queue
                element = A[front];

                // if the queue has only one element
                if (front >= rear) {
                    front = 0;
                    rear = 0;
                } else {
                    // mark next element as the front
                    front++;
                }
                System.out.println(element + " Deleted");
                return (element);
            }
        }

        // display element of the queue
        public void display() {
            int i;
            if (isEmpty()) System.out.println("Empty Queue");
            else {
                // display the front of the queue
              //  System.out.println("\nFront index-> " + front);

                // display element of the queue
                System.out.println("Items -> ");
                for (i = front; i <= rear; i++)
                    System.out.print(A[i] + "  ");

                // display the rear of the queue
                System.out.println("\nRear index-> " + rear);
            }
        }

        public static void main(String[] args) {

            // create an object of Queue class
            Queue q = new Queue();

            // try to delete element from the queue
            // currently queue is empty
            // so deletion is not possible

            q.dequeue();
            // insert elements to the queue
            for (int i = 1; i < 6; i++) {
                q.enqueue(i);
            }

            // 6th element can't be added to queue because queue is full
            q.enqueue(6);

            q.display();

            // deQueue removes element entered first i.e. 1
            q.dequeue();
        
            // Now we have just 4 elements
            q.display();

        }
    }

