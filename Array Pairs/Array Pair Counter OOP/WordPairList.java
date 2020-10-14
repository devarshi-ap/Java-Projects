import java.util.*;

 public class WordPairsList
 {
     private ArrayList<WordPair> allPairs;

     public WordPairsList(String[] words)
     {
         // WRITE YOUR CODE HERE
         // initialize allPairs to an empty ArrayList of WordPair objects
		 allPairs = new ArrayList<WordPair>();
         // nested loops through the words array to add each pair to allPairs
         for(int i=0; i < words.length; i++){
             for(int j=i+1; j < words.length; j++){
                 allPairs.add( new WordPair(words[i], words[j]) );
              }
         }

     }

     public int numMatches()
     {
         int count = 0;
         for(WordPair a : allPairs){
             if( (a.getFirst() ).equals(a.getSecond() )){
                 count++;
             }
         }
         return count;
     }

     public String toString() {
         return allPairs.toString();
     }


     public static void main(String[] args)
     {
         String[] words = {"Hi", "there", "Tyler", "Sam"};
         WordPairsList list = new WordPairsList(words);
         System.out.println(list);
         // For second part below, uncomment this test:
         System.out.println("The number of matched pairs is: " + list.numMatches());
     }
 }
