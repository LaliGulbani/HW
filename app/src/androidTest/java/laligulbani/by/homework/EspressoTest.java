package laligulbani.by.homework;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import laligulbani.by.homework.app.controller.CalculatorActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    @Rule
    public final ActivityTestRule<CalculatorActivity> activityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void calculatorEspressoTest() {
        onView(withId(R.id.etNum1))
                .check(matches(isDisplayed()))
                .perform(typeText("10"));
        onView(withId(R.id.etNum2))
                .check(matches(isDisplayed()))
                .perform(typeText("7"));

        onView(withId(R.id.btnSub))
                .check(matches(isDisplayed()))
                .perform(click());

        onView(withId(R.id.tvResult))
                .check(matches(withText("3.0")));
    }
}