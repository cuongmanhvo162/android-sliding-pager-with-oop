package cuongvo.android_walkthrough_with_oop.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cuongvo.android_walkthrough_with_oop.data.ComicCharacterData;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.data.WalkthroughData;
import cuongvo.android_walkthrough_with_oop.view.ComicCharacterBannerView;
import cuongvo.android_walkthrough_with_oop.view.WalkthroughView;

/**
 * Created by cuongvo on 5/28/17.
 */

public class SlidePagerAdapter extends PagerAdapter {

    public static final String WALKTHROUGH_DATA = "WALKTHROUGH_DATA";
    public static final String COMIC_CHARACTER_DATA = "COMIC_CHARACTER_DATA";

    private String mSlideType;

    private Context mContext;
    private List<SlideData> mList;

    public SlidePagerAdapter(Context context, List<SlideData> list, String slideType) {
        this.mContext = context;
        this.mList = list;
        this.mSlideType = slideType;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        SlideData slideData = mList.get(position);

        if (mSlideType.equals(WALKTHROUGH_DATA)) {
            WalkthroughView walkthroughView = new WalkthroughView(mContext);
            walkthroughView.setWalkthroughData((WalkthroughData) slideData);

            container.addView(walkthroughView);

            return walkthroughView;

        } else if (mSlideType.equals(COMIC_CHARACTER_DATA)) {
            ComicCharacterBannerView comicCharacterBannerView = new ComicCharacterBannerView(mContext);
            comicCharacterBannerView.setComicCharacterData((ComicCharacterData) slideData);

            container.addView(comicCharacterBannerView);

            return comicCharacterBannerView;

        } else {
            return super.instantiateItem(container, position);
        }
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public SlideData getItemAt(int position) {
        return this.mList.get(position);
    }

    public List<SlideData> getList() {
        return this.mList;
    }
}
