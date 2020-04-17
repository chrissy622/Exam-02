/*
Christina Nguyen
CSC 331 - 002
Test 2 Programming
 */

import java.util.ArrayList;

public interface IWords {
    //Inserts 'word' into the list
    public void add(String word);

    //Removes 'word' from list. Returns true if found.
    // Returns false if word is not in the list
    public boolean remove(String word);

    //Returns the index of the word or -1 if word is not present
    public int find(String word);

    //Returns a list of words, each of which has more than length characters
    public ArrayList<String> lengthMore(int length);

    //Returns a list of words, each of which is exactly 'length' characters longs
    public ArrayList<String> lengthEqual(int length);

    //Returns the word in the list with the most characters
    public String longest();

    //Returns the average length of all the words in the list
    public double averageLength();
}
