package cuongvo.android_walkthrough_with_oop.view;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.data.ComicCharacterData;
import cuongvo.android_walkthrough_with_oop.R;

/**
 * Created by cuongvo on 5/28/17.
 */

public class ComicCharacterBannerView extends LinearLayout {

    @BindView(R.id.view_comic_character_title)
    TextView mTitle;

    @BindView(R.id.view_comic_character_image)
    ImageView mImage;

    private ComicCharacterData mComicCharacterData;
    private Context mContext;

    public ComicCharacterBannerView(Context context) {
        super(context);

        init(context);
    }

    public ComicCharacterBannerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public ComicCharacterBannerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ComicCharacterBannerView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        View view = inflate(mContext, R.layout.view_comic_character_banner, this);
        ButterKnife.bind(this);

    }

    public void setComicCharacterData(ComicCharacterData data) {
        this.mComicCharacterData = data;

        mTitle.setText(data.getTitle());
        mImage.setImageResource(data.getImageId());
    }

    public ComicCharacterData getComicCharacterData() {
        return this.mComicCharacterData;
    }


}
