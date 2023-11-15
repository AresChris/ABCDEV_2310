<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (a==0 OU b==0 ET b==0 OU a==0) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#b" algoitem="b EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Inscrire a : #0" algoitem="AFFICHER &quot;Inscrire a : &quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="4#Inscrire b : #0" algoitem="AFFICHER &quot;Inscrire b : &quot;"/>
        <item code="2#b#pasliste" algoitem="LIRE b"/>
        <item code="6#a>0 ET b>0" algoitem="SI (a>0 ET b>0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Le produit des deux nombres est positif#0" algoitem="AFFICHER &quot;Le produit des deux nombres est positif&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#a&lt;0 ET b>0 OU a>0 ET b&lt;0" algoitem="SI (a&lt;0 ET b>0 OU a>0 ET b&lt;0) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Le produit de ces deux sommes est négatif#0" algoitem="AFFICHER &quot;Le produit de ces deux sommes est négatif&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#a==0 OU b==0 ET b==0 OU a==0" algoitem="SI (a==0 OU b==0 ET b==0 OU a==0) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#Le produit des deux est nul#0" algoitem="AFFICHER &quot;Le produit des deux est nul&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
