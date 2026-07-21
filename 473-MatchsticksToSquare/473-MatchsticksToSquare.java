// Last updated: 21/07/2026, 23:12:33
class Solution {
    public boolean solve(int []mat,int id,int [] sides,int tar){
        if(sides[0]==tar && sides[1]==tar && sides[2]==tar && sides[3]==tar) return true;

        for(int i=0;i<4;i++){
            if(mat[id]+sides[i]<=tar){
                sides[i]+=mat[id];
                if(solve(mat,id+1,sides,tar)) return true;
                sides[i]-=mat[id];
            }
            if(sides[i]==0) break;
        }
        return false;
    }
    public boolean makesquare(int[] matchsticks) {
        int [] sides = new int [4];
        int sum=0;
        for(int stick:matchsticks){
            sum+=(stick);
        }
        if(sum%4!=0) return false;
        if(matchsticks.length<4) return false;
        int target=sum/4;
        Arrays.sort(matchsticks);
        return solve(matchsticks,0,sides,target);
    }
}