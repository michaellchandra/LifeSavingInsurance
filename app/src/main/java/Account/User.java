package Account;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String nama, email, password, tanggalLahir, nomorTelepon, uang;

    public User(String nama, String email, String password, String tanggalLahir, String nomorTelepon, String uang) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.tanggalLahir = tanggalLahir;
        this.nomorTelepon = nomorTelepon;
        this.uang = uang;
    }

    protected User(Parcel in) {
        nama = in.readString();
        email = in.readString();
        password = in.readString();
        tanggalLahir = in.readString();
        nomorTelepon = in.readString();
        uang = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getUang() {
        return uang;
    }

    public void setUang(String uang) {
        this.uang = uang;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(tanggalLahir);
        dest.writeString(nomorTelepon);
        dest.writeString(uang);
    }
}
