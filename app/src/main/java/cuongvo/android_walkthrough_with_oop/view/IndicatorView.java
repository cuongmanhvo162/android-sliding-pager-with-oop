package cuongvo.android_walkthrough_with_oop.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.R;
import cuongvo.android_walkthrough_with_oop.adapter.IndicatorAdapter;

/**
 * Created by cuongvo on 5/28/17.
 */

public class IndicatorView extends RelativeLayout {
    private List<SlideData> mSlideData;

    private Context mContext;

    private IndicatorAdapter mIndicatorAdapter;

    @BindView(R.id.view_indicator_list)
    RecyclerView mIndicatorList;

    public IndicatorView(Context context) {
        super(context);

        init(context);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public IndicatorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        View view = inflate(mContext, R.layout.view_indicator, this);
        ButterKnife.bind(this);

    }

    public void setSlideData(List<SlideData> list) {
        this.mSlideData = list;

        mIndicatorAdapter = new IndicatorAdapter(mContext, mSlideData);
        mIndicatorList.setAdapter(mIndicatorAdapter);
        mIndicatorAdapter.notifyDataSetChanged();
    }

    public void alignToLeft() {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) mIndicatorList.getLayoutParams();
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        mIndicatorList.setLayoutParams(params);
    }

    public void alignToRight() {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) mIndicatorList.getLayoutParams();
        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        mIndicatorList.setLayoutParams(params);
    }

    public void alignCentered() {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) mIndicatorList.getLayoutParams();
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        mIndicatorList.setLayoutParams(params);

    }
}
