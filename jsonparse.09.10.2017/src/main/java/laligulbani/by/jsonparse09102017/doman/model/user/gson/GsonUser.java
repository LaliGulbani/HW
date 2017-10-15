package laligulbani.by.jsonparse09102017.doman.model.user.gson;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import laligulbani.by.jsonparse09102017.doman.model.user.User;

public class GsonUser implements User {

    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("id")
    private long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("_id")
    private String _id;
    @SerializedName("index")
    private String index;
    @SerializedName("guid")
    private String guid;
    @SerializedName("isActive")
    private String isActive;
    @SerializedName("balance")
    private String balance;
    @SerializedName("picture")
    private String picture;
    @SerializedName("age")
    private String age;
    @SerializedName("eyeColor")
    private String eyeColor;
    @SerializedName("gender")
    private String gender;
    @SerializedName("company")
    private String company;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("about")
    private String about;
    @SerializedName("registered")
    private String registered;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("friends")
    private List<GsonUser> friends;
    @SerializedName("greeting")
    private String greeting;
    @SerializedName("favoriteFruit")
    private String favoriteFruit;

    @Override
    public long getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getAvatar() {
        return mAvatar;
    }

    public String getmAvatar() {
        return mAvatar;
    }

    public long getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String get_id() {
        return _id;
    }

    public String getIndex() {
        return index;
    }

    public String getGuid() {
        return guid;
    }

    public String getIsActive() {
        return isActive;
    }

    public String getBalance() {
        return balance;
    }

    public String getPicture() {
        return picture;
    }

    public String getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getAbout() {
        return about;
    }

    public Date getRegistered() {
        long l = Long.parseLong(registered);
        return new java.util.Date(l *1000);
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<GsonUser> getFriends() {
        return friends;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }
}
