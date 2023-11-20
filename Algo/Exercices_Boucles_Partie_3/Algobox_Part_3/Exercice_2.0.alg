<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="LIRE userAnswer"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#userAnswer" algoitem="userAnswer EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#realAnswer" algoitem="realAnswer EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Inscrire un nombre compris entre 10 et 20 :#0" algoitem="AFFICHER &quot;Inscrire un nombre compris entre 10 et 20 :&quot;"/>
        <item code="2#userAnswer#pasliste" algoitem="LIRE userAnswer"/>
        <item code="5#realAnswer#17.50#pasliste" algoitem="realAnswer PREND_LA_VALEUR 17.50"/>
        <item code="15#userAnswer!=realAnswer" algoitem="TANT_QUE (userAnswer!=realAnswer) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Nouvel essai : #0" algoitem="AFFICHER &quot;Nouvel essai : &quot;"/>
            <item code="2#userAnswer#pasliste" algoitem="LIRE userAnswer"/>
            <item code="6#userAnswer>20" algoitem="SI (userAnswer>20) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#Plus petit !#0" algoitem="AFFICHER &quot;Plus petit !&quot;"/>
                <item code="2#userAnswer#pasliste" algoitem="LIRE userAnswer"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#userAnswer&lt;10" algoitem="SI (userAnswer&lt;10) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="4#Plus grand !#0" algoitem="AFFICHER &quot;Plus grand !&quot;"/>
                        <item code="2#userAnswer#pasliste" algoitem="LIRE userAnswer"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                        <item code="9#sinon" algoitem="SINON">
                            <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                            <item code="6#userAnswer==realAnswer" algoitem="SI (userAnswer==realAnswer) ALORS">
                                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                <item code="4#Bonne réponse !#0" algoitem="AFFICHER &quot;Bonne réponse !&quot;"/>
                                <item code="8#finsi" algoitem="FIN_SI"/>
                            </item>
                            <item code="11#finsinon" algoitem="FIN_SINON"/>
                        </item>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
