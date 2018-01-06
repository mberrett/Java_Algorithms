public class Main {

    public static void main(String[] args) {
	StackX theStack = new StackX(10);
	theStack.push(20);
	theStack.push(40);
	theStack.push(60);
	theStack.push(80);

	while (!theStack.isEmpty())      // until it's empty
    {
        long value = theStack.pop(); // delete it from stack
        System.out.print(value);
        System.out.print(" ");       // display it
    } // end while
        System.out.println("");
    } // end main
}
