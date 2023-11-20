Exercice_2.6
Variables
    nombreN est un entier
    compteur est un entier
    i est un entier
Début du programme
    Ecrire "Saisir un nombre entier : "
    Lire nombreN
    compteur <-- 0
    Début Pour
        Pour nombreN allant de 1 à nombreN
        Début si
            Si (nombreN mod i == 0) alors
            compteur <-- compteur + 1
            Fin Si
            Fin boucle Pour
        Début Si
            si (compteur mod i == 2) alors
                Ecrire "Ce nombre est premier !"
                    Sinon
                        Ecrire "Ce nombre n'est pas premier !"
                    FIN Si
                Fin Sinon
Fin du programme

