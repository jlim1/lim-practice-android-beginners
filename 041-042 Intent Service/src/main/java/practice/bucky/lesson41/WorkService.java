package practice.bucky.lesson41;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
public final class WorkService extends IntentService {
    public WorkService() {
        super("LessonWork");
    }
    // IntentService calls this method serially for the queued requests.
    @Override
    protected void onHandleIntent(Intent job) {
        Log.i("LessonWork", "Processed a queued request");
    }
}
