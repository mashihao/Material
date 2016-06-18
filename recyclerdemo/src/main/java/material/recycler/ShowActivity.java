package material.recycler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by sv-004 on 2016/6/18.
 */
public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        ImageView imageView = (ImageView) findViewById(R.id.show);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.mashihao);
        imageView.setImageDrawable(new RoundImageDrawable(bitmap));
    }
}
