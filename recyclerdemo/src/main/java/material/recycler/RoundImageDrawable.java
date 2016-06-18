package material.recycler;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * Created by sv-004 on 2016/6/18.
 */
public class RoundImageDrawable extends Drawable {

    private Paint mPatin;
    private Bitmap mBitmap;
    private RectF rectF;

    public RoundImageDrawable(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
        BitmapShader bitmapShader = new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPatin = new Paint();
        mPatin.setAntiAlias(true);
        mPatin.setShader(bitmapShader);

    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        rectF = new RectF(left, top, right, bottom);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(rectF, 300, 300, mPatin);
    }

    @Override
    public void setAlpha(int i) {
        mPatin.setAlpha(i);

    }

    @Override
    public int getIntrinsicWidth() {
        return mBitmap.getWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return mBitmap.getHeight();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPatin.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
