package cuongvo.android_walkthrough_with_oop;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.adapter.SlidePagerAdapter;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.util.DataUtil;
import cuongvo.android_walkthrough_with_oop.view.IndicatorView;
import cuongvo.android_walkthrough_with_oop.view.MyPagerHelper;

/**
 * Created by cuongvo on 5/28/17.
 */

public class WalkthroughActivity extends Activity {

    @BindView(R.id.activity_walkthrough_next)
    Button mNext;

    @BindView(R.id.activity_walkthrough_list)
    ViewPager mWalkthroughList;

    @BindView(R.id.indicator_list)
    IndicatorView mIndicatorView;

    private MyPagerHelper mMyPagerHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_walkthrough);

        ButterKnife.bind(this);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextItem = mWalkthroughList.getCurrentItem();
                nextItem = nextItem + 1;
                mWalkthroughList.setCurrentItem(nextItem, true);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        createWalkthroughList();
    }

    private void createWalkthroughList() {
        final List<SlideData> list = DataUtil.getWalkthroughList(this);

        mIndicatorView.alignCentered();
        mIndicatorView.setSlideData(list);

        mMyPagerHelper = new MyPagerHelper(this, mWalkthroughList, mIndicatorView);
        mMyPagerHelper.setAdapter(new SlidePagerAdapter(this, list, SlidePagerAdapter.WALKTHROUGH_DATA));
    }
}
