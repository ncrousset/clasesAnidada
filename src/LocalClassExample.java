public class LocalClassExample {

    public  static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();

        int currentValue = counter.getValue();
        System.out.println("Valor actual del contador: " + currentValue);
    }
}


class Counter {
    private int value = 0;

    public void increment(){
        class LocalCounter {
            void increase() {
                value++;
            }
        }

        LocalCounter localCounter = new LocalCounter();
        localCounter.increase();
    }

    public int getValue() {
        return value;
    }
}