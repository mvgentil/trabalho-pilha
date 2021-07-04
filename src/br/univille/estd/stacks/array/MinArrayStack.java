package br.univille.estd.stacks.array;

import br.univille.estd.stacks.EmptyStackException;

public class MinArrayStack<E> {

    private ArrayStack<Integer> stack;
    private ArrayStack<Integer> minStack;

    public MinArrayStack(){
        stack = new ArrayStack<Integer>();
        minStack = new ArrayStack<Integer>();
    }
    public MinArrayStack(int capacity){
        stack = new ArrayStack<Integer>(capacity);
        minStack = new ArrayStack<Integer>(capacity);
    }


    public int size() {
        return stack.top+1;
    }

    public int top(){
        return stack.top();
    }

    public void push (int element) throws FullStackException{
        if (stack.size() == stack.capacity){
            throw new FullStackException("A pilha está cheia");
        }
        stack.push(element);
        if (minStack.isEmpty()){
            minStack.push(element);
        }else {
            if (minStack.top() >= element){
                minStack.push(element);
            }
        }
    }

    public int pop() throws EmptyStackException {
        if (stack.isEmpty()){
            throw new EmptyStackException("A pilha está vazia");
        }

        int t = stack.pop();
        if (t == minStack.top()){
            minStack.pop();
        }
        return t;
    }

    public int min() throws EmptyStackException{
        if (stack.isEmpty()){
            throw new EmptyStackException("A pilha está vazia");
        }
        return minStack.top();
    }
}
