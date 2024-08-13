package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first, second, third;
        first = 1;
        second = 10;
        third = 100;
        System.out.println("first\nsecond\nthird");
         int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        first = 5;
        second = 6;
        third = 4;
        System.out.println("linkToFirst\nlinkToSecond\nlinkToThird\nfirst\nsecond\nthird");


    }
}
