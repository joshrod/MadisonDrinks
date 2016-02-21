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

public class WednesdayList extends Fragment {

    ListAdapter listAdapter;
    ExpandableListView exListView;
    List<String> barsHeader;
    HashMap<String, List<String>> barsChildren;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_wednesday, null);

        exListView = (ExpandableListView) vw.findViewById(R.id.wednesday_list);
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
        bV.add("Dice Night");
        bV.add("Test your luck on discounted drinks until close");

        List<String> buck = new ArrayList<String>();
        buck.add(getResources().getString(R.string.buck));
        buck.add("$2.50 Grainbelt Silos");
        buck.add("$4 Jack and Ginger");
        buck.add("$3 Totally Naked");

        List<String> bucky = new ArrayList<String>();
        bucky.add(getResources().getString(R.string.buckingham));
        bucky.add("Happy Hour (3pm - 7pm)");
        bucky.add("\t\t\t\t$1 off Regular Food Items");
        bucky.add("\t\t\t\t$.75 off Mixers");
        bucky.add("\t\t\t\t$.50 off Beer Items");
        bucky.add("Night Specials (7pm - close)");
        bucky.add("\t\t\t\t4 Cans of Domestics for $10");
        bucky.add("\t\t\t\t$4.75 Tallboys and Whiskey Shot");
        bucky.add("Hammertime (9:30pm - 11pm)");
        bucky.add("\t\t\t\t$1 Rail Mixers");
        bucky.add("\t\t\t\t$1 Specialty Shots");
        bucky.add("\t\t\t\t$2 Wisconsin Taps");
        bucky.add("\t\t\t\t$2 Specialty Shots");

        List<String> chase = new ArrayList<String>();
        chase.add(getResources().getString(R.string.chasers));
        chase.add("$.50 Tacos");
        chase.add("$4 Jumbo Margaritas");
        chase.add("3 for $5 Rail Mixers");

        List<String> church = new ArrayList<String>();
        church.add(getResources().getString(R.string.church));
        church.add("All Day Happy Hour (11am - 7pm)");
        church.add("\t\t\t\t$2.50 Taps");
        church.add("\t\t\t\t$2.50 Rails");
        church.add("Free Popcorn & Darts");
        church.add("$2 Wild Wild Wednesday Shots");
        church.add("$3 All Taps");
        church.add("$3 Blowjob Shot");
        church.add("$4 Bombs");
        church.add("$4 Jack Mixers");
        church.add("$5 Domestic Pitchers");

        List<String> city = new ArrayList<String>();
        city.add(getResources().getString(R.string.city));
        city.add("Happy Hour All Day");
        city.add("\t\t\t\t$1 off Everything");

        List<String> dlux = new ArrayList<String>();
        dlux.add("Afternoon Specials (3pm - 6:30pm)");
        dlux.add("\t\t\t\t$2 off Taps and Apps");
        dlux.add("\t\t\t\t$6 Spuds and Sparklers");


        List<String> hawk = new ArrayList<String>();
        hawk.add(getResources().getString(R.string.hawk));
        hawk.add("$1 off Rails");

        List<String> irish = new ArrayList<String>();
        irish.add(getResources().getString(R.string.irish));
        irish.add("Night Specials (7pm - close)");
        irish.add("\t\t\t\t$4 Import Pints");
        irish.add("\t\t\t\t$4 Irish Whiskey Mixers");
        irish.add("\t\t\t\t$5.50 Premium Irish Whiskey Mixers");

        List<String> jordan = new ArrayList<String>();
        jordan.add(getResources().getString(R.string.jordan));
        jordan.add("Happy Hour (3pm - 6pm)");
        jordan.add("\t\t\t\t$2 Domestic Taps");
        jordan.add("\t\t\t\t$3 Micro Taps");
        jordan.add("\t\t\t\t$1 off Bottled Beers");
        jordan.add("\t\t\t\t$.50 off Wine and Mixed Drinks");
        jordan.add("\t\t\t\tDiscounts on Pitchers");
        jordan.add("Night Specials (8pm - close)");
        jordan.add("\t\t\t\t$2 Captain Morgan Cannon Blast Shots");
        jordan.add("\t\t\t\t$3 Captain Mixers");
        jordan.add("\t\t\t\t$2 Spotted Cow Taps");

        List<String> kK = new ArrayList<String>();
        kK.add(getResources().getString(R.string.kk));
        kK.add("Burger Basket Special (6pm - 9pm)");
        kK.add("\t\t\t\t$10 Grilled Cheese/Cheeseburger Basket");
        kK.add("\t\t\t\tBottomless Domestic Taps");
        kK.add("Beer and Shot Night");
        kK.add("\t\t\t\t$3 Miller Lite Bottles");
        kK.add("\t\t\t\tFree shot with any bottle beer");
        kK.add("\t\t\t\t$3 Long Islands");
        kK.add("\t\t\t\t$5 Miller Lite Pitchers");

        List<String> lib = new ArrayList<String>();
        lib.add(getResources().getString(R.string.library));
        lib.add("Happy Hour (4pm - 7pm)");
        lib.add("\t\t\t\t$3.25 - $4.25 Taps");
        lib.add("\t\t\t\t$2.50 Rail Mixers");
        lib.add("\t\t\t\t$2.25 Domestics");
        lib.add("Happy Hour Taps all Night");
        lib.add("$2 Domestics (9pm - close)");

        List<String> lucky = new ArrayList<String>();
        lucky.add(getResources().getString(R.string.lucky));
        lucky.add("$2.75 Bud Light Bottles");
        lucky.add("$7 10-inch Pizzas");
        lucky.add("$2 Mystery Shots");

        List<String> hat = new ArrayList<String>();
        hat.add(getResources().getString(R.string.hat));
        hat.add("Student Appreciation");
        hat.add("All Taps and Rails $2");

        List<String> mer = new ArrayList<String>();
        mer.add(getResources().getString(R.string.merchant));
        mer.add("Happy Hour (3pm - 6pm)");
        mer.add("\t\t\t\t$2 off Classic Cocktails and Drafts");
        mer.add("\t\t\t\t$2 off Lawnmower Beers");

        List<String> monday = new ArrayList<String>();
        monday.add(getResources().getString(R.string.monday));
        monday.add("$2 Domestic Bottles");
        monday.add("$3.50 Almost Anything");
        monday.add("$2 Tequila Shots");

        List<String> nitty = new ArrayList<String>();
        nitty.add(getResources().getString(R.string.nitty));
        nitty.add("Night Specials (9pm - close)");
        nitty.add("\t\t\t\t$1.75 Cans of PBR & Labatt Blue");
        nitty.add("\t\t\t\t$1.75 Rolling Rock Cans");
        nitty.add("\t\t\t\t$2 Dr.McGillicuddy Shots");
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
        red.add("$1 Burgers All Day");
        red.add("Happy Hour (4pm - 7pm)");
        red.add("\t\t\t\t1/2 off All Taps and Apps");
        red.add("\t\t\t\t$5 Red Rock Signature Drinks");
        red.add("\t\t\t\tFree Bull Rides");
        red.add("Night Specials (10pm - close)");
        red.add("\t\t\t\t$3 Beers");
        red.add("\t\t\t\t$3 Bombs");

        List<String> shed = new ArrayList<String>();
        shed.add(getResources().getString(R.string.shed));
        shed.add("$1.25 Rail Whiskey Mixers");
        shed.add("$2 PBR Bottles");

        List<String> zone = new ArrayList<String>();
        zone.add(getResources().getString(R.string.zone));
        zone.add("Happy Hour (3pm - 7pm)");
        zone.add("\t\t\t\t$1 off Any Drink");
        zone.add("\t\t\t\t$2 off Any Pitchers");

        List<String> brats = new ArrayList<String>();
        brats.add(getResources().getString(R.string.brats));
        brats.add("Combine Single Stacks and New Glarus Taps");
        brats.add("\t\t\t\t5 for $5 (9pm - 10pm)");
        brats.add("\t\t\t\t4 for $5 (10pm - 11pm)");
        brats.add("\t\t\t\t3 for $5 (11pm - midnight)");
        brats.add("\t\t\t\t2 for $5 (midnight - close)");

        List<String> tiki = new ArrayList<String>();
        tiki.add(getResources().getString(R.string.tiki));
        tiki.add("Happy Hour (5pm - 7pm)");
        tiki.add("\t\t\t\t1/2 off Appetizers");
        tiki.add("$2 Select Shots");
        tiki.add("$3 Select Bomb Shots");
        tiki.add("$3 Double Vodka Lemonades");

        List<String> vin = new ArrayList<String>();
        vin.add(getResources().getString(R.string.vintage));
        vin.add("Happy Hour (3pm - 8pm)");
        vin.add("\t\t\t\t1/2 off All Vintage Brews");
        vin.add("\t\t\t\t$2 Rail Mixers");
        vin.add("Night Specials (8pm - close)");
        vin.add("\t\t\t\t$3 Jim Beam & Jack Daniels Mixers");
        vin.add("\t\t\t\t$3 Tullamore Dew & Jameson Mixers");
        vin.add("\t\t\t\t$2 PBR Drafts");
        vin.add("$2.50 Fireball Shots (Midnight - Close)");

        List<String> wand = new ArrayList<String>();
        wand.add(getResources().getString(R.string.wando));
        wand.add("All Day Every Day Specials");
        wand.add("\t\t\t\t$3.50 High Life Bottles");
        wand.add("\t\t\t\t$3.50 PBR Bottles");
        wand.add("Student Appreciation Night");
        wand.add("Specials only valid with Student ID");
        wand.add("\t\t\t\t$2 Domestic Drafts");
        wand.add("\t\t\t\t$4 Jumbo Rails");
        wand.add("\t\t\t\t$8 Personal Fishbowls");
        wand.add("\t\t\t\t$.50 Wings");

        List<String> whiskey = new ArrayList<String>();
        whiskey.add(getResources().getString(R.string.whiskey));
        whiskey.add("Happy Hour (3pm - 7pm)");
        whiskey.add("\t\t\t\t$1 off all Taps");
        whiskey.add("\t\t\t\t$2 Rail Drinks");
        whiskey.add("\t\t\t\t$3 Call Drinks");
        whiskey.add("2-4-1 Shots");
        whiskey.add("$3 Signature Drinks and Slushies");
        whiskey.add("$5 off Pitchers of Beers");

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