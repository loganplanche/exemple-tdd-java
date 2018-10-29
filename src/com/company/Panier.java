package com.company;

import java.util.ArrayList;

class Panier {

    // On déclare l'attribut principal du panier, c-a-d une liste de Produits
    ArrayList<Produit> listeProduits = new ArrayList<>();

    // Méthode d'ajout de produit au panier
    void ajouterProduitDansPanier(Produit produitAAjouter) {
        if(produitAAjouter!=null){
            listeProduits.add(produitAAjouter);
        }else{
            System.out.println("Le produit est null.");
        }
    }

    // Méthode de suppression de produit du panier
    void supprimerProduitDePanier(Produit produitASupprimer) {
        if (listeProduits.size() > 0) {
            for (int i = 0; i < listeProduits.size(); i++) {
                if (listeProduits.get(i).equals(produitASupprimer)) {
                    listeProduits.remove(i);
                }
            }
        } else {
            System.out.println("Le panier est déjà vide.");
        }
    }

    // Méthode pour vérifier si l'ajout ou la suppression à été successful
    boolean contient(Produit produitATester) {
        if (produitATester != null) {
            if (listeProduits.size() > 0) {
                for (int i = 0; i < listeProduits.size(); i++) {
                    if (listeProduits.get(i).equals(produitATester)) {
                        return true;
                    }
                }
            } else {
                System.out.println("Le panier est vide.");
                return false;
            }
        } else {
            System.out.println("Le produit entré est null.");
        }
        return false;
    }

    // Première implémentation pour le cas de test "Consulter tous les produits du panier"
    String consulterPanier() {
        StringBuilder produits = new StringBuilder();
        if (listeProduits.size() > 0) {
            for (int i = 0; i < this.listeProduits.size(); i++) {
                produits.append(this.listeProduits.get(i).getNomProduit());
            }
        } else {
            produits.append("Le panier est vide");
        }
        return produits.toString();
    }

    // Deuxième implémentation pour le cas de test "Consulter tous les produits du panier
    ArrayList<Produit> consulterMonPanier() {
        return this.listeProduits;
    }

    // Méthode qui calcule et retourne le montant total du panier
    double consulterMontantPanier() {
        double total = 0.0;
        if (listeProduits.size() > 0) {
            for (int i = 0; i < this.listeProduits.size(); i++) {
                total = total + this.listeProduits.get(i).getPrixProduit();
            }
        }
        return total;
    }
}
