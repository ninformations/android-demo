package com.test.myapplication3.app.api;

import android.util.Log;
import com.test.myapplication3.app.api.entity.Greeting;

/**
 * Created by nitin.sharma01 on 08-07-2015.
 */
public class GreetingApi extends AbstractApi<Void, Void, Greeting> {

    @Override
    protected Greeting doInBackground(Void... params) {
        try {
            Greeting greeting = restTemplate.getForObject(baseUrl + "/greeting", Greeting.class);
            return greeting;
        } catch (Exception e) {
            Log.e(String.valueOf(GreetingApi.class), e.getMessage(), e);
        }
        return null;
    }
}
