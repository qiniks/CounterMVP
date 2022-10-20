package com.example.countermvp.view

import android.graphics.Color

interface CounterView {
    fun updateCount(count: Int)
    fun showToast()
    fun getColor()
    fun setColor()
}