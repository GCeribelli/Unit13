package WordSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
        m = new String[size][size];
        int ind = 0;
        for(int i = 0; i < size; i++){
            for(int n = 0; n < size; n++){ 
                m[i][n] = str.substring(ind, ind + 1);
                ind++;
            }
        }
    }

    public boolean isFound( String word )
    {
        for(int i = 0; i < m.length; i++){
            if(checkRight(word, i, 0)){return true;}
            if(checkLeft(word, i, 0)){return true;}
            if(checkUp(word, 0, i)){return true;}
            if(checkDown(word, 0, i)){return true;}
            if(checkDiagUpRight(word, i, i)){return true;}
            if(checkDiagDownRight(word, i, i)){return true;}
            if(checkDiagUpLeft(word, i, i)){return true;}
            if(checkDiagDownLeft(word, i, i)){return true;}
        }
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
        {       
                String line = "";
                for(String i: m[r])
                    line+=i;
                for(int i = c; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String line = "";
                for(int i = m[r].length-1; i >= 0; i--)
                    line+=m[r][i];
                for(int i = c; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
                String line = "";
                for(int i = m[r].length-1; i >= 0; i--)
                    line+=m[i][c];
                for(int i = 0; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
        }

	public boolean checkDown(String w, int r, int c)
        {
                String line = "";
                for(int i = 0; i < m[r].length-1 ; i++)
                    line+=m[i][c];
                for(int i = 0; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String line = "";
                for(int i = 0; i < m[r].length-1 ; i++)
                    line+=m[7-i][i];
                for(int i = 0; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String line = "";
                for(int i = m[r].length-1; i >= 0; i--)
                    line+=m[i][i];
                for(int i = 0; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String line = "";
                for(int i = 0; i < m[r].length-1 ; i++)
                    line+=m[i][7-i];
                for(int i = 0; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String line = "";
                for(int i = 0; i < m[r].length-1 ; i++)
                    line+=m[i][i];
                for(int i = 0; i < m[r].length - w.length(); i++){
                    if(w.equals(line.substring(i, i+w.length()))){return true;}}                    
		return false;
	}

    public String toString()
    {
 	String output = "";
        for(int i = 0; i < m.length; i++){
            for(int n = 0; n < m[i].length; n++){   
                output += m[i][n]+" ";}
            output += "\n";
        }
        return output;
    }
}
