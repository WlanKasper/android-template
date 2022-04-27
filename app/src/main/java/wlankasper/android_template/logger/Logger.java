package wlankasper.android_template.logger;

import android.util.Log;

public class Logger {
    public static void logString(String tag, String msg) {
        Log.i(tag, msg);
    }

    public static void logError(String tag, String msg) {
        Log.e(tag, msg);
    }
}
