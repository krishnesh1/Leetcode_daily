// Last updated: 21/07/2026, 23:11:11
class Solution {
public:
    bool checkIfPangram(string sentence) {
        int hash[26]={0};
        for(int i=0;i<sentence.size();i++){
            char ch=tolower(sentence[i]);
            hash[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]<1){
                return false;
            }
        }
        return true;
    }
};