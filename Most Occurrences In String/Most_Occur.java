/*
*
* @author dev
* @since 2020-09-21
*
* Find the most occurring letter in a predefined string by looping through string and using charAt() method.
*/


public class Most_Occur
{
    public static void main(String[] args) {
		String word = "CCAAAAAATTT!";
		char MaxLetter = word.charAt(0);
		int MaxOcc = 0;
		int wordLength = word.length();
		
		
		//loop thru word
		for(int i=0; i<wordLength; i++) {
		    
		    //temporaray occurences counter
		    int tempOcc = 0;
		    
		    //check words ahead of the current index letter to see if they're same
		    for(int j=i+1; j<wordLength; j++) {
		        
		        if(word.charAt(i) == word.charAt(j)){
		            tempOcc++;    
		        } else {
		            break;
		        }
		    }
		    
		    
		    if(tempOcc > MaxOcc){
		        MaxOcc = tempOcc;
		        MaxLetter = word.charAt(i);
		    }
		    
		}
		
		
		System.out.printf("%c has the most consecutive occurences: %d%n", MaxLetter, MaxOcc);
		
	}
}
