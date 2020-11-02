/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparcial2;

/**
 *
 * @author Manuel_2
 */
public class BinaryTree {
    public Node root;
    private int size;
    
    public BinaryTree(){
       super();
    }
    
    public void insertRoot(String data){
        Node nvo = new Node(data);
        root = nvo;
    }
    
    public void insertL(String data){
        Node nvo = new Node(data);
        root.left = nvo;
    }
    
    public void insertR(String data){
        Node nvo = new Node(data);
        root.right = nvo;
    }
    
    public int getSize(){
       return this.size;
    }
    
    public Node getLeft() {
        return this.root.getLeft();
    }

    public Node getRight() {
        return this.root.getRight();
    }
    
    public void preorder(){//Solo imprime directamente
       preorder(this.root);
   }
   
   private void preorder(Node root){ //tail recursion
       if(root!=null){
           System.out.print(root.getData()+" ");
           preorder(root.getLeft());
           preorder(root.getRight());
       }
   }
    
}

class Node {
    String value;
    Node left;
    Node right;
 
    Node(String value) {
        this.value = value;
        right = null;
        left = null;
    }
    public int nodosCompletos(Node n){
        if( n == null){
            return 0;
        }
        else{
            if(n.left != null && n.right != null){
                return nodosCompletos(n.left) + nodosCompletos(n.right) + 1;
            }
            return nodosCompletos(n.left) + nodosCompletos(n.right);
        }
    }
    public void setLeft(Node l) {
        this.left=l;
    }
    
    public void setRight(Node r) {
        this.right=r;
    }
    
    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
    
    public String getData(){
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
}
