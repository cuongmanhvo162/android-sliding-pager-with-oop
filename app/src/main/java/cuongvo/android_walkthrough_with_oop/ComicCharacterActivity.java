package cuongvo.android_walkthrough_with_oop;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.view.IndicatorView;
import cuongvo.android_walkthrough_with_oop.adapter.SlidePagerAdapter;
import cuongvo.android_walkthrough_with_oop.util.DataUtil;

/**
 * Created by cuongvo on 5/29/17.
 */

public class ComicCharacterActivity extends Activity {

    @BindView(R.id.activity_comic_character_list)
    ViewPager mWalkthroughList;

    @BindView(R.id.indicator_list)
    IndicatorView mIndicatorView;

    private SlidePagerAdapter mSlidePagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_comic_character);

        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        createComicCharacterList();
    }

    public void createComicCharacterList(){
        final List<SlideData> list = DataUtil.getComicCharacterList(this);

        mSlidePagerAdapter = new SlidePagerAdapter(this, list, SlidePagerAdapter.COMIC_CHARACTER_DATA);
        mWalkthroughList.setAdapter(mSlidePagerAdapter);
        mSlidePagerAdapter.notifyDataSetChanged();

        mIndicatorView.alignToRight();
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
