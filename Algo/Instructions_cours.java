Variables      // Commencer par indiquer (déclarer) les variables | Jamais de majuscule ni de chiffre pour démarrer une variable, aucun espaces non plus
    variable1 est un entier     // entier signifie que la variable ne peut contenir de décimal // en Java le code est : int 
    variable2 est un reel       // reel signifie que le nombre peut contenir une décimal // en Java le code est : float ou double, mais double est plus pratique
    variable3 est de type chaine  // chaine (de caractères) singnifie que la variable aura pour valeur des lettres (mots) // en Java le code est : string

Début du programme // Une fois les variables déclarées, elles peuvent être utilisées dans le programme
    Ecrire "Inscrivez une valeur qui ira dans la variable variable1"  // un message textuel s'affichera pour l'utilisateur
    // Sur Algobox il faudra utiliser le bouton : Afficher message
    
    Lire variable1  // La valeur donnée par l'utilisateur ira dans la variable variable1
    // Sur Algobox il faudra utiliser le bouton : Lire variable (Attribuer une valeur à la variable)
    
    Ecrire "Inscrivez une valeur qui ira dans la variable variable2"  // en Java, le code est : System.out.println("Inscrivez une valeur qui ira dans la variable variable2"); || toujours ajouter un ; à la fin d'une déclaration
   
    Lire variable2  // En java, le code est : variable2 = sc.nextDouble(); //ca demandera une valeur à l'utilisateur et l'attribuera à la variable variable2

    variable3 <-- 50 // variable3 prend la valeur 50, donc il vaudra 50 à partir de maintenant
                    // en Java le code est : variable3 = 50
                    // sur Algobox il faudra utiliser le bouton : Attribuer valeur variable
    
    Début si
        si (nombre1 < nombre2) alors    // si la variable nombre1 est plus petit que la variable nombre2 || en Java le code est :           if (nombre1 < nombre2) {
        Ecrire "nombre1 est le plus petit des deux nombres"  // afficher un message pour l'utilisateur ||               En java :            System.out.println("nombre1 est le plus petit des deux nombres");
                                                                                                                                            }
            Sinon  // Si la condition du dessus n'est pas vrai, il faut que le programme fasse quelque chose, donc sinon || En java :       else if (nombre1 > nombre2){ 
                Si (nombre1 > nombre2)                                                                                                       System.out.println("nombre1 est le plus grand des deux nombres");
                Ecrire "nombre1 est le plus grand des deux"   
                Afficher nombre1 // Montre la valeur de la variable variable1  || En Java : System.out.println(variable1); pour afficher une variable, il ne faut pas ajouter de guillemets ! Ce n'est pas du texte.                                                                             }
                Fin si                                                                                                                       
            Fin Sinon                               

          /*  En pseudo-code et en Java :
          /   < plus petit que 
          /   > plus grand que 
          /   <= plus petit ou égal à
          /   >= plus grand ou égal à 
          /    = égal à 
         /*   != est différent de

           /*  Sur Algobox :
          /   < plus petit que 
          /   > plus grand que 
          /   <= plus petit ou égal à
          /   >= plus grand ou égal à 
          /   == égal à 
          /*  != différent de