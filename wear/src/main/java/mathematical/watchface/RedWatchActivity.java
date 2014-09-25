package mathematical.watchface;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;


public class RedWatchActivity extends Activity {
    private WatchViewStub stub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_watch);

        stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
