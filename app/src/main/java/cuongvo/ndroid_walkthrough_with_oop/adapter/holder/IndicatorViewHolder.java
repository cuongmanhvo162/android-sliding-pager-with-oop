package cuongvo.ndroid_walkthrough_with_oop.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import cuongvo.ndroid_walkthrough_with_oop.R;

/**
 * Created by cuongvo on 5/28/17.
 */

public class IndicatorViewHolder extends RecyclerView.ViewHolder {
    public View point;

    public IndicatorViewHolder(View itemView) {
        super(itemView);
        point = (View) itemView.findViewById(R.id.adapter_indicator_view);
    }
}
