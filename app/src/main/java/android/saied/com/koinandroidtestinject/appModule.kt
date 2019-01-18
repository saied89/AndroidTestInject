package android.saied.com.koinandroidtestinject

import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {
    viewModel {
        MainViewModel()
    }
}