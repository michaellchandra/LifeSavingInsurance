package Account;

import android.os.Parcel;
import android.os.Parcelable;

public class DataPemegangPolis {
    private String namaasuransi, namacalon, namapemegang, hubungan;
    private int umurcalon, umurpemegang, masapembayaran;
    private long Uang;

    public DataPemegangPolis() {
        this.namaasuransi="";
        this.namacalon = "";
        this.namapemegang = "";
        this.hubungan = "";
        this.umurcalon = 0;
        this.umurpemegang = 0;
        this.masapembayaran = 0;
        this.Uang = 0;
    }

    public DataPemegangPolis(String namaasuransi,String namacalon, String namapemegang, String hubungan, int umurcalon, int umurpemegang, int masapembayaran, long uang) {
        this.namaasuransi=namaasuransi;
        this.namacalon = namacalon;
        this.namapemegang = namapemegang;
        this.hubungan = hubungan;
        this.umurcalon = umurcalon;
        this.umurpemegang = umurpemegang;
        this.masapembayaran = masapembayaran;
        this.Uang = uang;
    }

    protected DataPemegangPolis(Parcel in){
        namaasuransi = in.readString();
        namacalon = in.readString();
        namapemegang = in.readString();
        hubungan = in.readString();
        umurcalon = in.readInt();
        umurpemegang = in.readInt();
        masapembayaran = in.readInt();
        Uang = in.readLong();
    }


    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(namaasuransi);
        dest.writeString(namacalon);
        dest.writeString(namapemegang);
        dest.writeString(hubungan);
        dest.writeInt(umurcalon);
        dest.writeInt(umurpemegang);
        dest.writeInt(masapembayaran);
        dest.writeLong(Uang);
    }

    public int describeContents(){
        return 0;
    }

    public static final Parcelable.Creator<DataPemegangPolis> CREATOR = new Parcelable.Creator<DataPemegangPolis>() {
        @Override
        public DataPemegangPolis createFromParcel(Parcel in) {
            return new DataPemegangPolis(in);
        }

        @Override
        public DataPemegangPolis[] newArray(int size) {
            return new DataPemegangPolis[size];
        }
    };

    public String getNamaasuransi(){
        return namaasuransi;
    }

    public void setNamaasuransi(String namaasuransi){
        this.namaasuransi = namaasuransi;
    }

    public String getNamacalon() {
        return namacalon;
    }

    public void setNamacalon(String namacalon) {
        this.namacalon = namacalon;
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

    public long getUang() {
        return Uang;
    }

    public void setUang(long uang) {
        Uang = uang;
    }
}
