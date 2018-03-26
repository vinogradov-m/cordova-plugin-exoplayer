package co.frontyard.cordova.plugin.exoplayer;

import com.google.android.exoplayer2.ui.DefaultTimeBar;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import java.util.Arrays;

public class TimeBarWithMarkers extends DefaultTimeBar {
    public TimeBarWithMarkers(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setAdGroupTimesMs(@Nullable long[] adGroupTimesMs, @Nullable boolean[] playedAdGroups, int adGroupCount) {
        return;
    }

    public void setMarkers(long[] markers) {
        int adGroupCount = markers.length;
        boolean[] playedAdGroups = new boolean[adGroupCount];
        Arrays.fill(playedAdGroups, false);

        super.setAdGroupTimesMs(markers, playedAdGroups, adGroupCount);
    }
}
