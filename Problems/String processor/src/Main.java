import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        while (true) {
            String txt = scanner.nextLine();
            boolean hasLowerCase = !txt.equals(txt.toUpperCase());
            if (!hasLowerCase) {
                System.out.println("FINISHED");
            }
            if (hasLowerCase) {
                System.out.println(txt.toUpperCase());
            }
        }
    }
}