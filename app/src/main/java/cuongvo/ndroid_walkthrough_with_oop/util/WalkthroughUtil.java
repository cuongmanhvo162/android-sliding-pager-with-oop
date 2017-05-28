package cuongvo.ndroid_walkthrough_with_oop.util;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import cuongvo.ndroid_walkthrough_with_oop.R;
import cuongvo.ndroid_walkthrough_with_oop.data.SlideData;
import cuongvo.ndroid_walkthrough_with_oop.data.WalkthroughData;

/**
 * Created by cuongvo on 5/28/17.
 */

public class WalkthroughUtil {

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
