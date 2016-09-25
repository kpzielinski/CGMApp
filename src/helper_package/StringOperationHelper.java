package helper_package;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StringOperationHelper {
	
	public ArrayList<String> getColumn(String txt)
	{
		String[] arrayOfString = txt.split(Constants.SPACE);
		ArrayList<String> lista =new ArrayList<String>();
	
		lista.addAll(Arrays.asList(arrayOfString));
	
		return lista;
	};
	
	public String deleteChars(String txt)
	{
		String replaceText = txt.replace(Constants.COMMA, Constants.NO_CHAR).replace(Constants.POINT, Constants.NO_CHAR);
			
		return replaceText;
	}
	
	public int getLongestPart(ArrayList<String> list)
	{
		int longestPart = 0;
		
		for (int i=0; i<list.size(); i++)
		{
			if  (list.get(i).length() > longestPart)
			{
				longestPart = list.get(i).length();
			}
		}
		
		return longestPart;
	}
	
	public int getListSize(ArrayList<String> lista)
	{
		int size = lista.size();
		
		return size;
	}
	
	public void printColumns(ArrayList<String> list, int listSize, int longestElement)
	{	 
		if (this.checkModulo2(listSize))
		{
			this.print(list, listSize, longestElement);
		}		
		else			
		{
			this.print(list, listSize, longestElement);
	
			StringBuilder sb = new StringBuilder();
			
			for (int j = 1; j<= longestElement; j++)
			{
				sb.append(Constants.LAST_COLUMN_CHAR);
			}
			System.out.println(sb.toString() + Constants.SPACE +  list.get(listSize-1));
		}	
		
	}
	
	public void print(ArrayList<String> list, int listSize, int longestElement)
	{
		for (int i = 0;i < (listSize/2); i++)
		{
			System.out.println(list.get(i) + Constants.SPACE + list.get(i+(listSize/2)));
		}
	}
	
	public boolean checkModulo2(int listSize)
	{
		boolean modulo = false;
		
		if (listSize % 2 == 0)
		{
			modulo = true;
		}
		
		return modulo;
	}
	
	public void printInformationAboutList(int size, int longestPart)
	{
		System.out.println("W tekœcie znalaz³o siê " + Integer.toString(size) + " elementów.");
		System.out.println("Wyœwietlone kolumny maj¹ szerokoœæ " + Integer.toString(longestPart) + " znaków.");
		System.out.println();
	}
}
