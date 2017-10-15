package laligulbani.by.jsonparse09102017.doman.parser;

import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.wrapper.Wrapp;
import laligulbani.by.jsonparse09102017.doman.model.wrapper.gson.GsonWrapper;
import laligulbani.by.jsonparse09102017.doman.model.user.User;

public interface Parser {

    User parseUser() throws Exception;

    List<User> parseCollection() throws Exception;

    Wrapp parseObject() throws Exception;
}
