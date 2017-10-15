package laligulbani.by.jsonparse09102017.doman.model.wrapper;

import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.user.User;

public interface Wrapp {

    List<User> getItems();

    String getNextPageToken();

    String getKind();

    String getEtag();
}
