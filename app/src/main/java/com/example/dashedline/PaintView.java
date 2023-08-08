package com.example.dashedline;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

import com.google.android.material.drawable.DrawableUtils;

public class PaintView extends View {

        private Paint   mPaint;
        private Path    mPath;
        private int     vWidth;
        private int     vHeight;

        public PaintView(Context context) {
            super(context);
            init();
        }

        public PaintView(Context context, AttributeSet attrs) {
            super(context, attrs);
            init();
        }

        public PaintView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            init();
        }

        private void init() {
            mPaint = new Paint();
            mPaint.setColor(Color.parseColor("#3F577C"));
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setPathEffect(new DashPathEffect(new float[] {10,10}, 0));
            mPath = new Path();
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.vWidth = getMeasuredWidth();
            this.vHeight = getMeasuredHeight();
            mPath.moveTo(0, this.vHeight / 3);
            mPath.quadTo(this.vWidth / 3, this.vHeight / 3, this.vWidth, this.vHeight / 3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawPath(mPath, mPaint);
        }
    }
