// Time Complexity : O(ns+np)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int ns = s.length(), np = p.length();
        if (ns < np) return new ArrayList();

        int [] pCount = new int[26];
        int [] sCount = new int[26];
        
        for(char c : p.toCharArray()) {
            pCount[(int)(c-'a')]++;
        }
        
        List<Integer> ans = new ArrayList();
        for(int i=0; i<ns; i++) {
            
            sCount[(int)(s.charAt(i)-'a')]++;
            
            if (i >= np) {
                sCount[(int)(s.charAt(i - np) - 'a')]--;
            }
            
            if(Arrays.equals(sCount, pCount)) ans.add(i-np+1);
            
            
        }
        
        
        return ans;
    }
}
