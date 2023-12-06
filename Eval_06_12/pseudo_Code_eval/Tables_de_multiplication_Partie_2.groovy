Tables_de_multiplication_Partie_2

Variables
    choixUtilisateur est un entier
    multiplicateur est un entier
    suivant est une chaine de caractères
Début du programme
    Ecrire "Saisir un nombre entre 1 et 10 : "
    lire choixUtilisateur
    suivant <-- "O"
    début pour 
        pour i allant de 0 à 10 faire
        somme = i * choixUtilisateur
        Ecrire ,i " * " ,choixUtilisateur ," =" ,somme
    Fin Pour
        Ecrire "Souhaitez-vous afficher une autre table de multiplication ? Oui(O) ou Non(N)
        Lire suivant
            Début tant_Que
                tant_Que (suivant == "O") faire
                Ecrire "Saisir un nombre entre 1 et 10 : "
                Lire choixUtilisateur
                    début pour 
                        pour i allant de 0 à 10 faire
                        somme = i * choixUtilisateur
                        Ecrire ,i " * " ,choixUtilisateur ," =" ,somme
                        Ecrire "Souhaitez-vous afficher une autre table ? oui(O), non(N) : "
                        Lire suivant
                 Fin pour
            Fin Tant_Que
Fin du programme