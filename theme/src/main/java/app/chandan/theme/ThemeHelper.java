package app.chandan.theme;

import androidx.appcompat.app.AppCompatDelegate;

public class ThemeHelper {
    private static ThemeHelper themeHelper;

    private ThemeHelper() {
    }

    public static synchronized ThemeHelper getInstance() {
        if (themeHelper == null)
            themeHelper = new ThemeHelper();
        return themeHelper;
    }

    public Integer getMode() {
        return AppCompatDelegate.getDefaultNightMode();
    }

    public void setMode(Integer mode) {
        AppCompatDelegate.setDefaultNightMode(mode);
    }

    public void toggleMode() {
        if (getMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else if (getMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            setMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            setMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
