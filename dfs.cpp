

void DFS(int node,vector<int> &ans,vector<int> &vis,vector<int> adj[]) {
      
  ans.push_back(node);
  visited[node]=1; 
     
    for(auto it : adj[node]) {
     if(visited[it]==1) continue; 
     DFS(it,ans,it,adj);
  }  
 }


   vector<int> dfsOfGraph(int V, vector<int> adj[]) {
     vector<int> vis(V,0);
     vector<int> ans;
     DFS(0,ans,vis,adj);
     return ans;  
   }