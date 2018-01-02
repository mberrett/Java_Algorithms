public class Main {
    
    public static void main(String[] args) {

        int maxSize = 10;
        ClassDataArray arr;

        arr = new ClassDataArray(maxSize);

        arr.insert("Matias", "Berretta", 24);
        arr.insert("Juan Bautista", "Berretta", 22);
        arr.insert("Catalina", "Berretta", 20);

        arr.displayA();
    }
}
