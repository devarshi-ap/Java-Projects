/*
*
* @author devarshi
* @since 2020-10-10
*
*  WordPair constructor takes in 2 string params
*  and assigns them to local private string instance variables.
*  WordPair objects have access to the String methods getFirst and getSecond
*  that returns either the first element of a string pair, or the second.
*/

class WordPair {
     private String word1;
     private String word2;

     public WordPair(String w1, String w2) {
         word1 = w1;
         word2 = w2;
     }
     public String getFirst() {
         return word1;
     }
     public String getSecond() {
         return word2;
     }
     public String toString() {
         return "(" + word1 + ", " + word2 + ")";
     }
 }
 