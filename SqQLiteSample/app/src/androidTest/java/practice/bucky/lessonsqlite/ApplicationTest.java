package practice.bucky.lessonsqlite;

import static org.junit.Assert.assertEquals;
import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public final class ApplicationTest {
    @Test public void applicationUsesLessonPackage() {
        // The target context identifies the application launched by the test runner.
        Context app = InstrumentationRegistry.getInstrumentation().getTargetContext().getApplicationContext();
        assertEquals("practice.bucky.lessonsqlite", app.getPackageName());
    }
}
