// Last updated: 21/07/2026, 23:11:03
class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        
       for(string word:words){

            int s=0;
            int e=word.length()-1;
            bool isPalindromic=true;
            while(s<=e){
                if(word[s]!=word[e]){
                    isPalindromic=false;
                    break;
                }
                s++;
                e--;
            }
            if(isPalindromic){
                return word;
            }
       }
       return "";
    }
};