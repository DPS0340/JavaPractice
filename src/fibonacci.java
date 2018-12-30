public class fibonacci {
    long[] nums;
    int n;
    public fibonacci(long[] start, int num){
        this.nums = new long[num];
        this.n = num;
        for(int i=0; i<start.length;i++) {
            nums[i] = start[i];
        }
    }
    public long run() {
        return fibo_core(this.nums, this.n);
    }
    private static long fibo_core(long[] results, int n) {
        for(int i=2;i<n;i++) {
            results[i] = results[i-1] + results[i-2];
        }
        return results[n-1];
    }
}
