package br.univille.estd.stacks.array;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;

public class ArrayStack<E> implements Stack<E>{
	
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E S[];
	protected int top = -1;
	public ArrayStack() {
		this(CAPACITY);
	}
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
	}
	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		return (top<0);
	}

	@Override
	public E top() throws EmptyStackException {
		if(isEmpty()){
			throw new EmptyStackException("pilha vazia");
		}
		return S[top];
	}
	@Override
	public void push(E element) {
		if (this.size() == capacity){
			throw new FullStackException("pilha cheia");
		}
		top = top+1;
		S[top] = element;
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()){
			throw new EmptyStackException("pilha vazia");
		}
		E element = S[top];
		S[top] = null;
		top = top-1;

		return element;
	}

	@Override
	public E min() throws EmptyStackException {
		return null;
	}


}
