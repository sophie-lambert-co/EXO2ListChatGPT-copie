package Exo2;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    // je déclare ici les attributs de ma class ( ou les champs)
    // Déclaration d'une HashMap privée pour stocker les contacts (nom -> numéro de téléphone).
    private HashMap <String, Integer>  maHashMap ;
   
    // Ici je définis le constructeur de la classe
    // J'initialise avec ce constructeur une nouvelle instance de HasMap et je l'assigne à maHasMap.
    public ContactManager(){
        maHashMap = new HashMap<>();
    }


     // Méthode pour ajouter un contact à la HashMap.
     public void ajouterContact(String nom, Integer numero){
         maHashMap.put(nom, numero);
        }
            
    // Méthode pour trouver le numéro de téléphone d'un contact par son nom.
    public Integer trouverContact(String nom){
        return maHashMap.get(nom);
    }
    
    // j'itére à travers chaque entrée (de type Map.Entry) dans la HashMap "maHashMap" et pair est une variable temporaire que j'utilise pour contenir chaque entrée à chaque itération.

    //Map.Entry" (en majuscules) est le nom de la classe générique fournie par l'interface Map en Java. C'est cette classe qui représente une entrée dans une map (paire clé-valeur). En utilisant "Map.Entry", j'indique au compilateur que "pair" est une instance de cette classe générique, ce qui me permet d'accéder à ses méthodes et d'extraire la clé et la valeur associées.
    public void afficherContacts(){
        for ( Map.Entry<String, Integer > pair: maHashMap.entrySet()){
            String clef =pair.getKey();
            Integer valeur = pair.getValue();
            System.out.println("Clef :" + clef + ", Valeur : " + valeur);
        }
  
}
}

    

    
