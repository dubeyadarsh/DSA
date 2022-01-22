// 2131. Longest Palindrome by Concatenating Two Letter Words

// Explanation:

// 2 letter words can be of 2 types:

// Where both letters are same
// Where both letters are different
// Based on the above information:

// If we are able to find the mirror of a word, ans += 4
// The variable unpaired is used to store the number of unpaired words with both letters same.
// Unpaired here means a word that has not found its mirror word.
// At the end if unpaired same letter words are > 0, we can use one of them as the center of the palindromic string.


class Solution {
    public int longestPalindrome(String[] words) {
        int magic[][]=new int[26][26];
        int n=words.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int a=words[i].charAt(0)-'a',b=words[i].charAt(1)-'a';
            if(magic[b][a]>0){
                ans+=4;
                magic[b][a]--;
            }
            else{
                magic[a][b]++;
            }
        }
        for(int i=0;i<26;i++){
            if(magic[i][i]>0) {
                ans+=2;
                break;
            }
        }
        return ans;
    }
}
