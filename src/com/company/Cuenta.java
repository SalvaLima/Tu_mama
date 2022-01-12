package com.company;

public class Cuenta {

    private String nombreCliente,numeroCliente;
    private double tipoInteres,saldo;

    //Constructores

    public Cuenta(){

    }

    public Cuenta(String nombreCliente,String numeroCliente,double tipoInteres,double saldo){
        this.nombreCliente=nombreCliente;
        this.numeroCliente=numeroCliente;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;
    }

    //getters y setters

    public String getNumeroCliente(){
        return numeroCliente;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public boolean ingresar (double cantidad){
        boolean realizado = false;
        if (cantidad > 0){
            this.saldo += cantidad;
            realizado = true;
        }
        return realizado;
    }

    public boolean reintegro (double cantidad){
        boolean realizado = false;
        if (this.getSaldo()>= cantidad && cantidad >0){
            this.saldo -= cantidad;
            realizado=true;
        }
        return realizado;
    }

    public boolean transeferencia(Cuenta ctaDestino, double cantidad){
        boolean realizado=false;
        if ( cantidad <= this.getSaldo()&& cantidad >= 0){
            ctaDestino.setSaldo(ctaDestino.getSaldo()+cantidad);
            this.setSaldo( this.getSaldo() - cantidad);
            realizado=true;
        }
        return realizado;
    }

    public Cuenta (Cuenta cta){
        this.nombreCliente= cta.getNombreCliente();
        this.numeroCliente= cta.getNumeroCliente();
        this.tipoInteres= cta.getTipoInteres();
        this.saldo = cta.getSaldo();
    }
}

