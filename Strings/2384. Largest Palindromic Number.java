public String largestPalindromic(String num) {
        int[] freq = new int[10];
        //Count all frequencies
        for(int v : num.toCharArray()){
            freq[v - '0']++;
        }
        StringBuffer even = new StringBuffer();
        int max = -1;
        for(int i = 9; i >= 0; i--){
            //Tax Max of all odd occurences
            if(freq[i] % 2 == 1){
                max = Math.max(max, i);
            }
            //Talk half of the occurences of number
            for(int j = 0; j < freq[i] / 2; j++){
                even.append(i);
            }
        }
        //For eg : 444947137,  we would have 744
        //Check for max, if all even occurences are there in number, max will be -1
        String ans = even.toString() + (max == -1 ? "" : max) + even.reverse().toString();
        //Edge case
        if(ans.charAt(0) == '0') {
            //If the whole string is 0, then return 0
            if(max == -1) return "0";
            //For case like 00090, max will be 9
            return max + "";
        }
        return ans;
        
    }
