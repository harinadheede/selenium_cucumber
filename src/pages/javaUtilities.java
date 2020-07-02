package pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;

public class javaUtilities {
	
	
	public String returnCurrentDate() {
		
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);
		return strDate;
		
	    
//	    output ila vastundhi -[ 07/02/2020 but manaki ila ravali - 7/2/2020 -- remove zeros only if 1-9
	    
	    
	}
	
	public String removeExtraZeros(String sValue) {
		
		if(sValue.startsWith("0")) {
			sValue = sValue.replaceAll("0", "");
			
		}
		return sValue;
		
	}
	
	
	public int returnLowValue(List<WebElement> li) {
		
		List lDurationTime = new ArrayList<Integer>();		
		for(int i=0;i<li.size();i++) {
			String sDuration = li.get(i).getText();
			String sDurationtrim = sDuration.replaceAll("Trip Duration ", "");
			lDurationTime.add(Integer.parseInt(sDurationtrim));						
		}
		Collections.sort(lDurationTime);
		
		
		int ifastestflightTime = (int) lDurationTime.get(0);
		
		return ifastestflightTime;
	}
	
	public boolean verifymultipleFastestFlights(int iTime, List<Integer> l) {		
		boolean bResult = true;
		int icount = 0;		
		for(int k=0;k<(int) l.size();k++) {
			if(iTime==l.get(k)) {
				icount++;
			}
		}
		if(icount>1) {
			bResult = false;			
		}
		return bResult;		
	}
}
