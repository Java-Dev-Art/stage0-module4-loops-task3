package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        if (lengthOfLastNumber <= 0) {
            System.out.println("0");
            return;
        }

        long sum = 0;
        long number = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            number = number * 10 + 9;
            sum += number;
        }

        System.out.println(sum);

    }
}
