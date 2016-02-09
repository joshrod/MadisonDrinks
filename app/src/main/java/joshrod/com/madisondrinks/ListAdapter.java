package joshrod.com.madisondrinks;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.Color;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

/**
 * Created by milagrosjimenez on 2/8/16.
 */
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
        if (isExpanded) {
            convertView.setBackgroundResource(R.color.bloodred);
            convertView.invalidate();
        }
        else {
            convertView.setBackgroundColor(0x00FFFFFF);
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