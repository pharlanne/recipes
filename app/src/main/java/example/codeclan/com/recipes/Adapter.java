package example.codeclan.com.recipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//import com.squareup.picasso.Picasso;


public class Adapter extends BaseAdapter {

    private ArrayList mArrayList;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
//    private AmphibianList mFavourites;

    public Adapter(Context context, LayoutInflater inflater)
    {
        mArrayList = new ArrayList();
        mLayoutInflater = inflater;
        mContext = context;

    }

    public int getCount() {
        return mArrayList.size();
    }

    public Object getItem(int position) {
        return mArrayList;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

//
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.row_listitem, null);


            holder = new ViewHolder();
            holder.foodImageView = (ImageView) convertView.findViewById(R.id.img_food);
            holder.titleTextView = (TextView) convertView.findViewById(R.id.text_title);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
//
//        Picasso picasso = Picasso.with(mContext);
//        RequestCreator image = picasso.load(imageUrl);
//        image.into(holder.foodImageView);

        return convertView;
    }


    private static class ViewHolder {
        public ImageView foodImageView;
        public TextView titleTextView;

    }
}








