package com.morrisware.android.learnprofiler

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

/**
 * Created by MorrisWare on 2018/10/25.
 * Email: MorrisWare01@gmail.com
 */
class ErrorDrawView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint()

    init {
        paint.color = Color.RED
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)

        val width = when (widthMode) {
            MeasureSpec.EXACTLY -> widthSize
            MeasureSpec.AT_MOST, MeasureSpec.UNSPECIFIED -> 100
            else -> 100
        }

        val height = when (heightMode) {
            MeasureSpec.EXACTLY -> widthSize
            MeasureSpec.AT_MOST, MeasureSpec.UNSPECIFIED -> 100
            else -> 100
        }

        val size = Math.min(width, height)
        setMeasuredDimension(size, size)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // onDraw里不要创建新对象
        canvas.drawRect(Rect(0, 0, width, height), paint)
    }

}