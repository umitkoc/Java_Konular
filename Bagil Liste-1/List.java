package bagilliste;

public class List {

    Eleman bas;
    Eleman son;

    public List() {
        this.bas = null;
        this.son = null;
    }

    public boolean Dolumu() {
        return bas != null;
    }

    public void BasaEkle(int sayi) {
        Eleman e = new Eleman(sayi);
        if (Dolumu()) {
            e.siradaki = bas;
            bas = e;
        } else {
            bas = e;
            son = e;
        }

    }

    public void SonaEkle(int sayi) {
        Eleman e = new Eleman(sayi);
        if(Dolumu()){
            son.siradaki=e;
            son=e;
        }
        else{
            bas=e;
            son=e;
        }
    }
    public void Goster(){
        Eleman isaretci=bas;
        while(isaretci!=null){
            System.out.print(isaretci.sayi+" ");
            isaretci=isaretci.siradaki;
        }
    }

}
