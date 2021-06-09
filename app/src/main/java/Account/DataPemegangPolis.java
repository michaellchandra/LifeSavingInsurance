package Account;

import android.os.Parcel;
import android.os.Parcelable;

public class DataPemegangPolis implements Parcelable {
    private String namaasuransi, namacalon,jeniskelamin, namapemegang, hubungan;
    private int umurcalon, umurpemegang, masapembayaran;
    private long Uangp, Uang;

    public DataPemegangPolis() {
        this.namaasuransi = "";
        this.namacalon = "";
        this.jeniskelamin = "";
        this.namapemegang = "";
        this.hubungan = "";
        this.umurcalon = 0;
        this.umurpemegang = 0;
        this.masapembayaran = 0;
        Uangp = 0;
        Uang = 0;
    }

    public DataPemegangPolis(String namaasuransi, String namacalon, String jeniskelamin, String namapemegang, String hubungan, int umurcalon, int umurpemegang, int masapembayaran, long uangp, long uang) {
        this.namaasuransi = namaasuransi;
        this.namacalon = namacalon;
        this.jeniskelamin = jeniskelamin;
        this.namapemegang = namapemegang;
        this.hubungan = hubungan;
        this.umurcalon = umurcalon;
        this.umurpemegang = umurpemegang;
        this.masapembayaran = masapembayaran;
        Uangp = uangp;
        Uang = uang;
    }

    protected DataPemegangPolis(Parcel in) {
        namaasuransi = in.readString();
        namacalon = in.readString();
        jeniskelamin = in.readString();
        namapemegang = in.readString();
        hubungan = in.readString();
        umurcalon = in.readInt();
        umurpemegang = in.readInt();
        masapembayaran = in.readInt();
        Uangp = in.readLong();
        Uang = in.readLong();
    }

    public static final Creator<DataPemegangPolis> CREATOR = new Creator<DataPemegangPolis>() {
        @Override
        public DataPemegangPolis createFromParcel(Parcel in) {
            return new DataPemegangPolis(in);
        }

        @Override
        public DataPemegangPolis[] newArray(int size) {
            return new DataPemegangPolis[size];
        }
    };

    public String getNamaasuransi() {
        return namaasuransi;
    }

    public void setNamaasuransi(String namaasuransi) {
        this.namaasuransi = namaasuransi;
    }

    public String getNamacalon() {
        return namacalon;
    }

    public void setNamacalon(String namacalon) {
        this.namacalon = namacalon;
    }

    public String getJeniskelamin() {
        return namacalon;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getNamapemegang() {
        return namapemegang;
    }

    public void setNamapemegang(String namapemegang) {
        this.namapemegang = namapemegang;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void setHubungan(String hubungan) {
        this.hubungan = hubungan;
    }

    public int getUmurcalon() {
        return umurcalon;
    }

    public void setUmurcalon(int umurcalon) {
        this.umurcalon = umurcalon;
    }

    public int getUmurpemegang() {
        return umurpemegang;
    }

    public void setUmurpemegang(int umurpemegang) {
        this.umurpemegang = umurpemegang;
    }

    public int getMasapembayaran() {
        return masapembayaran;
    }

    public void setMasapembayaran(int masapembayaran) {
        this.masapembayaran = masapembayaran;
    }

    public long getUangp() {
        return Uangp;
    }

    public void setUangp(long uangp) {
        Uangp = uangp;
    }

    public long getUang() {
        return Uang;
    }

    public void setUang(long uang) {
        Uang = uang;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaasuransi);
        dest.writeString(namacalon);
        dest.writeString(jeniskelamin);
        dest.writeString(namapemegang);
        dest.writeString(hubungan);
        dest.writeInt(umurcalon);
        dest.writeInt(umurpemegang);
        dest.writeInt(masapembayaran);
        dest.writeLong(Uangp);
        dest.writeLong(Uang);
    }
}