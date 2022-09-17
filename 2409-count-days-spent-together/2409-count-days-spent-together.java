class Solution {
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
         String from = "";
         if(aA.compareTo(aB) <= 0) {
             from = aB;
         }else{
             from = aA;
         }
        String to = "";
        if(lA.compareTo(lB) <= 0) {
             to = lA;
         }else{
             to = lB;
         }
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aM = Integer.parseInt(from.substring(0,2));   // aM = arriveMonth
        int aD = Integer.parseInt(from.substring(3));    // aD = arriveDate
        int lM = Integer.parseInt(to.substring(0,2));    //lM = leaveMonth
        int lD = Integer.parseInt(to.substring(3));      //lD = leaveDate
        if(lM < aM) return 0;                                  
        else if(aM == lM && aD>lD) return 0;        
        else if(aM == lM && aD<=lD) {
            return lD-aD+1;
        }else{
           int k = lM-aM-1;
            int cntDays = 0;
            int temp = aM;
            while(k-->0) {
                cntDays+=days[temp++];
            }
            return cntDays+(days[aM-1]-aD)+lD+1;
        }
        
        
    }
}