<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (c > b > a) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" epaisseurPoint="2" arrondiAuto="vrai" totalAffichages="1000" totalBoucles="5000000" epaisseurLigne="2" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#b" algoitem="b EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Inscrire a#0" algoitem="AFFICHER &quot;Inscrire a&quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="4#b#0" algoitem="AFFICHER &quot;b&quot;"/>
        <item code="2#b#pasliste" algoitem="LIRE b"/>
        <item code="4#c#0" algoitem="AFFICHER &quot;c&quot;"/>
        <item code="2#c#pasliste" algoitem="LIRE c"/>
        <item code="6#a > b > c" algoitem="SI (a > b > c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#a = #0" algoitem="AFFICHER &quot;a = &quot;"/>
            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
            <item code="4#b = #0" algoitem="AFFICHER &quot;b = &quot;"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="4#c#0" algoitem="AFFICHER &quot;c&quot;"/>
            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#b > c > a" algoitem="SI (b > c > a) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#b= #0" algoitem="AFFICHER &quot;b= &quot;"/>
                    <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
                    <item code="4#c = #0" algoitem="AFFICHER &quot;c = &quot;"/>
                    <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
                    <item code="4#a = #0" algoitem="AFFICHER &quot;a = &quot;"/>
                    <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#c > b > a" algoitem="SI (c > b > a) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#c = #0" algoitem="AFFICHER &quot;c = &quot;"/>
                            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
                            <item code="4#b = #1" algoitem="AFFICHER &quot;b = &quot;"/>
                            <item code="4#b#1" algoitem="AFFICHER &quot;b&quot;"/>
                            <item code="4#a = #0" algoitem="AFFICHER &quot;a = &quot;"/>
                            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                        </item>
                        <item code="6#c > a > b" algoitem="SI (c > a > b) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#c = #0" algoitem="AFFICHER &quot;c = &quot;"/>
                            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
                            <item code="4#a = #0" algoitem="AFFICHER &quot;a = &quot;"/>
                            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
                            <item code="4#b = #0" algoitem="AFFICHER &quot;b = &quot;"/>
                            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                        </item>
                        <item code="4#c = #0" algoitem="AFFICHER &quot;c = &quot;"/>
                        <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
                        <item code="4#b = #0" algoitem="AFFICHER &quot;b = &quot;"/>
                        <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
                        <item code="4#a = #0" algoitem="AFFICHER &quot;a = &quot;"/>
                        <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
