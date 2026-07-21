// Last updated: 21/07/2026, 23:11:05
class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        
        int maxWord=0;
        for(int i=0;i<sentences.size();i++){
            int wordCount=1;
            for(int ch:sentences[i]){
                if(ch == ' '){
                    wordCount++;
                }
            }
            if(wordCount>maxWord){
                maxWord=wordCount;
            }
        }
        return maxWord;
    }
};