package Lab2;

import java.util.Scanner;

class Stack {
    final int SIZE = 10;
    private int top;
    private final int[] content = new int[SIZE];

    Stack() {
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == SIZE - 1;
    }

    public void push(int number) {
        if (this.isFull()) {
            System.out.println("Stack full");
            return;
        };
        this.content[++this.top] = number;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return this.content[this.top--];
    }

    public void display() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack contents are: ");
        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.content[i] + " ");
        }
        System.out.println();
    }
}

public class Program8 {
    public static void main(String[] args) {
        System.out.println("Welcome to stack operations");
        Stack stk = new Stack();
        Scanner scn = new Scanner(System.in);
        int n, num;

        while (true) {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            n = scn.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.print("Enter the element to add to stack: ");
                    num = scn.nextInt();
                    stk.push(num);
                }
                case 2 -> {
                    num = stk.pop();
                    if (num != -1) {
                        System.out.println("Element popped is " + num);
                    }
                }
                case 3 -> stk.display();
                case 4 -> {
                    System.out.println("Exited");
                    return;
                }
            }
        }
    }
}
