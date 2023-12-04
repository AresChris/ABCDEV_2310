Exercice_8_AssuAuto
// ancienneté // +5 ans = de vert à bleu
// sinistres // -25 ans refusé // +25 ans +2ans = vert
// âge --  '-25 et -2ans'=rouge sauf si accident= refusé
// 

Variables
    assure est un entier
    sinistres est un booleen
Début du programme
    Ecrire "Quel âge à l'assuré ?"
    Lire âge
    sinistre <-- "y"
    Ecrire "Sinistres ?"
    Lire sinistres


- 25 ans 
    permis de moins de 2 ans 
        pas de sinistres
            tarif rouge
        sinistres 
            refusé
    plus de 2 ans
        pas de sinistre
            tarif orange
        sinistres
            tarif rouge

+ 25 ans
    permis de moins de 2 ans
        pas de sinistres
            tarif orange
        sinistres
            tarif rouge
    permis depuis plus de 2 ans
        sinistres 
            tarif orange
        deux sinistres  
            rouge
        plus de deux sinistres
            refusé
        pas de sinistre
            tarif vert   
