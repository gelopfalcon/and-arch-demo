

package demo.arch.android.falcon.android_arch_demo.step2;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

/**
 * A ViewModel used for the {@link ChronoActivity2}.
 */
public class ChronometerViewModel extends ViewModel {

    @Nullable
    private Long mStartTime;

    @Nullable
    public Long getStartTime() {
        return mStartTime;
    }

    public void setStartTime(final long startTime) {
        this.mStartTime = startTime;
    }
}
