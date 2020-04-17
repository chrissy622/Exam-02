/*
Christina Nguyen
CSC 331 - 002
Test 2 Programming
 */

public class TestManageWords {
    public static void main(String[] args) {
        ManageWords prog = new ManageWords();
        prog.printArray();
        System.out.println(">> Testing add(String word)...");
        prog.add("hello");
        prog.add("professor");
        prog.add("cards");
        prog.add("vaccuum");
        prog.add("nintendo");
        prog.add("persimmon");
        prog.add("anniversary");
        prog.add("crossing");
        prog.add("laptop");
        prog.add("scissors");
        prog.add("jamaica");
        prog.add("keys");
        prog.printArray();

        System.out.println("\n>> Testing remove(String word)...'");
        System.out.println("cards: " + prog.remove("cards"));
        System.out.println("laptop: " + prog.remove("laptop"));
        System.out.println("nonexistent: " + prog.remove("nonexistent"));
        prog.printArray();

        System.out.println("\n >> Testing find(String word)...");
        System.out.println("'nintendo' at index: " + prog.find("nintendo"));
        System.out.println("'hello' at index: " + prog.find("hello"));
        System.out.println("'nonexistent' at index: " + prog.find("nonexistent"));

        System.out.println("\n >> Testing lengthMore(int length)...");
        System.out.println("Words with a length greater than (5): " + prog.lengthMore(5));
        System.out.println("Words with a length greater than (8): " + prog.lengthMore(8));

        System.out.println("\n >> Testing lengthEqual(int length)...");
        System.out.println("Words with a length equal to (5): " + prog.lengthEqual(5));
        System.out.println("Words with a length equal to (8): " + prog.lengthEqual(8));

        System.out.println("\n >> Testing longest()...");
        System.out.println("Word with the longest length: " + prog.longest());

        System.out.println("\n >> Testing averageLength()...");
        System.out.println("The average length of all the words is: " + prog.averageLength());





    }
}
