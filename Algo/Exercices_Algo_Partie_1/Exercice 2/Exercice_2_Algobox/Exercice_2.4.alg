<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (anneeA%4==0 ET anneeA%100!=0 OU anneeA%400==0) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#anneeA" algoitem="anneeA EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Quelle année ? #0" algoitem="AFFICHER &quot;Quelle année ? &quot;"/>
        <item code="2#anneeA#pasliste" algoitem="LIRE anneeA"/>
        <item code="6#anneeA%4==0 ET anneeA%100!=0 OU anneeA%400==0" algoitem="SI (anneeA%4==0 ET anneeA%100!=0 OU anneeA%400==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#L'année est bissextile !#0" algoitem="AFFICHER &quot;L'année est bissextile !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#L'année n'est pas bissextile#0" algoitem="AFFICHER &quot;L'année n'est pas bissextile&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
