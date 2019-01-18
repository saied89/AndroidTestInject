package android.saied.com.koinandroidtestinject

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.mockk.every
import io.mockk.mockk
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.standalone.StandAloneContext.stopKoin
import org.koin.test.KoinTest
import org.koin.test.declare

private const val MOCK_CONTENT = "Mock Content"

@RunWith(AndroidJUnit4::class)
class MainActivityTest : KoinTest {

    @After
    fun tearUp() {
        stopKoin()
    }

    @Test
    fun textViewContentTest() {
        declare {
            viewModel(override = true) {
                mockk<MainViewModel> {
                    every { getContent() } returns MOCK_CONTENT
                }
            }
        }

        val scenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.textView)).check(matches(withText(MOCK_CONTENT)))
    }
}