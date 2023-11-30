Jalon_Algorithme_30/11/2023_CA

Variables 
    position est un entier
    nb est un entier
    nbPrecedent est un entier
    nbCourant est un entier
    nbSuivant est un entier
    resultat est une chanine de caractères
Début du programme
    Ecrire "Saisir un nombre : "
    lire nb
    positon <-- 2
    resultat <-- "\t0\n\t1"
    nbPrecedent <-- 0
    nbCourant <-- 1
    Début Si
        Si (nb > 2) alors
            Début Tant_Que (position < nb) faire
                nbSuivant <-- nbPrcedent + nbCourant
                resultat <-- resultat ,"\n\t" ,nbSuivant 
                nbPrecedent <-- nbCourant
                nbCourant <-- nbSuivant
                position <-- position +1
            Fin Tant_Que
        Sinon
            nb <-- 2
        Fin Si
    Fin Sinon
        Ecrire "[La suite de Fibonacci]"
        Ecrire "Combien de nombres de la suite de Fibonacci souhaitez-vous affiché :"
        Ecrire ""Les " ,nb ," premiers nombres de la suite de Fibonacci sont \n" ,resultat
        Ecrire ,nb ," nombres affichés");
Fin du programme
