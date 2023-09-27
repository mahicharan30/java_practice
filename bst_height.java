// Binary search tree height

public class bst_height 
{
   int key;
   bst_height left,right;
   
   bst_height(int key)
   {
    this.key = key;
    left = right = null;
   }

   public static bst_height insert(bst_height root,int key)
   {
    if(root == null)
        return new bst_height(key);

    if(key < root.key)
        root.left = insert(root.left, key);
    
    if(key > root.key)
        root.right = insert(root.right,key);
    
    return root;
   }

   public static int height_of_tree(bst_height root)
   {
//     if(root == null)
//         return 0;
        
//     int left_subtree_height = height_of_tree(root.left);
//     int right_subtree_height = height_of_tree(root.right);

//     if(left_subtree_height > right_subtree_height)
//         return (left_subtree_height + 1);
//     else
//         return (right_subtree_height + 1);

        return root == null ? -1:1+Math.max(height_of_tree(root.left),height_of_tree(root.right));

   }

   public static void main(String[] args) 
   {
    bst_height root = new bst_height(3);
    //insert(root,3);
    insert(root,5);
    insert(root,2);
    insert(root,1);
    insert(root,4);
    insert(root,6);
    insert(root,7);
    // insert(root,5);
    // insert(root,3);
    // insert(root,0);

    System.out.println("Height of the tree is: "+ height_of_tree(root));
   }
}