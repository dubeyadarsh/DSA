// Longest common subsequence k tabulation code me thoda variation karke hum longest common substring ka output nikal sakte->
// jaise longest common subsequence me agar s1[i]!=s2[i] hota tha to hum dp[i][j] =Math.max(dp[i][j-1],dp[i-1][j]) lete hai iski 
// jagah hum bas 0 kar denge bas yehi chhota sa changes




// Recursive code of longest common subsstring
 static int lcs(int i, int j, int count)
    {
 
        if (i == 0 || j == 0)
        {
            return count;
        }
 
        if (X.charAt(i - 1)
            == Y.charAt(j - 1))
        {
            count = lcs(i - 1, j - 1, count + 1);
        }
        count = Math.max(count,
                         Math.max(lcs(i, j - 1, 0),
                                  lcs(i - 1, j, 0)));
        return count;
    }
     

 static int LCSubStr(char X[], char Y[],
                         int m, int n)
    {
        // Create a table to store
        // lengths of longest common
        // suffixes of substrings.
        // Note that LCSuff[i][j]
        // contains length of longest
        // common suffix of
        // X[0..i-1] and Y[0..j-1].
        // The first row and first
        // column entries have no
        // logical meaning, they are
        // used only for simplicity of program
        int LCStuff[][] = new int[m + 1][n + 1];
       
        // To store length of the longest
        // common substring
        int result = 0;
 
        // Following steps build
        // LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                {
                    LCStuff[i][j]
                        = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result,
                                         LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        return result;
    }
