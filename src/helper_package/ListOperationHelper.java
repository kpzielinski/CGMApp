package helper_package;

import java.util.ArrayList;

public class ListOperationHelper {
	
	public int listLongestPart;
	public int listSize;
	
	
	public ListOperationHelper getLongestPartAndListSize(ArrayList<String> list)
	{
		ListOperationHelper loh = new ListOperationHelper();

		loh.listLongestPart = this.checkLongestPart(this.getLongestPart(list));
		loh.listSize = this.getListSize(list);
		
		return loh;
		
	}
	
	private int getLongestPart(ArrayList<String> list)
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
	
	private int getListSize(ArrayList<String> list)
	{
		int size = list.size();
		
		return size;
	}
	
	private int checkLongestPart(int longestPart)
	{
		int columnWidth = 0;
		
		if (longestPart > Constants.COLUMN_WIDTH )
		{
			columnWidth = longestPart;
		}
		
		else
			
		{
			columnWidth = Constants.COLUMN_WIDTH;
		}
		
		return columnWidth;
		
	}
	
	public ArrayList<String> addCharsToList(ArrayList<String>list, int listSize, int columnWidth)
	{
		for (int i = 0; i<listSize; i++)
		{
			if (list.get(i).length() < columnWidth)
			{
				StringBuilder sb = new StringBuilder();
				for (int j = list.get(i).length(); j< columnWidth; j++)
				{
					sb.append(Constants.ADD_TO_COLUMN_CHAR);
				}
				list.set(i, list.get(i) + sb.toString());
			}
		}
		
		return list;
	}

}
