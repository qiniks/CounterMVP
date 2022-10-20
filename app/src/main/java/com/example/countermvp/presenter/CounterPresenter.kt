package com.example.countermvp.presenter

import com.example.countermvp.helper.CounterInjector
import com.example.countermvp.view.CounterView

class CounterPresenter {

    private val model = CounterInjector.getModel()
    private lateinit var view:CounterView

    fun increment(){
        model.increment()
        view.updateCount(model.getCount())
        if (model.getCount() == 10){
            view.showToast()
        }else if(model.getCount() == 15){
            view.getColor()
        }else{
            view.setColor()
        }
    }

    fun decrement(){
        model.decrement()
        view.updateCount(model.getCount())
        if (model.getCount() == 10){
            view.showToast()
        }else if(model.getCount() == 15){
            view.getColor()
        }else{
            view.setColor()
        }
    }

    fun attachView(view: CounterView){
        this.view = view
    }
}