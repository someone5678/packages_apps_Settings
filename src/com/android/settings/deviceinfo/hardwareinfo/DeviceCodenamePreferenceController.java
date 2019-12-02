package com.android.settings.deviceinfo.hardwareinfo;

import android.content.Context;
import android.os.SystemProperties;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class DeviceCodenamePreferenceController extends BasePreferenceController {

    private static final String KEY_DEVICE_NAME_PROP = "ro.product.device";

    public DeviceCodenamePreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public CharSequence getSummary() {
        String deviceCodename = SystemProperties.get(KEY_DEVICE_NAME_PROP,
                mContext.getString(R.string.device_info_default));
        return deviceCodename;
    }
}
