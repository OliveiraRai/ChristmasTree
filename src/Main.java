import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // greetings message
        System.out.println("\nChristmas Tree Generator");

        // variables needed
        String rawHeight;
        int height;
        String tree = "*";
        String blankSpace = " ";

        do {
            // gathering value
            System.out.print("\nPlease, enter the tree height: ");
            rawHeight = scanner.nextLine().trim();

            // validating value
            if(!MyUtil.isInteger(rawHeight)) {
                System.out.println("Invalid input detected.");
                continue;
            }

            // parsing value
            height = Integer.parseInt(rawHeight);
            break;
        } while(true);

        // for better looking output
        System.out.println();

        // I needed to do this
        if(height == 0) {
            System.out.println("Behold, the Schrodinger's christmas tree.");
        }

        // tree generator logic
        for(int i = height - 1; i >= 0; i--) {
            String fSpaces = blankSpace.repeat(i);
            System.out.print(fSpaces);

            int treeFormula = 2 * (height - i) - 1;

            String fTree = tree.repeat(treeFormula);
            System.out.println(fTree);
        }

        scanner.close();
    }
}
