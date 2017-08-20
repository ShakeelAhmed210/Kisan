package com.pakistan.kisan.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pakistan.kisan.R;


/**
 * Created by Shakeel Ahmed on 8/19/2017.
 */

public class CropsGridAdapter extends BaseAdapter{

    public String[] bill_item_names;
    public int[] billing_images;
    private Context context;
    private LayoutInflater layoutInflater;
    int[] images;

    public CropsGridAdapter(Context context, String[] items_name, int[] img) {
        this.context = context;
        this.bill_item_names = items_name;
        this.layoutInflater = LayoutInflater.from(context);
        this.images = img;
    }

    /**
     * @return the length of bill items
     */
    @Override
    public int getCount() {
        return bill_item_names.length;
    }

    @Override
    public Object getItem(int position) {
        return this.bill_item_names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    /**
     * to inflate list of items
     * it wil update ui according to selected language and display data of bill history
     * @param position is position of item
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.select_category_adapter, null);
            convertView.setTag(new ViewHolder(convertView));
        }

        holder = new ViewHolder(convertView);
        holder.categoryText.setText(bill_item_names[position]);
       holder.billingIcons.setImageResource(images[position]);

        return convertView;
    }

    protected class ViewHolder {
        private ImageView billingIcons;
        private TextView categoryText;

        public ViewHolder(View view) {
            billingIcons = (ImageView) view.findViewById(R.id.billing_icons);
            categoryText = (TextView) view.findViewById(R.id.category_text);
        }
    }
}
