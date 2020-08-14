   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       if (root == null)
           return;
       Queue <Node> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
           Node cur = q.poll();
           System.out.print(cur.data +" ");
           if(cur.left != null)
               q.add(cur.left);
           if(cur.right != null)
               q.add(cur.right);
       }
       
 
      
    }
