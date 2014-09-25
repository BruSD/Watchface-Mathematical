package mathematical.watchface;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by BruSD on 9/15/2014.
 */
public class MathematicsWatchFaceActivity extends Activity {
    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("WatchFace", "onCreate();");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);

        background = (ImageView) findViewById(R.id.background);

    }

    @Override
    protected void onPause() {
        //  onPause();
        Log.v("WatchFace", "onPause();");
        super.onPause();
        background.setImageResource(R.drawable.sexy_watch_bg);
    }

    @Override
    protected void onResume() {
        //  onResume();
        Log.v("WatchFace", "onResume();");
        super.onResume();
        background.setImageResource(R.drawable.sexy_watch_bg);
    }
}
