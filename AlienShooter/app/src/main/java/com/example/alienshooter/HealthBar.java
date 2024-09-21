package com.example.alienshooter;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class HealthBar  {
    private Paint paint;
    private int health = 100; // 当前生命值
    private int maxHealth = 100; // 最大生命值
    private int m_width;
    private int m_height;
    private int m_x=0;
    private int m_y=0;

    HealthBar()
    {
        paint=new Paint();
    }


    public int getM_width() {
        return m_width;
    }

    public int getM_height() {
        return m_height;
    }


    public int getM_x() {
        return m_x;
    }

    public int getM_y() {
        return m_y;
    }


    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setM_height(int m_height) {
        this.m_height = m_height;
    }

    public void setM_width(int m_width) {
        this.m_width = m_width;
    }

    private void init() {
        paint = new Paint();
    }

    public void setM_x(int m_x) {
        this.m_x = m_x;
    }

    public void setM_y(int m_y) {
        this.m_y = m_y;
    }



    public void draw(Canvas canvas) {

        // 计算生命条的宽度
        float width = getM_width();
        float height = getM_height();
        float healthWidth = (health / (float) maxHealth) * width;

        // 绘制背景
        paint.setColor(Color.GRAY);
        canvas.drawRect(getM_x(), getM_y(),getM_x()+width,getM_y()+height, paint);

        // 绘制生命值
        paint.setColor(Color.GREEN);
        canvas.drawRect(getM_x(), getM_y(),getM_x()+healthWidth,getM_y()+height, paint);
    }


}
