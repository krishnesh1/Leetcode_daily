// Last updated: 21/07/2026, 23:12:05
import java.util.*;
class Solution {

    public boolean isPalindrom(String s){

        int start = 0;
        int e = s.length()-1;
        while(start<=e){
            if(s.charAt(start)!=s.charAt(e)){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        
        int cnt =0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                String sub = s.substring(i,j);

                if(isPalindrom(sub)){
                    cnt++;
                }
            }
            
        }

        return cnt;
    }
}