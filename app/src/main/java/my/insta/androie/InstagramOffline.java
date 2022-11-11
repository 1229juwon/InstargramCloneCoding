package my.insta.androie;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class InstagramOffline extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 오프라인
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
