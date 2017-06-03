package cuongvo.android_walkthrough_with_oop.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;

import cuongvo.android_walkthrough_with_oop.adapter.SlidePagerAdapter;
import cuongvo.android_walkthrough_with_oop.data.SlideData;

/**
 * Created by cuongvo on 6/3/17.
 */

public class MyPagerHelper implements ViewPager.OnPageChangeListener {

    private int mPreviousPosition = 0;

    private Context mContext;
    private SlidePagerAdapter mSlidePagerAdapter;
    private ViewPager mViewPager;
    private IndicatorView mIndicatorView;

    public interface OnItemSelectedListener {
        void onSelected(SlideData slideData);
    }

    OnItemSelectedListener mOnItemSelectedListener;

    public MyPagerHelper(Context context, ViewPager viewPager, IndicatorView indicatorView) {
        this.mContext = context;
        this.mViewPager = viewPager;
        this.mViewPager.addOnPageChangeListener(this);
        this.mIndicatorView = indicatorView;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        mPreviousPosition = position;

        if (mOnItemSelectedListener != null) {
            SlideData slideData = mSlidePagerAdapter.getItemAt(position);
            mOnItemSelectedListener.onSelected(slideData);
        }

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

    public void setIndicator(IndicatorView indicatorView) {
        this.mIndicatorView = indicatorView;
    }

    public void setAdapter(SlidePagerAdapter adapter) {
        mSlidePagerAdapter = adapter;
        mViewPager.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void addOnItemSelected(OnItemSelectedListener listener) {
        this.mOnItemSelectedListener = listener;
    }
}
