package joshrod.com.madisondrinks;

/**
 * Created by milagrosjimenez on 1/31/16.
 */
import java.util.List;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private String[] titles = {"Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};

    public PageAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
        // TODO Auto-generated constructor stub
    }

    public Fragment getItem(int pos) {
        return this.fragments.get(pos);
    }

    public int getCount() {
        return this.fragments.size();
    }

    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}