package mathematical.watchface;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;

/**
 * Created by BruSD on 9/22/2014.
 */
public class OrangeWatchActivity extends Activity {
    private WatchViewStub stub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_watch);

        stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {

            }
        });
    }
}
