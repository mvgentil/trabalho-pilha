package br.univille.estd.stacks.array;


public class Main {
	
	public static void main(String[] args) {


		MinArrayStack<Integer> stack = new MinArrayStack<Integer>(1);

		stack.push(10);
		stack.push(20);
		stack.push(8);
		stack.push(9);
		System.out.println(stack.min());

		stack.pop();
		System.out.println((stack.min()));
		stack.pop();
		System.out.println((stack.min()));
		stack.pop();
		System.out.println((stack.min()));
		stack.pop();

		System.out.println((stack.min()));

	}

}
