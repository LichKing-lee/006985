package ch12.sec04;

import java.time.LocalTime;

public class LocalTimes {
    public static void main(String[] args) {
        LocalTime rightNow = LocalTime.now();
        LocalTime bedtime = LocalTime.of(22, 30);
        bedtime = LocalTime.of(22, 30, 0);

        System.out.println("rightNow: " + rightNow);
        System.out.println("bedtime: " + bedtime);

        LocalTime wakeup = bedtime.plusHours(8); // 기상 시각은 6:30이다.
        System.out.println("wakeup: " + wakeup);
    }
}
