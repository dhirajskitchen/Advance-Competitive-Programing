import java.util.*;

class Student_Mark_Evaluator {
    static public void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        double m1, m2, m3;
        m1 = inp.nextDouble();
        m2 = inp.nextDouble();
        m3 = inp.nextDouble();
        double total = m1 + m2 + m3;
        double avg = total / 3;
        System.out.printf("Total: %.2f\nAverage: %.2f\n", total, avg);
        if (m1 < 35 || m2 < 35 || m3 < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
        inp.close();
    }
}