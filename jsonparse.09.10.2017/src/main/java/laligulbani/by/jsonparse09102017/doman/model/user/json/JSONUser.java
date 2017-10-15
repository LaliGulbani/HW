package laligulbani.by.jsonparse09102017.doman.model.user.json;

import org.json.JSONObject;

import java.util.Date;
import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.user.User;
import laligulbani.by.jsonparse09102017.doman.model.user.gson.GsonUser;

public class JSONUser implements User {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String INDEX = "index";
    private static final String GUID = "guid";
    private static final String ISACTIVE = "isActive";
    private static final String BALANCE = "balance";
    private static final String PICTURE = "picture";
    private static final String AGE = "age";
    private static final String EYECOLOR = "eyeColor";
    private static final String GENDER= "gender";
    private static final String COMPANY = "company";
    private static final String PHONE= "phone";
    private static final String ADDRESS = "address";
    private static final String ABOUT = "about";
    private static final String LATITUDE = "latitude";
    private static final String LONGITUDE= "longitude";
    private static final String GREETING = "greeting";
    private static final String FRUIT = "fruit";
    private  static final String   FRIENDS = "friends";
    private static final String TAGS = "tag";



    private final JSONObject mJsonObject;

    public JSONUser(final JSONObject pJsonObject) {
        mJsonObject = pJsonObject;
    }

    @Override
    public long getId() {
        return mJsonObject.optLong(ID);
    }

    @Override
    public String getName() {
        return mJsonObject.optString(NAME);
    }

    @Override
    public String getEmail() {
        return mJsonObject.optString(EMAIL);
    }

    public Date getRegistered() {
        long l = Long.parseLong(mJsonObject.optString("registered"));
        return new java.util.Date(l * 1000);
    }

    public String getIndex() {
        return mJsonObject.optString(INDEX);
    }

    public String getGuid() {
        return mJsonObject.optString(GUID);
    }

    public String getIsActive() {
        return mJsonObject.optString(ISACTIVE);
    }

    public String getBalance() {
        return mJsonObject.optString(BALANCE);
    }

    public String getPicture() {
        return mJsonObject.optString(PICTURE);
    }

    public String getAge() {
        return mJsonObject.optString(AGE);
    }

    public String getEyeColor() {
        return mJsonObject.optString(EYECOLOR);
    }

    public String getGender() {
        return mJsonObject.optString(GENDER);
    }

    public String getCompany() {
        return mJsonObject.optString(COMPANY);
    }

    public String getPhone() {
        return mJsonObject.optString(PHONE);
    }

    public String getAddress() {
        return mJsonObject.optString(ADDRESS);
    }

    public String getAbout() {
        return mJsonObject.optString(ABOUT);
    }

    public String getLatitude() {
        return mJsonObject.optString(LATITUDE);
    }

    public String getLongitude() {
        return mJsonObject.optString(LONGITUDE);
    }

    public String getTags() {
        return mJsonObject.optString(String.valueOf(TAGS));
    }

    public String getFriends() {
        return mJsonObject.optString(String.valueOf(FRIENDS));
    }

    public String getGreeting() {
        return mJsonObject.optString(GREETING);
    }

    public String getFavoriteFruit() {
        return mJsonObject.optString(FRUIT);
    }

}
