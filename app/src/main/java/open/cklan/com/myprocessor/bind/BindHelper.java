package open.cklan.com.myprocessor.bind;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

import java.lang.reflect.Constructor;

/**
 * AUTHOR：lanchuanke on 17/8/1 17:36
 */
public class BindHelper {

    @UiThread
    public static synchronized void bind(@NonNull Activity activity){
        String className=activity.getClass().getName()+"$BindLayoutHelper";
        try {
            Class<?> aClass = activity.getClass().getClassLoader().loadClass(className);
            Constructor<?> constructor = aClass.getConstructor(activity.getClass());
            constructor.newInstance(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
