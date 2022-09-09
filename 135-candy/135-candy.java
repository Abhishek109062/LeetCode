class Solution {
    public int candy(int[] ratings) {
        int candies[]  = new int[ratings.length];
        for(int x = 0 ;x < candies.length ;x++)
            candies[x]=1;//asssign 1 candy to every child
        
        for(int x = 1 ;x < ratings.length ;x++){
            if(ratings[x] > ratings[x-1])
                candies[x]= candies[x-1]+1;//right child as 1 more candy then left child
        }
        
        for(int x = ratings.length-2 ;x >= 0 ;x--){
            if(ratings[x] > ratings[x+1])
                candies[x] = candies[x] > candies[x+1]+1 ? candies[x] : candies[x+1]+1;
            
        }
        int sum = 0;
        for( int x : candies)
            sum += x;
        
        return sum;
    }
}