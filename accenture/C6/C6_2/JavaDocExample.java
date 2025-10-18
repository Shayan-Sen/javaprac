package accenture.C6.C6_2;

/**
 * This is my first JavaDoc
 * @author Shayan Sen
 */
public class JavaDocExample {
    
    /**
     * This is my first method
     * @param name Name of the person
     * @param age Age of the person
     * @return Nothing
     */
    public static void Hello(String name,int age){
        // Prints Hello message
        System.out.printf("Hello everyone, I am %s. I am %d years old\n",name,age);
    }

    /**
     * Main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Should print  - Hello everyone, I am Shayan Sen. I am 22 years old
        Hello("Shayan Sen", 22);
    }
}
