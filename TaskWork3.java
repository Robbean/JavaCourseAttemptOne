/**
 * @code Task3 */
public class TaskWork3 {
    public static void main(String[] args) {
        int[] m={15, 22, 45, 9, 3};
        double avg;
        int tmp = m[m.length-1];
        m[m.length-1] = m[0];
        m[0]=tmp;
        System.out.println(m[0] + m[(m.length-1)/2]);
        //System.out.println(m[0] + " " + m[1] + " " +  m[2] + " " + m[3] + " " + m[4]);
    }
}
