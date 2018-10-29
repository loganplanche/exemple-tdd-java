package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PanierTest {
    private Panier panier, panierVide;
    private Produit produitBatterie, produitCoque, produitEcran, produitChargeur;

    @Before
    public void init() {
        panier = new Panier();
        panierVide = new Panier();
        produitBatterie = new Produit(1, "Batterie", 25.5);
        produitCoque = new Produit(2, "Coque", 10);
        produitEcran = new Produit(3, "Ecran", 30.9);
        produitChargeur = new Produit(4, "Chargeur", 20);
        panier.ajouterProduitDansPanier(produitBatterie);
        panier.ajouterProduitDansPanier(produitCoque);
        panier.ajouterProduitDansPanier(produitEcran);
    }

    @Test
    public void ajouterProduitDansPanier() {
        panier.ajouterProduitDansPanier(produitChargeur);
        assertTrue(panier.contient(produitChargeur));
    }

    @Test
    public void supprimerProduitDePanier() {
        ajouterProduitDansPanier();
        panier.supprimerProduitDePanier(produitChargeur);
        assertFalse(panier.contient(produitChargeur));
    }

    //Test de la première implémentation de consultation de panier
    @Test
    public void consulterTousLesProduitsDuPanier() {
        Assert.assertEquals("BatterieCoqueEcran", panier.consulterPanier());
    }

    //Test de la deuxième implémentation de consultation de panier
    @Test
    public void consulterMonpanier() {
        Assert.assertEquals(panier.listeProduits, panier.consulterMonPanier());
    }

    @Test
    public void consulterLeMontantTotalDuPanier() {
        // La variable delta permet de définir la valeur près
        // à laquelle on considère les deux nombres testés égaux.
        double delta = 0.0001;
        assertEquals(66.4, panier.consulterMontantPanier(), delta);
    }
}