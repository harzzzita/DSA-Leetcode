class Solution {
    public void dfs(int node , int[][] isConnected , boolean[]vis ){
        vis[node] = true ;
        for(int i = 0 ; i<isConnected.length ; i++){
            if(!vis[i] && isConnected[node][i] == 1){
                dfs(i , isConnected , vis) ;
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean [] vis = new boolean [isConnected.length] ;
        int count = 0 ;
        for(int i = 0 ; i<isConnected.length ; i++){
            if(!vis[i]){
            count++ ;
            dfs(0 , isConnected , vis) ;
            }
        }
        return count ;
        
    }
}