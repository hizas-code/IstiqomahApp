package motion.istiqomah.com;

import com.firebase.client.Firebase;

/**
 * Created by naofal on 11/4/2016.
 */

public class UserFirebase extends android.app.Application {
    //extends diatas agar bisa mendapatkan fitur lifecycle di android, seperti OnCreate dll.

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
