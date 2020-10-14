/*
* @author devarshi
* @since 2020-10-10
*
* Creates word pairs from array and traverses through list with pairs
* and counts number of matched pairs (pairs that have 2 of the same strings)
*/


 import java.util.*;


 public class WordPairsList
 {
     private ArrayList<WordPair> allPairs;	//private instance list

     // constructor
     public WordPairsList(String[] words)
     {
         // initialize allPairs to an empty ArrayList of WordPair objects
	 allPairs = new ArrayList<WordPair>();
	     
         // nested loops through the words array to add each pair to allPairs
         for(int i=0; i < words.length; i++){
             for(int j=i+1; j < words.length; j++){
                 allPairs.add( new WordPair(words[i], words[j]) );
              }
         }
     }

	 
     // loops through allPairs list and checks if pair elements are identical strings (increments count)
     // WordPair object 'a' uses getFirst() and getSecond() to check for matched pairs of elements. See WordPair file
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


     //to String method	 
     public String toString() {
         return allPairs.toString();
     }


     //Main method creates 'list' object and outputs list elements and number of matches
     public static void main(String[] args)
     {
         String[] words = {"Hi", "there", "Tyler", "Sam"};
         WordPairsList list = new WordPairsList(words);
         System.out.println(list);

         System.out.println("The number of matched pairs is: " + list.numMatches());
     }
 }
