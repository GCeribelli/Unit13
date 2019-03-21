package NumberShifter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] a = new int[size];
                for(int i = 0; i < size; i++)
                    a[i] = (int)(Math.random() * 10) + 1;
                System.out.println(Arrays.toString(a));
                return a;
	}
	public static void shiftEm(int[] array)
	{
            int temp = 0;
            int ind7 = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] == 7){
                    temp = array[ind7];
                    array[ind7] = 7;
                    array[i] = temp;
                    ind7++;
                }
            }
            System.out.println(Arrays.toString(array));
	}
}