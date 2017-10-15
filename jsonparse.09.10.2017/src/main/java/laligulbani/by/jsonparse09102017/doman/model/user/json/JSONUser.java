package laligulbani.by.jsonparse09102017.doman.model.user.json;

import org.json.JSONObject;

import laligulbani.by.jsonparse09102017.doman.model.user.User;

public class JSONUser implements User {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String AVATAR = "avatar";

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
    public String getAvatar() {
        return mJsonObject.optString(AVATAR);
    }
}
