class Solution {
public int longestStrChain(String[] words) {
    if(words.length==1)return 1;
    Arrays.sort(words,new Comparator<String>(){
        public int compare(String s1,String s2){
            return s1.length()-s2.length();
        }
    });
    
//   Why do we need to sort it?
//   Beause  in the question it is given that you have to consider sequence not subseq and seq doesn't mind order of index
//   e.g, => xbc xbcz xb xbczd --->here we need to sort because we want to place xb at 0th index.
    int n=words.length;
    int max=0;
    int arr[]=new int[n];
    Arrays.fill(arr,1);
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(compare(words[i],words[j])){
                arr[i]=Math.max(arr[i],arr[j]+1);
            }
        }
        max=Math.max(max,arr[i]);
    }
    return max;
}
public boolean compare(String s1,String s2){
    if(s1.length()!=(s2.length()+1))return false;
    int i=0;
    int j=0;
    while(i<s1.length()){
        if(j<s2.length() && s1.charAt(i)==s2.charAt(j)){
            i++;
            j++;
        }
        else{
            i++;
        }
    }
    if(i==s1.length() && j==s2.length())return true;
    return false;
}
  
  
//    We can solve this sum by using HashMap in more optimised manner
  
  class Solution {
    public int longestStrChain(String[] words) {
   Arrays.sort(words,(a, b)-> a.length()-b.length());
    HashMap<String,Integer> hm=new HashMap<>();
        int result=0;
        for(String word:words){
            hm.put(word,1);
            for(int i=0;i<word.length();i++){
                StringBuilder sb=new StringBuilder(word);
                String temp=sb.deleteCharAt(i).toString();
                if(hm.containsKey(temp)){
                    hm.put(word,Math.max(hm.get(temp)+1,hm.get(word)));
                }
            }
            result=Math.max(result,hm.get(word));
        }
        return result;
    }
}
