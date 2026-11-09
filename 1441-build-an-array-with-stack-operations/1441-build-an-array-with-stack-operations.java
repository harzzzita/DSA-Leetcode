class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>() ;
        Stack<Integer> st = new Stack <>() ;
        int j = 0 ;
        for(int i = 1 ; i<=n ; i++){
            if(j==target.length) break ;
            st.push(i) ;
            ans.add("Push") ;

            if(st.peek() != target[j]){
                st.pop() ;
                ans.add("Pop") ;
            } else{
                j++;
            }
        }
        return ans ;
    }
}