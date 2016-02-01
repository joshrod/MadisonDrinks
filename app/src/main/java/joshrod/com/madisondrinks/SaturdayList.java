package joshrod.com.madisondrinks;

/**
 * Created by milagrosjimenez on 1/31/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class SaturdayList extends Fragment {

    ListAdapter listAdapter;
    ExpandableListView exListView;
    List<String> barsHeader;
    HashMap<String, List<String>> barsChildren;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_saturday, null);

        exListView = (ExpandableListView) vw.findViewById(R.id.saturday_list);
        prepareList();

        listAdapter = new ListAdapter(getActivity(), barsHeader, barsChildren);

        exListView.setAdapter(listAdapter);
        return vw;
    }

    public class ListAdapter extends BaseExpandableListAdapter {

        private Context context1;
        private List<String> listDataHeader1;
        private HashMap<String, List<String>> listDataChild1;

        public ListAdapter(Context context, List<String> listDataHeader,
                           HashMap<String, List<String>> listChildData) {
            this.context1 = context;
            this.listDataHeader1 = listDataHeader;
            this.listDataChild1 = listChildData;
        }

        public Object getChild(int groupPosition, int childPosition) {
            return this.listDataChild1.get(this.listDataHeader1.get(groupPosition))
                    .get(childPosition);
        }

        @Override
        public int getGroupCount() {
            // TODO Auto-generated method stub
            return this.listDataHeader1.size();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            // TODO Auto-generated method stub
            return this.listDataChild1.get(this.listDataHeader1.get(groupPosition))
                    .size();
        }

        @Override
        public Object getGroup(int groupPosition) {
            // TODO Auto-generated method stub
            return this.listDataHeader1.get(groupPosition);
        }

        @Override
        public long getGroupId(int groupPosition) {
            // TODO Auto-generated method stub
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            // TODO Auto-generated method stub
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            String headerTitle = (String) getGroup(groupPosition);
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) this.context1
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.list_group, null);
            }
            TextView barsHeader = (TextView) convertView.findViewById(R.id.bars_header);
            barsHeader.setTypeface(null, Typeface.BOLD);
            barsHeader.setText(headerTitle);

            return convertView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            final String childText = (String) getChild(groupPosition, childPosition);

            if (convertView == null) {
                LayoutInflater infalInflater = (LayoutInflater) this.context1.getSystemService
                        (Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.list_item, null);
            }

            TextView txtListChild = (TextView) convertView.findViewById(R.id.bars_item);
            txtListChild.setText(Html.fromHtml(childText));
            txtListChild.setMovementMethod(LinkMovementMethod.getInstance());
            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            // TODO Auto-generated method stub
            return true;
        }
    }

    private void prepareList() {
        barsHeader = new ArrayList<String>();
        barsChildren = new HashMap<String, List<String>>();

        //add Header data
        barsHeader.add("Blue Velvet Lounge");
        barsHeader.add("Brocach");
        barsHeader.add("Buck and Badger");
        barsHeader.add("Buckingham's");
        barsHeader.add("Chaser's");
        barsHeader.add("Church Key");
        barsHeader.add("City Bar");
        barsHeader.add("DLUX");
        barsHeader.add("The Double U");
        barsHeader.add("The Fountain");
        barsHeader.add("Hawk's");
        barsHeader.add("Irish Pub");
        barsHeader.add("The Ivory Room");
        barsHeader.add("Jordan's Big 10");
        barsHeader.add("The Kollege Klub");
        barsHeader.add("The Library");
        barsHeader.add("Lucky's");
        barsHeader.add("MadHatter's");
        barsHeader.add("Merchant");
        barsHeader.add("Monday's");
        barsHeader.add("Nitty Gritty");
        barsHeader.add("Paul's Club");
        barsHeader.add("Red Rock Saloon");
        barsHeader.add("Red Shed");
        barsHeader.add("The Red Zone");
        barsHeader.add("State Street Brats");
        barsHeader.add("Tiki Shack");
        barsHeader.add("Vintage");
        barsHeader.add("Wando's");
        barsHeader.add("Whiskey Jack's");

        //add Child data
        List<String> bV = new ArrayList<String>();
        bV.add(getResources().getString(R.string.bv));
        bV.add("SATURDAY SPECIAL");
        bV.add("SATURDAY SPECIAL");
        bV.add("SATURDAY SPECIAL");
        bV.add("SATURDAY SPECIAL");

        List<String> bro = new ArrayList<String>();
        bro.add(getResources().getString(R.string.brocach));
        bro.add("SATURDAY SPECIAL");

        List<String> buck = new ArrayList<String>();
        buck.add(getResources().getString(R.string.buck));
        buck.add("SATURDAY SPECIAL");

        List<String> bucky = new ArrayList<String>();
        bucky.add(getResources().getString(R.string.buckingham));
        bucky.add("SATURDAY SPECIAL");

        List<String> chase = new ArrayList<String>();
        chase.add(getResources().getString(R.string.chasers));
        chase.add("SATURDAY SPECIAL");

        List<String> church = new ArrayList<String>();
        church.add(getResources().getString(R.string.church));
        church.add("SATURDAY SPECIAL");

        List<String> city = new ArrayList<String>();
        city.add(getResources().getString(R.string.city));
        city.add("SATURDAY SPECIAL");

        List<String> dlux = new ArrayList<String>();
        dlux.add(getResources().getString(R.string.dlux));
        dlux.add("SATURDAY SPECIAL");

        List<String> w = new ArrayList<String>();
        w.add(getResources().getString(R.string.w));
        w.add("SATURDAY SPECIAL");

        List<String> fount = new ArrayList<String>();
        fount.add(getResources().getString(R.string.fountain));
        fount.add("SATURDAY SPECIAL");

        List<String> hawk = new ArrayList<String>();
        hawk.add(getResources().getString(R.string.hawk));
        hawk.add("SATURDAY SPECIAL");

        List<String> irish = new ArrayList<String>();
        irish.add(getResources().getString(R.string.irish));
        irish.add("SATURDAY SPECIAL");

        List<String> iv = new ArrayList<String>();
        iv.add(getResources().getString(R.string.ivory));
        iv.add("SATURDAY SPECIAL");

        List<String> jordan = new ArrayList<String>();
        jordan.add(getResources().getString(R.string.jordan));
        jordan.add("SATURDAY SPECIAL");

        List<String> kK = new ArrayList<String>();
        kK.add(getResources().getString(R.string.kk));
        kK.add("$5 Titos Vodka Bloody Marys or Mixers");
        kK.add("$6 Domestic Pitchers");
        kK.add("$7.50 Cheesburger, Fries, and Soda");
        kK.add("NIGHT");
        kK.add("- $4.50 Double Long Islands");
        kK.add("- $4.50 Bomb Shots");
        kK.add("- $4.50 Jack Daniels Mixers");
        kK.add("- $4.50 3-Olives Mixers");

        List<String> lib = new ArrayList<String>();
        lib.add(getResources().getString(R.string.library));
        lib.add("SATURDAY SPECIAL");

        List<String> lucky = new ArrayList<String>();
        lucky.add(getResources().getString(R.string.lucky));
        lucky.add("SATURDAY SPECIAL");

        List<String> hat = new ArrayList<String>();
        hat.add(getResources().getString(R.string.hat));
        hat.add("SATURDAY SPECIAL");

        List<String> mer = new ArrayList<String>();
        mer.add(getResources().getString(R.string.merchant));
        mer.add("SATURDAY SPECIAL");

        List<String> monday = new ArrayList<String>();
        monday.add(getResources().getString(R.string.monday));
        monday.add("SATURDAY SPECIAL");

        List<String> nitty = new ArrayList<String>();
        nitty.add(getResources().getString(R.string.nitty));
        nitty.add("SATURDAY SPECIAL");

        List<String> paul = new ArrayList<String>();
        paul.add(getResources().getString(R.string.paul));
        paul.add("SATURDAY SPECIAL");

        List<String> red = new ArrayList<String>();
        red.add(getResources().getString(R.string.rock));
        red.add("SATURDAY SPECIAL");

        List<String> shed = new ArrayList<String>();
        shed.add(getResources().getString(R.string.shed));
        shed.add("SATURDAY SPECIAL");

        List<String> zone = new ArrayList<String>();
        zone.add(getResources().getString(R.string.zone));
        zone.add("SATURDAY SPECIAL");

        List<String> brats = new ArrayList<String>();
        brats.add(getResources().getString(R.string.brats));
        brats.add("SATURDAY SPECIAL");
        brats.add("SATURDAY SPECIAL");

        List<String> tiki = new ArrayList<String>();
        tiki.add(getResources().getString(R.string.tiki));
        tiki.add("SATURDAY SPECIAL");

        List<String> vin = new ArrayList<String>();
        vin.add(getResources().getString(R.string.vintage));
        vin.add("SATURDAY SPECIAL");

        List<String> wand = new ArrayList<String>();
        wand.add(getResources().getString(R.string.wando));
        wand.add("SATURDAY SPECIAL");

        List<String> whiskey = new ArrayList<String>();
        whiskey.add(getResources().getString(R.string.whiskey));
        whiskey.add("SATURDAY SPECIAL");

        barsChildren.put(barsHeader.get(0), bV); //Header and Child
        barsChildren.put(barsHeader.get(1), bro);
        barsChildren.put(barsHeader.get(2), buck);
        barsChildren.put(barsHeader.get(3), bucky);
        barsChildren.put(barsHeader.get(4), chase);
        barsChildren.put(barsHeader.get(5), church);
        barsChildren.put(barsHeader.get(6), city);
        barsChildren.put(barsHeader.get(7), dlux);
        barsChildren.put(barsHeader.get(8), w);
        barsChildren.put(barsHeader.get(9), fount);
        barsChildren.put(barsHeader.get(10), hawk);
        barsChildren.put(barsHeader.get(11), irish);
        barsChildren.put(barsHeader.get(12), iv);
        barsChildren.put(barsHeader.get(13), jordan);
        barsChildren.put(barsHeader.get(14), kK);
        barsChildren.put(barsHeader.get(15), lib);
        barsChildren.put(barsHeader.get(16), lucky);
        barsChildren.put(barsHeader.get(17), hat);
        barsChildren.put(barsHeader.get(18), mer);
        barsChildren.put(barsHeader.get(19), monday);
        barsChildren.put(barsHeader.get(20), nitty);
        barsChildren.put(barsHeader.get(21), paul);
        barsChildren.put(barsHeader.get(22), red);
        barsChildren.put(barsHeader.get(23), shed);
        barsChildren.put(barsHeader.get(24), zone);
        barsChildren.put(barsHeader.get(25), brats);
        barsChildren.put(barsHeader.get(26), tiki);
        barsChildren.put(barsHeader.get(27), vin);
        barsChildren.put(barsHeader.get(28), wand);
        barsChildren.put(barsHeader.get(29), whiskey);
    }
}
