package cuongvo.android_walkthrough_with_oop.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.R;
import cuongvo.android_walkthrough_with_oop.adapter.holder.IndicatorViewHolder;

/**
 * Created by cuongvo on 5/28/17.
 */

public class IndicatorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<SlideData> mList;

    public IndicatorAdapter(Context context, List<SlideData> list) {
        this.mContext = context;
        this.mList = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        LayoutInflater inflaterMainCategory = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflaterMainCategory.inflate(R.layout.adapter_indicator, parent, false);

        IndicatorViewHolder holder = new IndicatorViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SlideData sliderData = mList.get(position);
        IndicatorViewHolder indicatorHolder = (IndicatorViewHolder) holder;

        Log.d("Slider","" + position);

        if (sliderData.isSelected()) {
            Log.d("Slider","selected");

            indicatorHolder.point.setBackgroundResource(R.drawable.shape_indicator_selected);

        } else {
            Log.d("Slider","unselected");

            indicatorHolder.point.setBackgroundResource(R.drawable.shape_indicator_unselected);

        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
