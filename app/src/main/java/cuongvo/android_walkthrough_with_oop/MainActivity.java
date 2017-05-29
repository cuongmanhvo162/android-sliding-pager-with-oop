package cuongvo.android_walkthrough_with_oop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongvo.android_walkthrough_with_oop.util.IntentUtil;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main_walkthrough)
    Button mWalkthrough;

    @BindView(R.id.activity_main_comic_character)
    Button mComicCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mWalkthrough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = IntentUtil.createIntent(MainActivity.this, WalkthroughActivity.class, "Open Walkthrough");
                startActivity(intent);
            }
        });

        mComicCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = IntentUtil.createIntent(MainActivity.this, ComicCharacterActivity.class, "Open Comic Character");
                startActivity(intent);

            }
        });

    }
}
