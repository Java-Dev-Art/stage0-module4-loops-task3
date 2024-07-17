package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String tmp = String.valueOf(t);
        int sum = 0;
        for (char c: tmp.toCharArray()) {
            int tmpInt;
            if (c != '-'){
                String strTemp = String.valueOf(c);
                tmpInt = Integer.parseInt(strTemp);
                sum += tmpInt;
            }
        }
        System.out.println(sum);
    }
}
