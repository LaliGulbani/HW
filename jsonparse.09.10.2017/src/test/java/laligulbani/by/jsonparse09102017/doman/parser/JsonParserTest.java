package laligulbani.by.jsonparse09102017.doman.parser;

import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.user.User;
import laligulbani.by.jsonparse09102017.doman.model.wrapper.Wrapp;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class JsonParserTest extends ParserTest {

    @Test
    public void parseGson_generated() throws Exception {
        final List<User> userList = factory.createJSONParser(getInputStream(PATH_GENERATED)).parseCollection();

        assertTrue(userList.size() == 5);
        assertTrue(userList.get(0).getId() == 0);
        assertEquals("Shelia Chang", userList.get(0).getName());
    }

    @Test
    public void parseJson() throws Exception {
        final User user = factory.createGsonParser(getInputStream(PATH_USER)).parseUser();

        assertEquals(EXPECTED_ID, user.getId());
        assertEquals(EXPECTED_NAME, user.getName());
        assertEquals(EXPECTED_AVATAR, user.getAvatar());
    }

    @Test
    public void parseJsonCollection() throws Exception {
        InputStream response = getInputStream(PATH_USERS);

        final List<User> userList = factory.createJSONParser(response).parseCollection();
        assertTrue(userList.size() == 2);
        assertTrue(userList.get(0).getId() == 1);
        assertEquals(EXPECTED_NAME, userList.get(0).getName());
    }

    @Test
    public void parseJsonCollectionWithObject() throws Exception {
        InputStream responseWithObject = getInputStream(PATH_USERS_WITH_ROOT_OBJECT);

        final Wrapp wrapp = factory.createJSONParser(responseWithObject).parseObject();
        assertTrue(wrapp.getItems().size() == 2);
        assertEquals("Vasia", wrapp.getItems().get(0).getName());
    }
}
