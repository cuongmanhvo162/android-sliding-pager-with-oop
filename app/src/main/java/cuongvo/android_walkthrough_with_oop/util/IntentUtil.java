package cuongvo.android_walkthrough_with_oop.util;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by cuongvo on 5/28/17.
 */

public class IntentUtil {
    public static Intent createIntent(Activity activity, Class<?> clazz, String action) {
        Intent intent = new Intent();
        intent.setAction(action);
        intent.setClass(activity, clazz);
        return intent;
    }
}
