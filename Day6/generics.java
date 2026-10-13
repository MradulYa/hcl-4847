package Day6;

// Generic class
class Box<T> {
    private T value;

    // Constructor
    Box(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class generics {
    // Generic method
    public static <U> void printItem(U item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        // Using Box with Integer
        Box<Integer> intBox = new Box<>(100);
        System.out.println("Integer Box: " + intBox.getValue());

        // Using Box with String
        Box<String> strBox = new Box<>("Hello Generics");
        System.out.println("String Box: " + strBox.getValue());

        // Calling generic method
        printItem(3.14);
        printItem("Generic Method Example");
    }
}

