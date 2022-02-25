import java.util.*;
import java.io.*;
class Node3{
    Node3 left,right;
    int data;
    Node3(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23BSTLevelOrderTraversal {
    static void levelOrder(Node3 root){
        //Write your code here
        int height = getHeight(root);
        for(int i=1; i <= height; i++) {
            printEachLevel(root, i);
        }

    }

    static void printEachLevel(Node3 root, int eachLevel)
    {
        if(root == null)
            return;
        if(eachLevel == 1)
            System.out.print(root.data + " ");
        else if(eachLevel > 1)
        {
            printEachLevel(root.left, eachLevel - 1);
            printEachLevel(root.right, eachLevel - 1);
        }
    }
    static int getHeight(Node3 root) {
        if(root == null){
            return 0;
        }
        else {
            int lHeight = getHeight(root.left);
            int rHeight = getHeight(root.right);

            if(lHeight > rHeight){
                return(lHeight + 1);
            }
            else
                return(rHeight + 1);
        }

    }

    public static Node3 insert(Node3 root,int data){
        if(root==null){
            return new Node3(data);
        }
        else{
            Node3 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node3 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
