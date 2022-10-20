package com.example.countermvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.countermvp.databinding.ActivityMainBinding
import com.example.countermvp.presenter.CounterPresenter
import com.example.countermvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    private var presenter = CounterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClikers()
    }

    private fun initClikers() {
        with(binding){
            incrementBtn.setOnClickListener{
                presenter.increment()
            }

            decrementBtn.setOnClickListener{
                presenter.decrement()
            }
        }
    }

    override fun updateCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляю", Toast.LENGTH_SHORT).show()
    }

    override fun getColor() {
        binding.resultTv.setTextColor(Color.GREEN)
    }

    override fun setColor() {
        binding.resultTv.setTextColor(Color.GRAY)
    }
}