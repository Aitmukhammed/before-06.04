public class SumArray {
    private int sum;
    int sumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + " будет" + sum);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("поток прерван.");
        }
        return sum;
    }
}
