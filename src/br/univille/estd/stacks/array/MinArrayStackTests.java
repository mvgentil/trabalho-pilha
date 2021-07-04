package br.univille.estd.stacks.array;

import br.univille.estd.stacks.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinArrayStackTests {

    @Test
    public void push() {
        MinArrayStack<Integer> stack = new MinArrayStack<>();
        stack.push(10);
        assertEquals("Pilha deve conter um elemento",1,stack.size());
    }

    @Test
    public void top() {
        MinArrayStack<Integer> stack = new MinArrayStack<Integer>();
        stack.push(10);
        stack.push(15);
        assertEquals("Top deve retornar o elemento 15",15,(int)stack.top());
    }

    @Test
    public void pop() {
        MinArrayStack<Integer> stack = new MinArrayStack<Integer>();
        stack.push(10);
        stack.push(15);
        assertEquals("Top deve retornar o elemento 15",15,(int)stack.pop());
        assertEquals("Pilha deve conter um elemento",1,stack.size());
    }

    @Test
    public void popThrowsException() {
        MinArrayStack<Integer> stack = new MinArrayStack<>();
        try {
            stack.pop();
            fail("Pilha deve gerar exceçao EmptyStackException");
        }catch(Exception ignored) {
        }
    }

    @Test
    public void topThrowsException() {
        MinArrayStack<Integer> stack = new MinArrayStack<Integer>();
        try {
            stack.top();
            fail("Pilha deve gerar exceçao EmptyStackException");
        }catch(Exception ignored) {
        }
    }


    @Test
    public void pushThrowsException() {
        MinArrayStack<Integer> stack = new MinArrayStack<Integer>(1);
        try {
            stack.push(1);
            stack.push(2);
            fail("Pilha deve gerar exceçao FullStackException");
        }catch(Exception ignored) {
        }
    }
}
