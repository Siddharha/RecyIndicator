package in.creativelizard.recyindicatorlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class HorizontalIndicator extends LinearLayout {
    public HorizontalIndicator(Context ctx,  AttributeSet attrs) {
        super(ctx, attrs);
        TypedArray a = ctx.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.HorizontalIndicator,
                0, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void setOrientation(int orientation) {
        super.setOrientation(orientation);
    }
}
