package com.raywenderlich.android.deezfoodz.dagger;

import android.content.Context;

import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenter;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenter;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ANSHDEEP on 05-06-2017.
 */

@Module
public class PresenterModule {

    // specifying that a FoodzPresenter will be provided,
    // and that the presenter returned will be the concrete implementation FoodzPresenterImpl.
    @Provides
    @Singleton
    FoodzPresenter provideFoodzPresenter(Context context) {
        return new FoodzPresenterImpl(context);
    }

    // specifying that a FoodPresenter will be provided
    // and that presenter returned will be the concrete implementation of FoodPresenterImpl.
    @Provides
    @Singleton
    FoodPresenter provideFoodPresenter(Context context) {
        return new FoodPresenterImpl(context);
    }
}
