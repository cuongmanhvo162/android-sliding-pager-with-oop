package cuongvo.android_walkthrough_with_oop.util;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import cuongvo.android_walkthrough_with_oop.data.ComicCharacterData;
import cuongvo.android_walkthrough_with_oop.data.SlideData;
import cuongvo.android_walkthrough_with_oop.data.WalkthroughData;
import cuongvo.android_walkthrough_with_oop.R;

/**
 * Created by cuongvo on 5/28/17.
 */

public class DataUtil {

    public static List<SlideData> getComicCharacterList(Context context) {
        List<SlideData> list = new ArrayList<>();

        ComicCharacterData data1 = new ComicCharacterData();
        data1.setTitle(context.getString(R.string.captain_american));
        data1.setImageId(R.drawable.img_captian_american);
        data1.setSelected(true);
        data1.setDescription(context.getString(R.string.captain_american_description));
        list.add(data1);

        ComicCharacterData data2 = new ComicCharacterData();
        data2.setTitle(context.getString(R.string.hulk));
        data2.setSelected(false);
        data2.setDescription(context.getString(R.string.hulk_description));
        data2.setImageId(R.drawable.img_hulk);
        list.add(data2);

        ComicCharacterData data3 = new ComicCharacterData();
        data3.setTitle(context.getString(R.string.spider_man));
        data3.setSelected(false);
        data3.setDescription(context.getString(R.string.spider_man_description));
        data3.setImageId(R.drawable.img_spiderman);
        list.add(data3);

        ComicCharacterData data4 = new ComicCharacterData();
        data4.setTitle(context.getString(R.string.iron_man));
        data4.setSelected(false);
        data4.setDescription(context.getString(R.string.iron_man_description));
        data4.setImageId(R.drawable.ironman);
        list.add(data4);

        ComicCharacterData data5 = new ComicCharacterData();
        data5.setTitle(context.getString(R.string.wolverine));
        data5.setImageId(R.drawable.img_wolverine);
        data5.setSelected(false);
        data5.setDescription(context.getString(R.string.wolverine_description));
        list.add(data5);

        ComicCharacterData data6 = new ComicCharacterData();
        data6.setTitle(context.getString(R.string.dead_pool));
        data6.setSelected(false);
        data6.setImageId(R.drawable.img_deadpool);
        data6.setDescription(context.getString(R.string.dead_pool_description));
        list.add(data6);

        ComicCharacterData data7 = new ComicCharacterData();
        data7.setTitle(context.getString(R.string.thor));
        data7.setSelected(false);
        data7.setImageId(R.drawable.img_thor);
        data7.setDescription(context.getString(R.string.thor_description));
        list.add(data7);

        return list;
    }

    public static List<SlideData> getWalkthroughList(Context context) {
        List<SlideData> list = new ArrayList<>();
        WalkthroughData data1 = new WalkthroughData();
        data1.setTitle(context.getString(R.string.step_1));
        data1.setSubtitle(context.getString(R.string.pasta_1));
        data1.setImageId(R.drawable.pasta_1);
        data1.setSelected(true);
        list.add(data1);

        WalkthroughData data2 = new WalkthroughData();
        data2.setTitle(context.getString(R.string.step_2));
        data2.setSubtitle(context.getString(R.string.pasta_2));
        data2.setImageId(R.drawable.pasta_2);
        data2.setSelected(false);
        list.add((WalkthroughData) data2);

        WalkthroughData data3 = new WalkthroughData();
        data3.setTitle(context.getString(R.string.step_3));
        data3.setSubtitle(context.getString(R.string.pasta_3));
        data3.setImageId(R.drawable.pasta_3);
        data3.setSelected(false);
        list.add(data3);

        WalkthroughData data4 = new WalkthroughData();
        data4.setTitle(context.getString(R.string.step_4));
        data4.setSubtitle(context.getString(R.string.pasta_4));
        data4.setImageId(R.drawable.pasta_4);
        data4.setSelected(false);
        list.add(data4);

        WalkthroughData data5 = new WalkthroughData();
        data5.setTitle(context.getString(R.string.step_5));
        data5.setSubtitle(context.getString(R.string.pasta_5));
        data5.setImageId(R.drawable.pasta_5);
        data5.setSelected(false);
        list.add(data5);

        WalkthroughData data6 = new WalkthroughData();
        data6.setTitle(context.getString(R.string.step_6));
        data6.setSubtitle(context.getString(R.string.pasta_6));
        data6.setImageId(R.drawable.pasta_6);
        data6.setSelected(false);
        list.add(data6);

        WalkthroughData data7 = new WalkthroughData();
        data7.setTitle(context.getString(R.string.step_7));
        data7.setSubtitle(context.getString(R.string.pasta_7));
        data7.setImageId(R.drawable.pasta_7);
        data7.setSelected(false);
        list.add(data7);

        WalkthroughData data8 = new WalkthroughData();
        data8.setTitle(context.getString(R.string.step_8));
        data8.setSubtitle(context.getString(R.string.pasta_8));
        data8.setImageId(R.drawable.pasta_8);
        data8.setSelected(false);
        list.add(data8);

        WalkthroughData data9 = new WalkthroughData();
        data9.setTitle(context.getString(R.string.step_9));
        data9.setSubtitle(context.getString(R.string.pasta_9));
        data9.setImageId(R.drawable.pasta_9);
        data9.setSelected(false);
        list.add(data9);


        return list;
    }

}
