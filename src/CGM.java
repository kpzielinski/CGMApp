import helper_package.StringOperationHelper;
import helper_package.Constants;
import helper_package.ListOperationHelper;

import java.lang.Object;
import java.util.ArrayList;


public class CGM {
	
	public static void main(String[] args) {
		
		StringOperationHelper soh = new StringOperationHelper();
		ListOperationHelper loh = new ListOperationHelper();
		ArrayList<String> lista = soh.getColumn(soh.deleteChars(Constants.TEXT_TO_PRINT));
				
		loh = loh.getLongestPartAndListSize(lista);
		lista = loh.addCharsToList(lista, loh.listSize, loh.listLongestPart);
		
		soh.printInformationAboutList(loh.listSize, loh.listLongestPart);
		soh.printColumns(lista, loh.listSize, loh.listLongestPart);

	}

}
