package be.cegeka.gradle.utils;

import java.util.Calendar;
import java.util.Date;

public final class TimeUtils {

    private TimeUtils() {
    }

    public static Date now() {
        return Calendar.getInstance().getTime();
    }
}
