package ConceptsCode.Polymorphism;

public class Overloading {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    Overloading() {
        System.out.println("Inside Constructor");
    }

    Overloading(String a) {
        System.out.println("Inside Constructor of " + a);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        int sum = o.add(1, 2);
        System.out.print("Sum is: " + sum);
        System.out.println();
        System.out.print("Now Sum Is: " + o.add(3, 6, sum));
    }
}
