<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (reponseUser == realAnswer) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2lignes="" F2defaut="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" epaisseurPoint="2" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#reponseUser" algoitem="reponseUser EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#realAnswer" algoitem="realAnswer EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Inscrire un nombre compris entre 1 et 3 :#0" algoitem="AFFICHER &quot;Inscrire un nombre compris entre 1 et 3 :&quot;"/>
        <item code="2#reponseUser#pasliste" algoitem="LIRE reponseUser"/>
        <item code="5#realAnswer#2.7#pasliste" algoitem="realAnswer PREND_LA_VALEUR 2.7"/>
        <item code="15#reponseUser != realAnswer" algoitem="TANT_QUE (reponseUser != realAnswer) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Nouvel essai : #0" algoitem="AFFICHER &quot;Nouvel essai : &quot;"/>
            <item code="2#reponseUser#pasliste" algoitem="LIRE reponseUser"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="6#reponseUser == realAnswer" algoitem="SI (reponseUser == realAnswer) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Bonne réponse !#0" algoitem="AFFICHER &quot;Bonne réponse !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
