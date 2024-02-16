package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private int[] pics_Contact;

    private String[] nameList;

    private String[] email;

    Context context;

    public CustomAdapter(String[] nameList, String[] email, int[] pics_Contact, Context context) {
        this.nameList = nameList;
        this.email = email;
        this.pics_Contact = pics_Contact;
        this.context = context;
    }

    @Override
    public int getCount() {
        return nameList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_list_view, null);

        ImageView image = (ImageView) view.findViewById(R.id.contact_pic);
        TextView contactName = (TextView) view.findViewById(R.id.text_data);
        TextView emailAddress = (TextView) view.findViewById(R.id.text_data2);

        image.setImageResource(pics_Contact[position]);
        contactName.setText(nameList[position]);
        emailAddress.setText(email[position]);

        return view;
    }

}
