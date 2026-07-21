// Last updated: 21/07/2026, 23:11:45
class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int l=0,r=0,maxlen=0;
        map<int,int>mpp;
        int n=fruits.size();
        while(r<n){
            mpp[fruits[r]]++;
            if(mpp.size()>2){
                mpp[fruits[l]]--;
                if(mpp[fruits[l]]==0) mpp.erase(fruits[l]);
                l++;
            }
            if(mpp.size()<=2) maxlen=max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
    /*
    k hudai xa vane euta map liyo value,frequency. paila check garxa subarray valid xa ki nai
    and and yadi same element xa vane tesko frequency lai ghautau xa and equal to zero vayo vane 
    map bata remove gardinxa
    */
};