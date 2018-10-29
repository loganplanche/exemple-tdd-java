package com.company;

public class Produit {

    // Définition classique d'un produit id, nom, prix
    private int idProduit;
    private String nomProduit;
    private double prixProduit;


    Produit(int id, String nom, double prix) {
        this.idProduit = id;
        this.nomProduit = nom;
        this.prixProduit = prix;
    }

    /* Accesseurs aux attributs */

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
}
