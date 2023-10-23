package Exo2;

public class Main {
    //méthode principale qui est le point de départ de l'exécution de votre programme Java. Elle est déclarée publique (public), statique (static), ne renvoie pas de valeur (void), et peut accepter des arguments sous forme de tableau de chaînes de caractères (String[] args).
    public static void main(String[] args){
        // je cree une instance du gestionnaire de carnet d'adresses
        ContactManager contactManager = new ContactManager();
        
        // Ajoutez un contact
        contactManager.ajouterContact("Alice", 123456789);
        contactManager.ajouterContact("Lambert", 670381612);
        contactManager.ajouterContact("Kriegenhofer" , 687564536);
        contactManager.ajouterContact("Bergerac" , 698764356);
        contactManager.ajouterContact("ondin", 635462435);
        
        
        // Trouvez un contact
        Integer numero = contactManager.trouverContact("Alice");
        if (numero != null) {
            System.out.println("Le numéro de téléphone d'Alice est : " + numero);
        } else {
            System.out.println("Le contact n'a pas été trouvé.");
        }
        
        // Affichez tous les contacts
        contactManager.afficherContacts();
    }
}
        
       
    
    
    

