package laligulbani.by.jsonparse09102017.doman.model.wrapper.json;

import org.json.JSONObject;

import java.util.Collection;
import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.user.User;
import laligulbani.by.jsonparse09102017.doman.model.user.json.JSONUser;
import laligulbani.by.jsonparse09102017.doman.model.wrapper.Wrapp;

import static java.util.stream.Collectors.toList;

public class JsonWrapp implements Wrapp {

    private static final String NEXT_PAGE_TOKEN = "nextPageToken";
    private static final String KIND = "kind";
    private static final String ETAG = "etag";

    private final JSONObject wrapp;
    private final Collection<JSONUser> jsonUsers;

    public JsonWrapp(JSONObject wrapp, List<JSONUser> users) {
        this.jsonUsers = users;
        this.wrapp = wrapp;
    }

    @Override
    public List<User> getItems() {
        return jsonUsers.stream()
                .map(gsonUser -> (User) gsonUser)
                .collect(toList());
    }

    @Override
    public String getNextPageToken() {
        return wrapp.optString(NEXT_PAGE_TOKEN);
    }

    @Override
    public String getKind() {
        return wrapp.optString(KIND);
    }

    @Override
    public String getEtag() {
        return wrapp.optString(ETAG);
    }
}
