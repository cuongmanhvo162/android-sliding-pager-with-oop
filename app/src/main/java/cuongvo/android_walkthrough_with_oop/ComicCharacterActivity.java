package cuongvo.android_walkthrough_with_oop;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.data.ComicCharacterData;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.view.ComicCharacterBannerView;
import cuongvo.android_walkthrough_with_oop.view.IndicatorView;
import cuongvo.android_walkthrough_with_oop.adapter.SlidePagerAdapter;
import cuongvo.android_walkthrough_with_oop.util.DataUtil;
import cuongvo.android_walkthrough_with_oop.view.MyPagerHelper;

/**
 * Created by cuongvo on 5/29/17.
 */

public class ComicCharacterActivity extends Activity {

    @BindView(R.id.activity_comic_character_description)
    EditText mDescription;

    @BindView(R.id.activity_comic_character_list)
    ViewPager mWalkthroughList;

    @BindView(R.id.indicator_list)
    IndicatorView mIndicatorView;

    private MyPagerHelper mMyPagerHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_comic_character);

        ButterKnife.bind(this);

        mDescription.setKeyListener(null);

        createComicCharacterList();

    }

    public void createComicCharacterList() {
        final List<SlideData> list = DataUtil.getComicCharacterList(this);

        mIndicatorView.alignToRight();
        mIndicatorView.setSlideData(list);

        mMyPagerHelper = new MyPagerHelper(this, mWalkthroughList, mIndicatorView);
        mMyPagerHelper.setAdapter(new SlidePagerAdapter(this, list, SlidePagerAdapter.COMIC_CHARACTER_DATA));
        mMyPagerHelper.addOnItemSelected(new MyPagerHelper.OnItemSelectedListener() {
            @Override
            public void onSelected(SlideData slideData) {
                ComicCharacterData data = (ComicCharacterData) slideData;
                mDescription.setText(data.getDescription());
            }
        });

    }
}
