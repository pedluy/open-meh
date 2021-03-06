package com.jawnnypoo.openmeh.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jawnnypoo.openmeh.R;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Simple PagerAdapter that shows images
 */
public class ImageAdapter extends PagerAdapter {

    private ArrayList<String> mData = new ArrayList<>();
    private Listener mListener;
    private boolean mAllowZoom;

    public ImageAdapter(boolean allowZoom, Listener listener) {
        mListener = listener;
        mAllowZoom = allowZoom;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, final int position) {
        View v;
        if (mAllowZoom) {
            v = LayoutInflater.from(collection.getContext()).inflate(R.layout.item_zoomable_image, collection, false);
        } else {
            v = LayoutInflater.from(collection.getContext()).inflate(R.layout.item_deal_image, collection, false);
        }
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        Glide.with(collection.getContext())
                .load(mData.get(position))
                .into(imageView);

        collection.addView(v, 0);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onImageClicked(v, position);
            }
        });
        return v;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public void setData(Collection<String> data) {
        if (data != null && !data.isEmpty()) {
            mData.clear();
            mData.addAll(data);
            notifyDataSetChanged();
        }
    }

    public interface Listener {
        void onImageClicked(View v, int position);
    }
}
