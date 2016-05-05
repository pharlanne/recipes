package example.codeclan.com.recipes;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class NotePreferences {
    private static final String PREF_NOTES = "notes";

    public static void setStoredNotes(Context context, String notes)
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PREF_NOTES, notes);
        editor.apply();
    }

    public static String getStoredNotes(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        return sharedPreferences.getString(PREF_NOTES, null);
    }
}
