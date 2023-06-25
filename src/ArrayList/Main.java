package ArrayList;

public class Main {


    
    
    public static void main(String[] args) {
        
        Tree<String> pohonKu = new Tree<String>("Parent");
        
        pohonKu.addChild("Parent", "Child 1");
        pohonKu.addChild("Parent", "Child 2");
        
        Node<String> childNode3 = new Node<String>("Child 3");     
        pohonKu.addChild("Parent", childNode3);
        
        pohonKu.addChild("Child 1", "Grandchild 1");

        Node<String> grandchildNode = new Node<String>("Grandchild 2"); 
        pohonKu.addChild("Child 3", grandchildNode);
        
        pohonKu.draw();
     
    }
    
}

   

