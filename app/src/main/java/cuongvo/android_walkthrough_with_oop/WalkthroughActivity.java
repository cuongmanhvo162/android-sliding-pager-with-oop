package cuongvo.android_walkthrough_with_oop;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.Window;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.adapter.SlidePagerAdapter;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.util.DataUtil;
import cuongvo.android_walkthrough_with_oop.view.IndicatorView;

/**
 * Created by cuongvo on 5/28/17.
 */

public class WalkthroughActivity extends Activity {

    @BindView(R.id.activity_walkthrough_list)
    ViewPager mWalkthroughList;

    @BindView(R.id.indicator_list)
    IndicatorView mIndicatorView;

    private SlidePagerAdapter mSlidePagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_walkthrough);

        ButterKnife.bind(this);

    }

    @Override
    protected void onStart() {
        super.onStart();

        createWalkthroughList();
    }

    private void createWalkthroughList() {
        final List<SlideData> list = DataUtil.getWalkthroughList(this);

        mSlidePagerAdapter = new SlidePagerAdapter(this, list, SlidePagerAdapter.WALKTHROUGH_DATA);
        mWalkthroughList.setAdapter(mSlidePagerAdapter);
        mSlidePagerAdapter.notifyDataSetChanged();

        mIndicatorView.alignCentered();
        mIndicatorView.setSlideData(list);

        mWalkthroughList.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < list.size(); i++) {
                    if (mSlidePagerAdapter.getItemAt(i).isSelected()) {
                        mSlidePagerAdapter.getItemAt(i).setSelected(false);
                        mSlidePagerAdapter.getItemAt(position).setSelected(true);
                    }
                }
                mIndicatorView.setSlideData(mSlidePagerAdapter.getList());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
