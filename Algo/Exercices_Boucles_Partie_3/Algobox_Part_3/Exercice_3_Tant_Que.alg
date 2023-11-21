<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="limite PREND_LA_VALEUR userChoice+10" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" arrondiAuto="vrai" maxBoucle="500000" epaisseurPoint="2" totalAffichages="1000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="userChoice EST_DU_TYPE NOMBRE" code="1#NOMBRE#userChoice"/>
        <item algoitem="compteur EST_DU_TYPE NOMBRE" code="1#NOMBRE#compteur"/>
        <item algoitem="limite EST_DU_TYPE NOMBRE" code="1#NOMBRE#limite"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Inscrire un nombre entier : &quot;" code="4#Inscrire un nombre entier : #0"/>
        <item algoitem="LIRE userChoice" code="2#userChoice#pasliste"/>
        <item algoitem="limite PREND_LA_VALEUR userChoice+10" code="5#limite#userChoice+10#pasliste"/>
        <item algoitem="TANT_QUE (userChoice&lt;limite) FAIRE" code="15#userChoice&lt;limite">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="userChoice PREND_LA_VALEUR userChoice+1" code="5#userChoice#userChoice+1#pasliste"/>
            <item algoitem="AFFICHER userChoice" code="3#userChoice#1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
