package cuongvo.android_walkthrough_with_oop.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;

import cuongvo.android_walkthrough_with_oop.adapter.SlidePagerAdapter;
import cuongvo.android_walkthrough_with_oop.data.SlideData;

/**
 * Created by cuongvo on 6/3/17.
 */

public class MyViewPager extends ViewPager implements ViewPager.OnPageChangeListener {
    private int mPreviousPosition = 0;
    private SlidePagerAdapter mSlidePagerAdapter;
    private IndicatorView mIndicatorView;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels);

        mPreviousPosition = position;
    }

    @Override
    public void onPageSelected(int position) {
        if (mPreviousPosition == position) {
            Log.d("Pager", "move backward");

            mSlidePagerAdapter.getList().get(position + 1).setSelected(false);
            mSlidePagerAdapter.getList().get(position).setSelected(true);

        } else {
            Log.d("Pager", "move forward");

            if (position == 0) {
                mSlidePagerAdapter.getList().get(0).setSelected(false);

            } else {
                mSlidePagerAdapter.getList().get(position - 1).setSelected(false);

            }
            mSlidePagerAdapter.getList().get(position).setSelected(true);
        }

        mIndicatorView.setSlideData(mSlidePagerAdapter.getList());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void setAdapter(PagerAdapter adapter) {
        super.setAdapter(adapter);
        this.mSlidePagerAdapter = (SlidePagerAdapter) adapter;
    }

    public void setIndicator(IndicatorView indicatorView){
        this.mIndicatorView = indicatorView;
    }
}
