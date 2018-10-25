public class LearningApp {
    public static void main(String[] args) {
        int nums [] = new int[20];
        int min, max, sum;
        float average;
        nums [0] = 1;
        nums [1] = 10;
        nums [2] = 1121;
        nums [3] = 103;
        nums [4] = 12;
        nums [5] = 3;
        nums [6] = 456875;
        nums [7] = 4;
        nums [8] = 115;
        nums [9] = 1325;
        nums [10] = -212;
        nums [11] = -170;
        nums [12] = 106;
        nums [13] = 1500;
        nums [14] = -1;
        nums [15] = 7;
        nums [16] = 1;
        nums [17] = 4230;
        nums [18] = -835;
        nums [19] = 10000;
        min = max = nums [0];
        sum = 0;
        for (int i = 0; i <20; i++) {
            if (nums [i] < min) min = nums[i];
            if (nums [i] > max) max = nums[i];
            sum = nums [i] + sum;
        }
        average = sum / nums.length;
        System.out.println( "Min = " + min + ", Max = " + max + ", Sum = " + sum + ", Average = " + average); // nums.length );
    }
}