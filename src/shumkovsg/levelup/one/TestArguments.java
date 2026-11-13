package shumkovsg.levelup.one;

public class TestArguments {

    public static void main(String[] args) {

        if (args.length != 0) {
            System.out.println("Your arguments are: ");
            for (String s : args) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("No arguments!");
        }
    }
}
