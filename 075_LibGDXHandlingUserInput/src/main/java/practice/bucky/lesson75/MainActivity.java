package practice.bucky.lesson75;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
public final class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        // LibGDX attaches its rendering surface and forwards lifecycle events to the game.
        initialize(new MyGdxGame(), new AndroidApplicationConfiguration());
    }
}
