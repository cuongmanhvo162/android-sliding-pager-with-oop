package cuongvo.ndroid_walkthrough_with_oop.view;

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
import cuongvo.ndroid_walkthrough_with_oop.R;
import cuongvo.ndroid_walkthrough_with_oop.data.WalkthroughData;

/**
 * Created by cuongvo on 5/28/17.
 */

public class WalkthroughView extends LinearLayout {

    private Context mContext;

    @BindView(R.id.view_walkthrough_image)
    ImageView mWalkthroughImage;

    @BindView(R.id.view_walkthrough_title)
    TextView mTitle;

    @BindView(R.id.view_walkthrough_subtitle)
    TextView mSubtitle;

    public WalkthroughView(Context context) {
        super(context);

        init(context);
    }

    public WalkthroughView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public WalkthroughView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public WalkthroughView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        View view = inflate(mContext, R.layout.view_walkthrough, this);
        ButterKnife.bind(this);

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setWalkthroughData(WalkthroughData data) {
        mTitle.setText(data.getTitle());
        mSubtitle.setText(data.getSubtitle());
        mWalkthroughImage.setImageResource(data.getImageId());
    }

}
