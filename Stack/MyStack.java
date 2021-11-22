package Stack;

public class MyStack{

            private int MAX_SIZE = 10;
            private Object[] stack;
            public int top = -1;
        
            public MyStack(){
                stack = new Object[MAX_SIZE];
            }
        
            public void push(Object item){
                if(top == MAX_SIZE-1){
                    throw new Error("stack is full");
                }
                top++;
                stack[top] = item;
            }
        
            public Object pop(){
                if(top == -1){
                    throw new Error("Stack is empty to pop");
                }
                Object item = stack[top];
                stack[top] = null;
                top -= 1;
                return item;
            }
        
            public boolean isEmptyStack(){
                if(top == -1){
                    return true;
                }
                return false;
            }
        
            public int stackLen(){
                return top+1;
            }
        
            public void displayStack(){
                for(int i= 0 ;i<stackLen(); i++){
                    System.out.println(stack[i]);
                }
            }
}