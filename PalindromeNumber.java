package leetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber pn = new PalindromeNumber();
		int num = 121;
		System.out.println(pn.isPalindrome1(num));
	}
	
	
	//Get the reverse number of the given input and compare it to check palindrome
	public boolean isPalindrome(int num)
	{
		int revNum = 0;
		int temp = num;
		if(num < 0 || (num !=0 && num%10==0))
			return false;
		while(num != 0)
		{
			revNum = (revNum * 10) + num %10;
			num = num /10;
		}
		
		if(revNum == temp)
			return true; 
		
		return false;
	}
	
	//With use of stringbuffer and use out of box to reverse the number
	public boolean isPalindrome1(int num)
	{
		StringBuffer sb = new StringBuffer(String.valueOf(num));
	    sb.reverse();
	  
		if(String.valueOf(num).equals(sb.toString()))
			return true; 
		return false;
	}

}
