package laligulbani.by.jsonparse09102017.doman.parser.gson;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.user.User;
import laligulbani.by.jsonparse09102017.doman.model.user.gson.GsonUser;
import laligulbani.by.jsonparse09102017.doman.model.wrapper.Wrapp;
import laligulbani.by.jsonparse09102017.doman.model.wrapper.gson.GsonWrapper;
import laligulbani.by.jsonparse09102017.doman.parser.Parser;

import static java.util.Arrays.asList;

public class GsonParser implements Parser {

    private final InputStreamReader reader;

    public GsonParser(final InputStream mIntputStream) {
        this.reader = new InputStreamReader(mIntputStream);
    }

    @Override
    public User parseUser() throws Exception {
        return new Gson().fromJson(reader, GsonUser.class);
    }

    @Override
    public List<User> parseCollection() throws Exception {
        GsonUser[] result = new Gson().fromJson(reader, GsonUser[].class);
        return asList(result);
    }

    @Override
    public Wrapp parseObject() throws Exception {
        return new Gson().fromJson(reader, GsonWrapper.class);
    }
}
