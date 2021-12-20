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

            if(position == 1)
            {   //if position is 1 insert in begging of the list 
                newNode.next = tempNode;
                node = newNode;
            }else{
                newNode.next = tempNode.next;
                tempNode.next = newNode;
            }
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


/*
Analysis
        As we seen above insertion at Head/Tail can be done in O(1) time that is quit fast if your requirement is to insert at ends. But insertion in middle like Insertion at some position then you will have to traverse the list until you find the position and then you have to insert new node so that will be O(n+1) time expensive operation in worst cast.

        Deletion and search complexity is also O(n) in worst case, because it has to traverse the list to find the correct node, traversing is always O(n) where n is the number of nodes in list.
        
*/
