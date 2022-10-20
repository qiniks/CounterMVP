package com.example.countermvp.helper

import com.example.countermvp.model.CounterModel
import com.example.countermvp.presenter.CounterPresenter

class CounterInjector {
    companion object {
        fun getPresenter(): CounterPresenter {
            return CounterPresenter()
        }

        fun getModel(): CounterModel {
            return CounterModel()
        }
    }
}