package NumberShifter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter a = new NumberShifter();
                a.shiftEm(a.makeLucky7Array(10));
                System.out.println("\n");
                NumberShifter b = new NumberShifter();
                b.shiftEm(b.makeLucky7Array(10));
                System.out.println("\n");
                NumberShifter c = new NumberShifter();
                c.shiftEm(c.makeLucky7Array(10));
                
	}
}



