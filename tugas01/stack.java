package tugas01;


public class stack {
    private int maxsize;
    private double[] stackarray;
    private int top;

    public void inisiasi(int s)
    {
        maxsize = s;
        stackarray = new double[maxsize];
        top = -1;
    }

    public void push(double data) {
        if (top >= maxsize - 1)
            System.out.println("Stack Penuh. " + data + " Tidak Bisa Masuk");
        else {
            top++;
            stackarray[top] = data;
            System.out.println(data + " Masuk ke Stack");
        }
    }

    public double pop() {
        double temp;
        if (top >= 0) {
            temp = stackarray[top];
            System.out.println(temp + " Keluar dari Stack");
            top--;
            return (temp);
        } else {
            System.out.println("Stack Sudah Kosong");
            return (-1);
        }
    }

    public void view() {
        System.out.print("Isi Stack: ");
        for (int i = 0; i <= top; i++)
            System.out.print(stackarray[i] + " ");
        System.out.println();
    }
}
