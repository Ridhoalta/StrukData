package tugas01;
import java.io.BufferedReader;


public class stack2 {
    public static void main(String[] args)
    {
        stack stack = new stack();
        stack.inisiasi(4);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.view();
        stack.push(5);
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.view();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(6);
        stack.push(8);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.view();
    }
}
