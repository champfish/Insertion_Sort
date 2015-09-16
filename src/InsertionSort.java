//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<>();
	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		if(list.size()==0)
		{
			list.add(word);
			return;
		}
		int inputIndex=0;
		for(int i=0; i<list.size(); i++)
		{
			if(word.compareTo(list.get(i))>0)
			{
				inputIndex=i;
				System.out.println(word+i);
			} 
		}
		list.add(inputIndex,word);
	}

	private int findInsertLocation( String word )
	{
      return -1;
	}

	public void remove(String word)
	{
	}

	public String toString()
	{
		for(String s: list)
			System.out.print(s + " ");
		System.out.println();
		return "";
	}
}