package LinkedList;

/*
* Singly LinkedList
* Algorithm: 
*   
*/

public class SinglyLinkedList implements LinkedList<SinglyLinkedList> {

    Node node;

    public SinglyLinkedList(){}

    public SinglyLinkedList(Object data)
    {
        node = new Node(data);
    }
        

    @Override
    public void insertInB(Object data)
    {
        /**
         *  ALgo :
         *      newNode = new Node()
         *      newNode->next = startNode
         *      startNode = newNode
         */

         if(node == null)
         {
             node = new Node();
             node.root = data;

         }else{
            Node newNode = new Node(data);
            newNode.next = node;
            node = newNode;
         }
         
    }

    @Override
    public void insertInE(Object data)
    {
        /**
         * Here: node is root Node ;
         * ALGO:
         *      IF(node == null) THEN 
         *          Iniitalize the Node 
         *          node.root = data
         *      ELSE
         *          Find the end Node AS 
         *              tempNode = start node ;
         *              While(tempNode->next != null) THEN
         *                  tempNode = tempNode -> next ;
         *              END OF WHILE
         *          endNode = tempNode ;
         *          endNode->next = NewNode;  
         *          newNode-> next = null;   
         */

        Node newNode = new Node(data);
        newNode.next = null;

        if(node == null)
        {
            node = newNode;
        }else{
            Node pointerNode = node;

            while(pointerNode.next != null)
            {
                pointerNode = pointerNode.next;
            }

            Node endNode = pointerNode;
            endNode.next = newNode;
        }

    }

    @Override
    public void insertInN(Object data, int position) {

        //check if first node exit or not, if not create
        if(node == null)
        {
            node = new Node();
        }

        if(position <= 0)
        {
            throw new IllegalArgumentException("position can't be less than 1..");
        }

        if(node.root == null)
        {
            node.root = data;
        }else{
            Node newNode = new Node(data);
            Node tempNode = node; //here node is start node
            int count = 1; 

    
            while(count < position - 1)
            {
                tempNode = tempNode.next;
    
                if(tempNode == null)
                {
                    throw new IllegalArgumentException("Position is greater than size of linked list ");
                }
    
                count++;
            }
    
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        
    }

    @Override
    public void delete(Object data)
    {
        if(node == null)
        {
            throw new IllegalArgumentException("Node has not been created");
        }

        Node tempNode = node;

        if(tempNode.root == data){
            // Give data found in first position 
            node = tempNode.next;
        }else{
            while(tempNode.next.root != data)
            {
                tempNode = tempNode.next;
    
                if(tempNode == null)
                {
                    throw new IllegalArgumentException("This Node do not exit ..");
                }
            }
    
            tempNode.next = tempNode.next.next;
        }

    }


    @Override
    public void traverse(SinglyLinkedList myLinkedList)
    {

       /**
        *  ALGO: 
                rootNode = Given Node
                if(rootNode == null) THEN
                    display("Empty list ");
                ELSE
                do{    
                    display(rootNode-> rootValue)
                    rootNode = rootNode->next;
                }while(rootNode != null);
        */

       Node startNode = myLinkedList.node;

       if(startNode == null)
       {
           System.out.println("Empty LinkedList ");
           throw new IllegalArgumentException("No node to traverse");
       } 

       do{
            System.out.println(startNode.root);
            startNode = startNode.next;

       }while(startNode != null);
    }


    @Override
    public boolean isPresent(Object data) {
        if(node == null)
        {
            throw new IllegalArgumentException("No any Node exits ");
        }

        Node tempNode = node;
        while(tempNode.root != data)
        {
            tempNode = tempNode.next;

            if(tempNode == null)
            {
                return false;
            }
        }

        return true;
    }
}
