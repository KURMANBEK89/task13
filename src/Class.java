public class Class {
    private int nomer;
    private String soz;
    private int[] massive;

    public Class(){

    }
    public Class(int nomer, String soz,int[] massive){
        this.nomer = nomer;
        this.soz = soz;
        this.massive = massive;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }
}
