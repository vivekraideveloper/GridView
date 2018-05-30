package com.vijayjaidewan01vivekrai.gridview_github;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by MR VIVEK RAI on 30-05-2018.
 */

public class CustomAdapter extends BaseAdapter {

    private Activity activity;
    private Integer[] image = {R.drawable.android_a, R.drawable.android, R.drawable.android_b, R.drawable.bicycle_icon};

    public CustomAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return image[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(activity);
        imageView.setLayoutParams(new GridView.LayoutParams(500,500));
        imageView.setImageResource(image[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10,10, 10, 10);
        return imageView;
    }
}
