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

    private void prepareList() {
        barsHeader = new ArrayList<String>();
        barsChildren = new HashMap<String, List<String>>();

        //add Header data
        barsHeader.add("Blue Velvet Lounge");
        barsHeader.add("Buck and Badger");
        barsHeader.add("Buckingham's");
        barsHeader.add("Chaser's");
        barsHeader.add("Church Key");
        barsHeader.add("City Bar");
        barsHeader.add("DLUX");
        barsHeader.add("Hawk's");
        barsHeader.add("Irish Pub");
        barsHeader.add("Jordan's Big Ten");
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
        bV.add("$5 Martinis until 9pm");
        bV.add("$3 Shot Special");
        bV.add("DJ & Dancing on 2nd level at 10pm");

        List<String> buck = new ArrayList<String>();
        buck.add(getResources().getString(R.string.buck));
        buck.add("$3 Cans of Floppin's Crappy English Brown Ale");
        buck.add("$4 Cabin Coolers");
        buck.add("$14 Pie Shotskis");

        List<String> bucky = new ArrayList<String>();
        bucky.add(getResources().getString(R.string.buckingham));
        bucky.add("$3.75 All Brands of Rum All Day");

        List<String> chase = new ArrayList<String>();
        chase.add(getResources().getString(R.string.chasers));
        chase.add("$5 Jumbo Bloody Marys");
        chase.add("$5 Screwdrivers");
        chase.add("$8 Goose Island and New Belgium Mixers");

        List<String> church = new ArrayList<String>();
        church.add(getResources().getString(R.string.church));
        church.add("$3 Long Islands");
        church.add("$2.50 Domestic Taps");
        church.add("$4.50 Jumbo Skyy Mixers");

        List<String> city = new ArrayList<String>();
        city.add(getResources().getString(R.string.city));
        city.add("All Day Specials");
        city.add("\t\t\t\t$3 Cans of PBR");
        city.add("\t\t\t\t$4 Tito's Vodka Mixers");

        List<String> dlux = new ArrayList<String>();
        dlux.add(getResources().getString(R.string.dlux));
        dlux.add("Bottomless Mimosas (9am - 3pm)");
        dlux.add("2-4-1 After 11pm");

        List<String> hawk = new ArrayList<String>();
        hawk.add("NONE");

        List<String> irish = new ArrayList<String>();
        irish.add(getResources().getString(R.string.irish));
        irish.add("Night Specials (7pm - close)");
        irish.add("\t\t\t\t$3 Rumchata");
        irish.add("\t\t\t\t$4 Import and Micro Pints");
        irish.add("\t\t\t\t$4 Top Shelf Mixers");
        irish.add("\t\t\t\t$5.50 Premium Mixers");


        List<String> jordan = new ArrayList<String>();
        jordan.add(getResources().getString(R.string.jordan));
        jordan.add("All Day Specials");
        jordan.add("\t\t\t\t$6 Buckets of Domestic Shorties");
        jordan.add("\t\t\t\t$9 Pitchers of Spotted Cows");
        jordan.add("Lunch Specials (11am - 2pm)");
        jordan.add("\t\t\t\t$8 Mega Bloody's");
        jordan.add("\t\t\t\t$3 Mimosas");
        jordan.add("Afternoon Specials (2pm - close)");
        jordan.add("\t\t\t\t$3 Long Island Ice Teas");
        jordan.add("\t\t\t\t$2 Bartender's Choice Shot");

        List<String> kK = new ArrayList<String>();
        kK.add(getResources().getString(R.string.kk));
        kK.add("Afternoon Specials");
        kK.add("\t\t\t\t$5 Titos Vodka Bloody Marys or Mixers");
        kK.add("\t\t\t\t$6 Domestic Pitchers");
        kK.add("\t\t\t\t$7.50 Cheesburger, Fries, and Soda");
        kK.add("Night Specials");
        kK.add("\t\t\t\t$4.50 Double Long Islands");
        kK.add("\t\t\t\t$4.50 Bomb Shots");
        kK.add("\t\t\t\t$4.50 Jack Daniels Mixers");
        kK.add("\t\t\t\t$4.50 3-Olives Mixers");

        List<String> lib = new ArrayList<String>();
        lib.add(getResources().getString(R.string.library));
        lib.add("All Day Specials");
        lib.add("\t\t\t\t$3.50 Jack Mixers");
        lib.add("\t\t\t\t$2.50 Domestics");
        lib.add("$2 Domestics (9pm - close)");

        List<String> lucky = new ArrayList<String>();
        lucky.add(getResources().getString(R.string.lucky));
        lucky.add("NONE");

        List<String> hat = new ArrayList<String>();
        hat.add(getResources().getString(R.string.hat));
        hat.add("$5 Domestic Pitchers (8pm - Midnight)");
        hat.add("$3 Fireball Shots");
        hat.add("$2 Kamikaze, Red Headed Slut, and Lemon Drop Shots");
        hat.add("$3 Apple Pie Shots");

        List<String> mer = new ArrayList<String>();
        mer.add(getResources().getString(R.string.merchant));
        mer.add("NONE");

        List<String> monday = new ArrayList<String>();
        monday.add(getResources().getString(R.string.monday));
        monday.add("$1 Domestic Taps");
        monday.add("$2 Import and Micro Taps");
        monday.add("$3.50 Vodka Lemonade");

        List<String> nitty = new ArrayList<String>();
        nitty.add(getResources().getString(R.string.nitty));
        nitty.add("Night Specials (9pm - close)");
        nitty.add("\t\t\t\t$2.50 Malibu Mixers");
        nitty.add("\t\t\t\t$3 Capital Brewery Pints");
        nitty.add("\t\t\t\t$3 Fireball Shots");
        nitty.add("Power Hour (10pm - 11pm)");
        nitty.add("\t\t\t\t$1.25 Rail Mixers");
        nitty.add("\t\t\t\t$1 High Life Taps");
        nitty.add("\t\t\t\t$2.25 Bomb Shots");
        nitty.add("Late Night Specials (11pm - close)");
        nitty.add("\t\t\t\t$4 High Life Pitchers");
        nitty.add("\t\t\t\t$2.50 Three Olives Mixers");
        nitty.add("\t\t\t\t$3 Milagro Shots");

        List<String> paul = new ArrayList<String>();
        paul.add(getResources().getString(R.string.paul));
        paul.add("$2 Mystery Shots");
        paul.add("$3 Labatt Blues");

        List<String> red = new ArrayList<String>();
        red.add(getResources().getString(R.string.rock));
        red.add("Country and Rock DJ");
        red.add("$7 Jack Daniels Doubles (10pm - close)");

        List<String> shed = new ArrayList<String>();
        shed.add(getResources().getString(R.string.shed));
        shed.add("NONE");

        List<String> zone = new ArrayList<String>();
        zone.add(getResources().getString(R.string.zone));
        zone.add("NONE");

        List<String> brats = new ArrayList<String>();
        brats.add(getResources().getString(R.string.brats));
        brats.add("$6 Skyy Double Mixers");
        brats.add("$5.50 Rose Bowls");

        List<String> tiki = new ArrayList<String>();
        tiki.add(getResources().getString(R.string.tiki));
        tiki.add("2-4-1 Bahama Mamas");
        tiki.add("$2 Select Shots");
        tiki.add("$3 Select Bomb Shots");
        tiki.add("$3 Double Vodka Lemonades");

        List<String> vin = new ArrayList<String>();
        vin.add(getResources().getString(R.string.vintage));
        vin.add("Night Special (8pm - close)");
        vin.add("\t\t\t\t$1 off Vintage Brews");
        vin.add("$2.50 Fireball Shots (Midnight - Close)");

        List<String> wand = new ArrayList<String>();
        wand.add(getResources().getString(R.string.wando));
        wand.add("All Day Every Day Specials");
        wand.add("\t\t\t\t$3.50 High Life Bottles");
        wand.add("\t\t\t\t$3.50 PBR Bottles");
        wand.add("\t\t\t\t$5 Jumbo UV Mixers");
        wand.add("$3.50 PBR or High Life Bottles");

        List<String> whiskey = new ArrayList<String>();
        whiskey.add(getResources().getString(R.string.whiskey));
        whiskey.add("Happy Hour (11am - 7pm)");
        whiskey.add("\t\t\t\t$1 off all Taps");
        whiskey.add("\t\t\t\t$2 Rail Drinks");
        whiskey.add("\t\t\t\t$3 Call Drinks");

        barsChildren.put(barsHeader.get(0), bV); //Header and Child
        barsChildren.put(barsHeader.get(1), buck);
        barsChildren.put(barsHeader.get(2), bucky);
        barsChildren.put(barsHeader.get(3), chase);
        barsChildren.put(barsHeader.get(4), church);
        barsChildren.put(barsHeader.get(5), city);
        barsChildren.put(barsHeader.get(6), dlux);
        barsChildren.put(barsHeader.get(7), hawk);
        barsChildren.put(barsHeader.get(8), irish);
        barsChildren.put(barsHeader.get(9), jordan);
        barsChildren.put(barsHeader.get(10), kK);
        barsChildren.put(barsHeader.get(11), lib);
        barsChildren.put(barsHeader.get(12), lucky);
        barsChildren.put(barsHeader.get(13), hat);
        barsChildren.put(barsHeader.get(14), mer);
        barsChildren.put(barsHeader.get(15), monday);
        barsChildren.put(barsHeader.get(16), nitty);
        barsChildren.put(barsHeader.get(17), paul);
        barsChildren.put(barsHeader.get(18), red);
        barsChildren.put(barsHeader.get(19), shed);
        barsChildren.put(barsHeader.get(20), zone);
        barsChildren.put(barsHeader.get(21), brats);
        barsChildren.put(barsHeader.get(22), tiki);
        barsChildren.put(barsHeader.get(23), vin);
        barsChildren.put(barsHeader.get(24), wand);
        barsChildren.put(barsHeader.get(25), whiskey);
    }
}
