public class  pens {
public static void main(String[] args) {
        int tPens = 14;
        int no_OfStudents = 3;
        int pensPerStudent = tPens / no_OfStudents;
        int remainingPens = tPens % no_OfStudents;
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed are %d", pensPerStudent, remainingPens);

}
