"# access-ia-data-microService" 

Accès à l'API
http://ec2-100-24-5-45.compute-1.amazonaws.com:8080

Toutes les méthodes GET

Pour essayer l'application : retourne un string défini par défaut
http://ec2-100-24-5-45.compute-1.amazonaws.com:8080/api/try

Pour accéder aux données Attendances


[api/days] => donne tous les attendances de la location selectionné et du jour indiqué
http://ec2-100-24-5-45.compute-1.amazonaws.com:8080/api/days/{idLocation}/{FormatDate}
Avec le FormatDate  => dd-MM-yyyy_HH:mm:ss
exemple: 20-06-2016_00:30:00 => Va donner une liste de résultat entre 20-06-2016_00:30:00 et 21-06-2016_00:30:00



[api/hours] => donne tous les attendances d'une heure selectionné pour une location choisi

http://ec2-100-24-5-45.compute-1.amazonaws.com:8080/api/hours/{idLocation}/{FormatDate}
Avec le FormatDate  => dd-MM-yyyy_HH:mm:ss
exemple: 20-06-2016_10:00:00 => Va donner une liste de résultat de tous les 10H enregistrés de la location



[api/daysAfter] =>

{id}/{strdate}


Données Attendances :
{

}
