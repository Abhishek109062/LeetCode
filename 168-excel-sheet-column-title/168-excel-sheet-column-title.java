class Solution {
     public String convertToTitle(int columnNumber) {
		String s="";
         while (columnNumber > 26) {
			int rem = columnNumber % 26;
			if (rem == 0) {
				s='Z'+s;
                columnNumber -= 26;
			} else
				s=(char) (rem + 'A' - 1)+s;
			columnNumber /= 26;
		}
		s=(char) (columnNumber + 'A' - 1)+s;
		return s;
    }
}