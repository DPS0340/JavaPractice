public class oddVsEven
{
    public static int Test(String numbers)
    {
        int odd, even;
        odd = even = 0;
        String[] strns = numbers.split(" ");
        int[] ns = new int[strns.length];
        for(int i = 0;i<ns.length;i++) {
                ns[i] = Integer.parseInt(strns[i]);
        }
        for(int i = 0;i<ns.length;i++) {
            if(ns[i] % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        if(even > odd) {
            return even;
        }
        else {
            return odd;
        }
    }
    public static void main(String[] args) {
        System.out.println(oddVsEven.Test("1 2 3"));
    }
}