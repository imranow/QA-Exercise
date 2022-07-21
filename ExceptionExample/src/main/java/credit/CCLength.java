package credit;

import com.InvalidCCException;

public class CCLength {
	public void CheckCCLength(String ccNo) throws InvalidCCException
	{
		if (ccNo.length()!=16) {
			
			throw new InvalidCCException("Invalid CC number");
		}	
		else
			System.out.println("Please make payment");
	}

}
