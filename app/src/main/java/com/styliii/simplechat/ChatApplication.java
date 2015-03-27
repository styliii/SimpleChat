package com.styliii.simplechat;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by liouyang on 3/5/15.
 */
public class ChatApplication extends android.app.Application {
    public static final String YOUR_APPLICATION_ID = "QhD8VlsbX98flCTfBtYqwQXdVg7FaAsiSmDXH6ZS";
    public static final String YOUR_CLIENT_KEY = "E56Bw5QDnXReUADDzEDSFXZocQrpOvnTP8DCQLtk";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }

}
