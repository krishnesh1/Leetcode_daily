// Last updated: 21/07/2026, 23:15:23
class Solution {
    List<String>res=new ArrayList<>();;
    public void sol(int n,String str, int op,int cl){
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        if(op<n) sol(n,str+"(",op+1,cl);
        if(cl<op) sol(n,str+")",op,cl+1);
    }
    public List<String> generateParenthesis(int n) {
        sol(n,new String(),0,0);
        return res;
    }
}