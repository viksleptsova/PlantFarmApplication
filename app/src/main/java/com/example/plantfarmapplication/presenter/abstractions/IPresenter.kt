package com.example.plantfarmapplication.presenter.abstractions

interface IPresenter<TView> {
    fun onViewCreated(view : TView)

    fun onDestroy()
}