package android.saied.com.koinandroidtestinject

import androidx.lifecycle.ViewModel

const val REAL_CONTENT = "Real Content"

class MainViewModel(val content: String = REAL_CONTENT) : ViewModel()