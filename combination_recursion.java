public class combination_recursion {
    public static void main(String[] args) {
        int[] stack = {1,2,3};
        perm(stack, 0, stack.length-1);
    }
    public static void perm(int[] stack, int start, int end) {
        if(start == end) {
            for(int a : stack) {
                System.out.print(a);
            }
            System.out.println("");
        } else {
            for(int i = start; i <= end; i++) {
                swap(stack, start, i);
                perm(stack, start+1, end);
                swap(stack, start, i);
            }
        }
    }
    public static void swap(int[] stack, int i, int j) {
        int temp = stack[i];
        stack[i] = stack[j];
        stack[j] = temp;
    }
}