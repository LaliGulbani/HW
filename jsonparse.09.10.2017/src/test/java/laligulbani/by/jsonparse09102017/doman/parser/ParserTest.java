package laligulbani.by.jsonparse09102017.doman.parser;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.InputStream;

import laligulbani.by.jsonparse09102017.BuildConfig;
import laligulbani.by.jsonparse09102017.doman.constant.Constants;
import laligulbani.by.jsonparse09102017.doman.factory.Factory;
import laligulbani.by.jsonparse09102017.doman.http.HttpClient;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = Constants.SDK_VERSION
)
public abstract class ParserTest {

    protected static final String TAG = ParserTest.class.getSimpleName();

    static final int EXPECTED_ID = 1;
    static final String EXPECTED_NAME = "First Name and Last Name";
    static final String PATH_USER = "user/user.json";
    static final String PATH_USERS = "user/user_list.json";
    static final String PATH_USERS_WITH_ROOT_OBJECT = "user/user_list_with_root_object.json";
    static final String PATH_GENERATED = "generated.json";

    private HttpClient mHttpClient;
    laligulbani.by.jsonparse09102017.doman.factory.Factory factory;

    @Before
    public void setUp() {

        factory = new Factory();
        mHttpClient = mock(HttpClient.class);
    }

    InputStream getInputStream(String path) {
        InputStream mockedInputStream = stream(path);
        when(mHttpClient.request(Matchers.anyString())).thenReturn(mockedInputStream);
        return mHttpClient.request("http://myBackend/getUserList");
    }

    private InputStream stream(final String pName) {
        final InputStream resourceAsStream = ParserTest.class.getClassLoader().getResourceAsStream(pName);
        Assert.assertNotNull("resource not found, maybe you forget add .json?", resourceAsStream);
        return resourceAsStream;
    }
}