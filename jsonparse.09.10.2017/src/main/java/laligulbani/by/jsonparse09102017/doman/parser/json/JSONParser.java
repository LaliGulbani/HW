package laligulbani.by.jsonparse09102017.doman.parser.json;


        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;

        import laligulbani.by.jsonparse09102017.doman.model.user.User;
        import laligulbani.by.jsonparse09102017.doman.model.user.json.JSONUser;
        import laligulbani.by.jsonparse09102017.doman.model.wrapper.Wrapp;
        import laligulbani.by.jsonparse09102017.doman.model.wrapper.json.JsonWrapp;
        import laligulbani.by.jsonparse09102017.doman.parser.Parser;

        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

public class JSONParser implements Parser {

    private final InputStream mSource;

    public JSONParser(final InputStream pSource) {
        mSource = pSource;
    }

    @Override
    public User parseUser() throws Exception {
        final JSONObject jsonObject = new JSONObject(getString());
        return new JSONUser(jsonObject);
    }

    private String getString() throws IOException, JSONException {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(mSource))) {
            return buffer
                    .lines()
                    .collect(joining("\n"));
        }
    }

    @Override
    public List<User> parseCollection() throws Exception {
        String string = getString();
        JSONArray jsonArray = new JSONArray(string);

        List<JSONUser> container = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            container.add(new JSONUser(jsonObject));
        }

        return container.stream()
                .map(jsonUser -> (User) jsonUser)
                .collect(toList());
    }

    @Override
    public Wrapp parseObject() throws Exception {

        String string = getString();

        JSONObject jsonObject = new JSONObject(string);
        JSONArray items = jsonObject.getJSONArray("items");

        List<JSONUser> container = new ArrayList<>();
        for (int i = 0; i < items.length(); i++) {
            JSONObject obj = items.getJSONObject(i);
            container.add(new JSONUser(obj));
        }

        return new JsonWrapp(jsonObject, container);
    }
}
