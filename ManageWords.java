/*
Christina Nguyen
CSC 331 - 002
Test 2 Programming
 */

import java.util.ArrayList;

public class ManageWords implements IWords{

    private ArrayList<String> manageWords;

    public ManageWords() {
        this.manageWords = new ArrayList<String>();
    }

    //Prints all elements of the array
    public void printArray() {
        if (this.manageWords.size() == 0) {
            System.out.println("The array list is empty.");
        }
        else {
            System.out.println("Current array state: ");
            System.out.println(this.manageWords);
        }

    }

    @Override
    //Inserts 'word' into the list
    public void add(String word) {
        this.manageWords.add(word);
    }

    //Removes 'word' from list. Returns true if found.
    // Returns false if word is not in the list
    @Override
    public boolean remove(String word) {
        if (manageWords.size() == 0) {
            System.out.println("The array list is empty.");
        }
        else {
            for (int i = 0; i <= manageWords.size() - 1; i++) {
                if (manageWords.get(i).equals(word)) {
                    manageWords.remove(i);
                    return true;
                }
            }
        }
        return false ;
    }

    //Returns the index of the word or -1 if word is not present
    @Override
    public int find(String word) {
        int index = -1;
        if (manageWords.size() == 0) {
            System.out.println("The array list is empty.");
        }
        else {
            for (int i = 0; i <= manageWords.size() - 1; i++) {
                if (manageWords.get(i).equals(word)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    //Returns a list of words, each of which has more than length characters
    @Override
    public ArrayList<String> lengthMore(int length) {
        ArrayList<String> longer = new ArrayList<String>();
        if (manageWords.size() == 0) {
            System.out.println("The array list is empty.");
        }
        else {
            for (String s : this.manageWords) {
                if (s.length() > length) {
                    longer.add(s);
                }
            }
        }

        return longer;
    }

    //Returns a list of words, each of which is exactly 'length' characters longs
    @Override
    public ArrayList<String> lengthEqual(int length) {
        ArrayList<String> equalLength = new ArrayList<String>();
        if (manageWords.size() == 0) {
            System.out.println("The array list is empty.");
        }
        else {
            for (String s : this.manageWords) {
                if (s.length() == length) {
                    equalLength.add(s);
                }
            }
        }
        return equalLength;
    }

    //Returns the word in the list with the most characters
    @Override
    public String longest() {
        String longest = null;
        int longestCount = 0;
        if (manageWords.size() == 0) {
            System.out.println("The array list is empty.");
        }
        else {
            for(String s : this.manageWords) {
                if (s.length() > longestCount) {
                    longest = s;
                    longestCount = s.length();
                }
            }
        }
        return longest;
    }

    //Returns the average length of all the words in the list
    @Override
    public double averageLength() {
        double letters = 0;
        for (String s : this.manageWords) {
            letters = letters + s.length();
        }
        return letters / (double) this.manageWords.size();
    }
}
