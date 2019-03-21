package WordSorter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private static String[] wordRay;

	public  WordSortTwo(String sentence)
	{
            wordRay = sentence.split("\\s+");
	}
	public void sort()
	{
            Arrays.sort(wordRay);
            /*
            String t = "";
            for(int i = 1; i < wordRay.length; i++){
                if(wordRay[i].compareTo(wordRay[i-1]) > 0){
                    t = wordRay[i-1];
                    wordRay[i-1] = wordRay[i];
                    wordRay[i] = t;
                }
            }*/
	}

	public String toString()
	{
		String output="";
                for(int i = 0; i < wordRay.length; i++){
                    output += (wordRay[i] + "\n");
                }
		return output+"\n\n";
	}
}