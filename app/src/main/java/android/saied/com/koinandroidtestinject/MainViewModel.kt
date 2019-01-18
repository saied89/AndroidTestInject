package android.saied.com.koinandroidtestinject

import androidx.lifecycle.ViewModel

class ContentGetter(val content: String = "Real Content")

class MainViewModel(private val contentGetter: ContentGetter) : ViewModel() {
    fun getContent() = contentGetter.content
}