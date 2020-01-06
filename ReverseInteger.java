package leetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = -785;
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverseInt1(num));
	}
	
	//Reversing the integer with mod operator and then checking the final reversed string with maximum and minimum integer value to check overflow
	public int reverseInt(int num)
	{
		int revNum = 0;
		while(num != 0)
		{
			revNum = (revNum * 10) + num %10;
			num = num /10;
		}
		if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE)
			return 0;
		return revNum;
	}
	
	//Reversing the integer with mod operator and checking the newly formed reverse number with earlier to check overflow
	public int reverseInt1(int num)
	{
		int newResult=0,  revNum=0, end = 0;
		
		while(num != 0)
		{
			end = num %10;
			newResult = (newResult * 10) + end;
			
			if((newResult - end)/10 != revNum)
				return 0;
			
			revNum = newResult;
			num = num /10;
		}
		return revNum;
	}

}
