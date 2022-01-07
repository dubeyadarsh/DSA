// Ques. https://leetcode.com/problems/destroying-asteroids/
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long m=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(m>=asteroids[i]){
                m+=asteroids[i];
            }
            else return false;
        }
        return true;
    }
}
