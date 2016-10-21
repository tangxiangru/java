/**
 * Created by tangxiangru on 16/10/21.
 */
public class newexam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = in.nextInt();
        System.out.println("请输入第二个数：");
        int b = in.nextInt();
        System.out.println(max_num(a,b));
        System.out.println(min_num(a,b));
    }
    private static int max_num(int a, int b) {
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        if (max % min != 0) {
            return max_num(min, max % min);
        } else {
            return min;
    }