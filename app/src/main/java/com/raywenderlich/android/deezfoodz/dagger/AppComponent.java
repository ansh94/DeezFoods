package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.food.FoodActivity;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ANSHDEEP on 05-06-2017.
 */

// You’ve told Dagger that AppComponent is a singleton component interface for the app.
// The @Component annotation takes a list of modules as an input, and you’ve added AppModule to the list.
@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {

    // Here, you’ve specified that the FoodzActivity class will require injection from AppComponent.
    // You’re going to inject the presenter object into FoodzActivity.
    void inject(FoodzActivity target);

    // inject method for FoodActivity class target
    void inject(FoodActivity target);

    // inject method for FoodzPresenterImpl class target
    void inject(FoodzPresenterImpl target);

    // inject method for FoodPresenterImpl class target
    void inject(FoodPresenterImpl target);
}
