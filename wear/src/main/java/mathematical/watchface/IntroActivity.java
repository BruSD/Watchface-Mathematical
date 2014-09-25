package mathematical.watchface;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.wearable.MessageEvent;

public class IntroActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("WatchFace", "onCreate();");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }

    @Override
    protected void onPause() {
        //  onPause();
        Log.v("WatchFace", "onPause();");
        super.onPause();

    }

    @Override
    protected void onResume() {
        //  onResume();
        Log.v("WatchFace", "onResume();");
        super.onResume();

    }

}
