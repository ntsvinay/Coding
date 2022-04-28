package leetCode.Easy;

import java.util.Stack;

class MyQueue {
    Stack<Integer> deq;
    Stack<Integer> que;

    public MyQueue() {
        deq=new Stack<Integer>();
        que=new Stack<Integer>();
    }
    
    public void push(int x) {
        
        que.push(x);
    }
    
    public int pop() {
        if(deq.empty())
        {
            for(int i=0;i<que.size();i++)
            {
                deq.push(que.pop());
            }
        }
        return deq.pop();
        
    }
    
    public int peek() {
        if(deq.empty())
        {
            for(int i=0;i<que.size();i++)
            {
                deq.push(que.pop());
            }
        }
        return deq.peek();
    }
    
    public boolean empty() {
        return deq==null && que==null?true:false;
        
    }
}
