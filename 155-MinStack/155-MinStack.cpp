// Last updated: 21/07/2026, 23:13:44
class MinStack {
public:
    stack<int>mainStack;
    stack<int>minStack;
    MinStack() {
        
    }
    
    void push(int val) {
        if(minStack.empty() || val<=minStack.top()){
            minStack.push(val);
        }
        mainStack.push(val);
    }
    
    void pop() {
        int topElement=mainStack.top();
        if(mainStack.top() == minStack.top()){
            minStack.pop();
        }
        mainStack.pop();
        return ;
    }
    
    int top() {
        return mainStack.top();
    }
    
    int getMin() {
        if(!minStack.empty()){
            return minStack.top();
        }
        return -1;
    }

};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */