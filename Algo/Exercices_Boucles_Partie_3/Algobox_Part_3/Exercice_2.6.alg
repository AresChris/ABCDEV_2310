<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;Ce nombre n'est pas premier !&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2defaut="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombreN" algoitem="nombreN EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#compteur" algoitem="compteur EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Inscrire un nombre entier#0" algoitem="AFFICHER &quot;Inscrire un nombre entier&quot;"/>
        <item code="2#nombreN#pasliste" algoitem="LIRE nombreN"/>
        <item code="5#compteur#0#pasliste" algoitem="compteur PREND_LA_VALEUR 0"/>
        <item code="12#i#1#nombreN" algoitem="POUR i ALLANT_DE 1 A nombreN">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#nombreN % i == 0" algoitem="SI (nombreN % i == 0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#compteur#compteur + 1#pasliste" algoitem="compteur PREND_LA_VALEUR compteur + 1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="6#compteur % i == 2" algoitem="SI (compteur % i == 2) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Ce nombre est premier !#0" algoitem="AFFICHER &quot;Ce nombre est premier !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#Ce nombre n'est pas premier !#0" algoitem="AFFICHER &quot;Ce nombre n'est pas premier !&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
