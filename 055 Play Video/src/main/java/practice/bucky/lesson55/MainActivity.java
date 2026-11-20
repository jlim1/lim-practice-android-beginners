package practice.bucky.lesson55;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // The resource URI points the video player at the bundled clip and the controller handles
        // playback.
        VideoView video = new VideoView(this);
        setContentView(video);
        MediaController controls = new MediaController(this);
        controls.setAnchorView(video);
        video.setMediaController(controls);
        video.setVideoURI(
            android.net.Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sample));
        video.start();
    }
}
