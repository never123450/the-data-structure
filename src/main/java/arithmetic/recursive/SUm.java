package arithmetic.recursive;

public class SUm {


    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    //递归函数的“宏观”语义
    //递归函数就是一个函数，完成一个功能
    //计算arr[l...n）这个区间内所有数字的和
    private static int sum(int[] arr, int l) {

        //最基本的问题
        if (l == arr.length) {
            return 0;
        }
        //把原问题转化成更小的问题
        return arr[l] + sum(arr, l + 1);
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(nums));
    }

}