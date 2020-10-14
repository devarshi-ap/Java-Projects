/*
*  Traverses through a string array containing words and
*  creates distinct dyads of elements and adds to arraylist.
*/


import java.util.ArrayList;


public class Array_Pairs
{
    public static void main(String[] args) {
	    
	    String[] words = {"Hi", "there", "Clark", "Lana"};
        ArrayList<String> allPairs = new ArrayList<>();
         
        for(int i=0; i < words.length; i++){
            for(int j=i+1; j < words.length; j++){
                allPairs.add( "(" + words[i] + ", " + words[j] + ")" );
            }
        }
        
        System.out.println(allPairs);
    }
}
