class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int start=0;
        int end=arr.length;
        int lower_bound=0;
        while(start < end){
          int mid =(start+end)/2;
          
            if(target<arr[mid][0]){
                end=mid;   
            }
            else if(target>arr[mid][0]){
                lower_bound=mid;
                start=mid+1;
            }
            else{
                return true;
            } 
        }
    
        start=0;
        end=arr[0].length;
        while(start < end){
            int mid=(start+end)/2;
            
            if(target<arr[lower_bound][mid]){
                end=mid;
            }
            else if(target>arr[lower_bound][mid]){
                start=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    