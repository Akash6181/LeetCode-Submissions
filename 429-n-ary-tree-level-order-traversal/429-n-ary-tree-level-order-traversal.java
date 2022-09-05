/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int n = queue.size();
            for(int i=0;i<n;i++){
                Node node = queue.peek();
                for(int j=0;j<node.children.size();j++) queue.add(node.children.get(j));
                l.add(node.val);
                queue.poll();
            }
            list.add(l);
        }
        return list;
    }
}