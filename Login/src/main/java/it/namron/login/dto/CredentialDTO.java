package it.namron.login.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class CredentialDTO implements Parcelable {

    private String name;
    private String userName;
    private String email;
    private String userIcon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public CredentialDTO (){

    }

    protected CredentialDTO(Parcel in) {
        name = in.readString();
        userName = in.readString();
        email = in.readString();
        userIcon = in.readString();
    }

    public static final Creator<CredentialDTO> CREATOR = new Creator<CredentialDTO>() {
        @Override
        public CredentialDTO createFromParcel(Parcel in) {
            return new CredentialDTO(in);
        }

        @Override
        public CredentialDTO[] newArray(int size) {
            return new CredentialDTO[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(userName);
        dest.writeString(email);
        dest.writeString(userIcon);
    }

}
