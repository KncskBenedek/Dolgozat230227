package model;

import java.util.List;

public class Aranyhal {

    private static final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private List<String> kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {

    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzam() {
        return 0;
    }

    public String[] kikkelTalakozott() {
        return null;
    }

    public boolean kivansagoTeljesit(String kivansag) {
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }

}
