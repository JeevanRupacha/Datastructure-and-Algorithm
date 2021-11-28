package LinkedList;

public class DoublyLinkedList implements LinkedList<DoublyLinkedList> {

    Node node;

    public DoublyLinkedList(){}

    public DoublyLinkedList(Object data)
    {
        node = new Node(data);
    }

    public void createNode(Object data)
    {
        node = new Node(data);
    }

    @Override
    public void insertInB(Object data) {
        /*
        * ALGO: 
                1> New Node creation 
                2> newNode->next = startNode
                3> startNode = newNode
                4> startNode.prev = newNode
                5> newNode->prev = null
        */
        if(node == null)
        {
            createNode(data);
        }else{
            // Node tempNode = node; Do not use temp because reference problem here..
            Node newNode = new Node(data);
            newNode.next = node;
            node.prev = newNode;
            node = newNode;
            newNode.prev = null;
        }
    }

    @Override
    public void insertInE(Object data) {
        /**
         * ALGO:
         *      1> Create new Node 
         *      2> tempNode = startNode 
         *      3> Reach to last Node as :
         *          while(tempNode != null) THEN:
         *              tempNode = tempNode->next
         *          Now tempNode is last Node 
         *      4> Insert newNode to next of tempNode AS:
         *      5> tempNode->next = newNode
         *      6> newNode-> next = null
         *      7> newNode-> prev = tempNode
         */

         if(node == null)
         {
             createNode(data);
         }else{
             Node newNode = new Node(data);
             Node tempNode = node;
             while(tempNode.next != null)
             {
                 tempNode = tempNode.next;
             }

             tempNode.next = newNode;
             newNode.prev = tempNode;
             newNode.next = null;
         }
        
    }

    @Override
    public void delete(Object data) {
        /**
         * ALGO: 
         *      1> tempNode = startNode 
         *      2> while(tempNode->root != data) THEN :
         *          tempNode = tempNode->next
         *          if(tempNode == null) THEN
         *              Print("Data not found to delete ")
         *              BREAK
         *      3> tempNode-> next->prev = tempNode->prev
         *      4> tempNode->prev->next = tempNode->next
         *      5> tempNode = null
         */

         Node tempNode = node; 
         boolean dataFound = true;
         while(tempNode.root != data){
                tempNode = tempNode.next;
                if(tempNode == null)
                {
                    System.out.println("Data not found to delete ");
                    dataFound = false;
                    break;
                }
         }

         if(dataFound )
         {
             if(tempNode.next != null)
             {
                 tempNode.next.prev = tempNode.prev;
             }

             if(tempNode.prev != null)
             {
                 tempNode.prev.next = tempNode.next;
             }

            if(node.equals(tempNode))
            {
                //first node is deleting case 
                node = null;
                node = tempNode.next;
            }else{
                // other node than first node 
                tempNode = null;
            }
         }
        
    }

    @Override
    public void traverse(DoublyLinkedList myLinkedList) {
        Node startNode = myLinkedList.node;

       if(startNode == null)
       {
           System.out.println("Empty LinkedList ");
           throw new IllegalArgumentException("No node to traverse");
       } 

       do{
           printValues(startNode);
            startNode = startNode.next;

       }while(startNode != null);
        
    }

    @Override
    public boolean isPresent(Object data) {
        boolean found = true ;
        Node tempNode = node;

        while(tempNode.root != data){
            tempNode = tempNode.next;
            if(tempNode == null)
            {
                found = false;
                break;
            }
        }
        
        return found;
    }

    @Override
    public void insertInN(Object data, int position) {
        /**
         * ALGO : 
         *      1> Create new Node 
         *      2> tempNode = startNode
         *      3> count = 1 // To tract how many loops executed 
         *      4> reach (n-1)th node AS:
         *          while(count < (n-1)) THEN:
         *              tempNode = tempNode->next
         *      5> Now tempNode is (n-1)th node 
         *      6> newNode->prev = tempNode
         *      7> newNode->next = tempNode->next
         *      8> tempNode->next->prev = newNode 
         *      8> tempNode->next = newNode
         */

         Node newNode = new Node(data);
         Node tempNode = node;
         int count = 1;

         if(position <= 0)
         {
             throw new IllegalArgumentException("Position can't be 0 or less ");
         }

         if(node == null)
         {
             createNode(data);
         }else{
            while(count < (position -1))
            {
                tempNode = tempNode.next;

                if(tempNode == null)
                {
                    throw new IllegalArgumentException("Position is greater than size of linked list ");
                }

                count++;
            }

           if(position == 1)
           {
                newNode.prev = null;
                newNode.next = tempNode;
                tempNode.prev= newNode;
                node = newNode;
           }else{
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            if(tempNode.next != null)
            {
                tempNode.next.prev = newNode;
            }
            tempNode.next = newNode;
           }
         }

        
    }

    private void printValues(Node startNode)
    {
        if(startNode.prev != null) {
            System.out.println("{ Previous value is : " + startNode.prev.root + " }");
        }else{
            System.out.println("{ Previous value is :  null }");
        } 

        if(startNode.root != null) {
            System.out.println("{ Root value is : " + startNode.root + " }");
        }else{
            System.out.println("{ Root value is :  null }");
        } 

        if(startNode.next != null) {
            System.out.println("{ Next value is : " + startNode.next.root + " }");
        }else{
            System.out.println("{ Next value is :  null }");
        } 


        System.out.println("-----------------");
    }
    
}
