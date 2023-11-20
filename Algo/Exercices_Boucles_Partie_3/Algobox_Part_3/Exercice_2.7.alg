<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="TANT_QUE (saisieUser>=0.01 ET saisieUser&lt;=1000000) FAIRE"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" nbDecimales="8" totalAffichages="1000" maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#miles" algoitem="miles EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#saisieUser" algoitem="saisieUser EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#leave" algoitem="leave EST_DU_TYPE CHAINE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir un nombre de kms entre 0.01 et 1000000#0" algoitem="AFFICHER &quot;Saisir un nombre de kms entre 0.01 et 1000000&quot;"/>
        <item code="2#saisieUser#pasliste" algoitem="LIRE saisieUser"/>
        <item code="5#miles#saisieUser/1.609#pasliste" algoitem="miles PREND_LA_VALEUR saisieUser/1.609"/>
        <item code="3#saisieUser#0#pasliste" algoitem="AFFICHER saisieUser"/>
        <item code="4# kms est équivalent à #0" algoitem="AFFICHER &quot; kms est équivalent à &quot;"/>
        <item code="3#miles#1#pasliste" algoitem="AFFICHER miles"/>
        <item code="4#Quitter/Continuer ? (Q/C)#1" algoitem="AFFICHER &quot;Quitter/Continuer ? (Q/C)&quot;"/>
        <item code="2#leave#pasliste" algoitem="LIRE leave"/>
        <item code="6#leave == &quot;Q&quot;" algoitem="SI (leave == &quot;Q&quot;) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Au revoir !#0" algoitem="AFFICHER &quot;Au revoir !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="15#saisieUser>=0.01 ET saisieUser&lt;=1000000" algoitem="TANT_QUE (saisieUser>=0.01 ET saisieUser&lt;=1000000) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="3#saisieUser#0#pasliste" algoitem="AFFICHER saisieUser"/>
            <item code="4# kms est équivalent à #0" algoitem="AFFICHER &quot; kms est équivalent à &quot;"/>
            <item code="3#miles#0#pasliste" algoitem="AFFICHER miles"/>
            <item code="4#Quitter ?#0" algoitem="AFFICHER &quot;Quitter ?&quot;"/>
            <item code="2#leave#pasliste" algoitem="LIRE leave"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="6#saisieUser&lt;0.01 OU saisieUser>1000000" algoitem="SI (saisieUser&lt;0.01 OU saisieUser>1000000) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Saisissez un nombre entre 0.01 et 1 000 000#0" algoitem="AFFICHER &quot;Saisissez un nombre entre 0.01 et 1 000 000&quot;"/>
            <item code="2#saisieUser#pasliste" algoitem="LIRE saisieUser"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
