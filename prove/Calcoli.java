package javabasics.prove;

public class Calcoli {

    private Double conto = 10_000.00;

    public Calcoli(Double conto) {
        this.conto = conto;
    }

    public Calcoli(){
        this.conto = getConto();
    }

    public Double getConto() {
        return conto;
    }

    public void setConto(Double conto) {
        this.conto = conto;
    }

    void Prelievo(Double prelievo){
        conto = conto - prelievo;
        System.out.println(conto);
    }

    void Versamento(Double versamento){
        conto = conto + versamento;
        System.out.println(conto);
    }

    @Override
    public String toString() {
        return "Calcoli{" +
                "conto=" + conto +
                '}';
    }
}
