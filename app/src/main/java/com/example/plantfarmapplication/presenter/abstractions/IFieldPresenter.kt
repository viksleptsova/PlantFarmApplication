package com.example.plantfarmapplication.presenter.abstractions

interface IFieldPresenter<TView> {
    fun onViewCreated(view : TView)
}