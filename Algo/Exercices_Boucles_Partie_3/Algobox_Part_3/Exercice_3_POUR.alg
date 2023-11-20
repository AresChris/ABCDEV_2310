<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="POUR count ALLANT_DE 0 A 9"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" nbDecimales="8" totalBoucles="5000000" totalAffichages="1000" maxBoucle="500000" epaisseurPoint="2" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="userChoice EST_DU_TYPE NOMBRE" code="1#NOMBRE#userChoice"/>
        <item algoitem="finalCount EST_DU_TYPE NOMBRE" code="1#NOMBRE#finalCount"/>
        <item algoitem="count EST_DU_TYPE NOMBRE" code="1#NOMBRE#count"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Choisir un nombre de départ : &quot;" code="4#Choisir un nombre de départ : #0"/>
        <item algoitem="LIRE userChoice" code="2#userChoice#pasliste"/>
        <item algoitem="count PREND_LA_VALEUR userChoice" code="5#count#userChoice#pasliste"/>
        <item algoitem="POUR count ALLANT_DE 0 A 9" code="12#count#0#9">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="userChoice PREND_LA_VALEUR userChoice+1" code="5#userChoice#userChoice+1#pasliste"/>
            <item algoitem="AFFICHER &quot;Nombre : &quot;" code="4#Nombre : #0"/>
            <item algoitem="AFFICHER userChoice" code="3#userChoice#1#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
