package id.sch.smktelkom_mlg.tugas01.xirpl338.hitungsuhu;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Sakata Yoga on 25/01/2018.
 */
@RunWith(AndroidJUnit4.class)
public class AppTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule(MainActivity.class);

    int[] idAngka = {R.id.angka0, R.id.angka1, R.id.angka2, R.id.angka3, R.id.angka4, R.id.angka5, R.id.angka6, R.id.angka7, R.id.angka8, R.id.angka9};
    String tulisan = "";


    @Test
    public void TestClick() {


        for (int x = idAngka.length - 1; x >= 0; x--) {
            tulisan += x;
            Espresso.onView(ViewMatchers.withId(idAngka[x])).perform(ViewActions.click());
            Espresso.onView(ViewMatchers.withId(R.id.SuhuAwal)).check(ViewAssertions.matches(ViewMatchers.withText(tulisan)));
        }

        tulisan = "987654321";

        Espresso.onView(ViewMatchers.withId(R.id.delete)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.SuhuAwal)).check(ViewAssertions.matches(ViewMatchers.withText(tulisan)));

        Espresso.onView(ViewMatchers.withId(R.id.clear)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.SuhuAwal)).check(ViewAssertions.matches(ViewMatchers.withText("0")));


    }
}
