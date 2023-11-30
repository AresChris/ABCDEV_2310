Exercice_7
variables   
    nombre est un entier
    newNb est un entier
    
Début du programme
    Ecrire "inscrire un nombre"
    lire nombre
    
    Début Tant_Que
        Tant_Que nombre != 0 faire
        Ecrire "Inscrire un nouveau nombre"
        lire nombre
            Début si 
                si (newNb > nombre) alors
                newNb <-- nombre
            Fin si
        Fin Tant_Que
            Ecrire "Le plus grand des nombres saisis est " ,newNb
Fin du programme