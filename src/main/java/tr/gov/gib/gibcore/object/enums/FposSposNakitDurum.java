package tr.gov.gib.gibcore.object.enums;

public enum FposSposNakitDurum {
    HATA_OLUSTU("Hata oluştu", (short) 0),
    BASARISIZ_ODEME("Ödeme Başarısız", (short) 1),
    BASARILI_ODEME("Ödeme Başarılı", (short) 2),
    ODEME_IPTAL_EDILDI("Ödeme İşlemi İptal Edildi", (short) 3);

    private String sposFposNakitDurumu;
    private Short sposFposNakitDurumKodu;

    public String getSposFposNakitDurumu() {
        return sposFposNakitDurumu;
    }

    public Short getSposFposNakitDurumKodu() {
        return sposFposNakitDurumKodu;
    }

    FposSposNakitDurum(String sposFposNakitDurumu, Short sposFposNakitDurumKodu) {
        this.sposFposNakitDurumu = sposFposNakitDurumu;
        this.sposFposNakitDurumKodu = sposFposNakitDurumKodu;
    }
}
