package joshrod.com.madisondrinks;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

    private PagerAdapter pagerAdapter;
    private static Calendar c;
    SharedPreferences thePrefs;
    final String welcomeScreenShownPref = "welcomeScreenShown";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.viewpager_layout);

        //Welcome pop up only appears once after install
        thePrefs = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean welcomeScreenShown = thePrefs.getBoolean(welcomeScreenShownPref, false);

        if (!welcomeScreenShown) {
            String welcomeTitle = getResources().getString(R.string.welcome_title);
            String welcomeText = getResources().getString(R.string.welcome_text);
            new AlertDialog.Builder(this).setTitle(welcomeTitle).setMessage(
                    welcomeText).setPositiveButton(R.string.ok,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();
            SharedPreferences.Editor editor = thePrefs.edit();
            editor.putBoolean(welcomeScreenShownPref, true);
            editor.commit();
        }

        this.initPaging();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_help:
                Intent helpIntent = new Intent(this, HelpActivity.class);
                startActivity(helpIntent);
                return true;
            case R.id.action_legal:
                Intent legalIntent = new Intent(this, LegalActivity.class);
                startActivity(legalIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initPaging() {
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, MondayList.class.getName()));
        fragments.add(Fragment.instantiate(this, TuesdayList.class.getName()));
        fragments.add(Fragment.instantiate(this, WednesdayList.class.getName()));
        fragments.add(Fragment.instantiate(this, ThursdayList.class.getName()));
        fragments.add(Fragment.instantiate(this, FridayList.class.getName()));
        fragments.add(Fragment.instantiate(this, SaturdayList.class.getName()));
        fragments.add(Fragment.instantiate(this, SundayList.class.getName()));
        this.pagerAdapter = new PageAdapter(super.getSupportFragmentManager(), fragments);
        ViewPager vp = (ViewPager) super.findViewById(R.id.viewpager);
        vp.setAdapter(this.pagerAdapter);
        setFragment(vp);
    }

    private void setFragment(ViewPager viewpager) {
        c = Calendar.getInstance();

        Calendar sunCheck = new GregorianCalendar();
        sunCheck.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        sunCheck.set(Calendar.HOUR_OF_DAY, 2);

        Calendar monCheck = new GregorianCalendar();
        monCheck.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        monCheck.set(Calendar.HOUR_OF_DAY, 2);

        Calendar tueCheck = new GregorianCalendar();
        tueCheck.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        tueCheck.set(Calendar.HOUR_OF_DAY, 2);

        Calendar wedCheck = new GregorianCalendar();
        wedCheck.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        wedCheck.set(Calendar.HOUR_OF_DAY, 2);

        Calendar thuCheck = new GregorianCalendar();
        thuCheck.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
        thuCheck.set(Calendar.HOUR_OF_DAY, 2);

        Calendar friCheck = new GregorianCalendar();
        friCheck.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        friCheck.set(Calendar.HOUR_OF_DAY, 2);

        Calendar satCheck = new GregorianCalendar();
        satCheck.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        satCheck.set(Calendar.HOUR_OF_DAY, 2);

        if ((c.before(monCheck) && c.after(sunCheck)) || c.equals(sunCheck)) {
            viewpager.setCurrentItem(6);
        }

        else if ((c.before(tueCheck) && c.after(monCheck)) || c.equals(monCheck)) {
            viewpager.setCurrentItem(0);
        }

        else if ((c.before(wedCheck) && c.after(tueCheck)) || c.equals(tueCheck)) {
            viewpager.setCurrentItem(1);
        }

        else if ((c.before(thuCheck) && c.after(wedCheck)) || c.equals(wedCheck)) {
            viewpager.setCurrentItem(2);
        }

        else if ((c.before(friCheck) && c.after(thuCheck)) || c.equals(thuCheck)) {
            viewpager.setCurrentItem(3);
        }

        else if ((c.before(satCheck) && c.after(friCheck)) || c.equals(friCheck)) {
            viewpager.setCurrentItem(4);
        }

        else {
            viewpager.setCurrentItem(5);
        }
    }
}