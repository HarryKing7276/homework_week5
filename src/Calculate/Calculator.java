package Calculate;

public class Calculator {

    public void addition(int a, int b) {
        System.out.println("addition of  " + a + "  and  " + b + "  is   " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("subtraction of    " + a + "   and   " + b + "  is  " + (a - b));
    }

    public void division(int a, int b) {
        System.out.println("  division of   " + a + "  and  " + b + "  is  " + (a / b));
    }

    public void multiplication(int a, int b) {
        System.out.println("  multiplication of   " + a + "   and  "  + b + "  is   " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);}
            else if (symbol == '*'){
                multiplication(a,b);}
                else { division(a,b); }
            }
        }

