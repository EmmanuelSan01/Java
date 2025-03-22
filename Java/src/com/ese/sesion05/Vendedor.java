package com.ese.sesion05;

/**
 *
 * @author camper
 */
public class Vendedor {
    // Atributos
    private String documento;
    private int tipo;
    private long valorVentasMes;
    
    // Constructores
    public Vendedor() {
        documento = "";
        tipo = 0;
        valorVentasMes = 0;
    }
    
    public Vendedor(String documento) {
        this.documento = documento;
    }
    
    public Vendedor(String documento, int tipo, long valorVentasMes) {
        this.documento = documento;
        this.tipo = tipo;
        this.valorVentasMes = valorVentasMes;
    }
    
    // Métodos Getters & Setters
    public String getDocumento() {
        return this.documento;
    }
    /*
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    */
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public long getValorVentasMes() {
        return valorVentasMes;
    }

    public void setValorVentasMes(long valorVentasMes) {
        this.valorVentasMes = valorVentasMes;
    }
    
    // Otros métodos
    public long calcularPago() {
        double comision = 0.0;
        if (tipo == 1) {
            comision = valorVentasMes * 0.25;
        } else if (tipo == 2) {
            comision = valorVentasMes * 0.20;
        } else {
            return -1;
        }
        
        return valorVentasMes + (long) comision;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "documento=" + documento + ", tipo=" + tipo + ", valorVentasMes=" + valorVentasMes + '}';
    }
    
    public static void main(String[] args) {
        Vendedor v = new Vendedor("123");
        
        v.setTipo(2);
        v.setValorVentasMes(2000000);
        
        System.out.println(v);
    }
}