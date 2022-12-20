package com.example.geektech_m6_hw2.extension

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(msg:String){
    Glide.with(this).load(msg).into(this)
}