<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_TANT_QUE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai" nbDecimales="8" maxBoucle="500000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="userChoice EST_DU_TYPE NOMBRE" code="1#NOMBRE#userChoice"/>
        <item algoitem="finalCount EST_DU_TYPE NOMBRE" code="1#NOMBRE#finalCount"/>
        <item algoitem="count EST_DU_TYPE NOMBRE" code="1#NOMBRE#count"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Choisir un nombre de départ : &quot;" code="4#Choisir un nombre de départ : #0"/>
        <item algoitem="LIRE userChoice" code="2#userChoice#pasliste"/>
        <item algoitem="count PREND_LA_VALEUR 0" code="5#count#0#pasliste"/>
        <item algoitem="TANT_QUE (count&lt;10) FAIRE" code="15#count&lt;10">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="userChoice PREND_LA_VALEUR count+1" code="5#userChoice#count+1#pasliste"/>
            <item algoitem="AFFICHER &quot;Le compte est : &quot;" code="4#Le compte est : #0"/>
            <item algoitem="AFFICHER userChoice" code="3#userChoice#1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
