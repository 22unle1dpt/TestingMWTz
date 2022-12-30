Um das Programm ausführen zu können sind zunächst einige Schritte zu unternehmen:
(Es wird angenommen, dass Docker Desktop läuft und dass das Image von Postgre SQL bereits lokal existiert.)

Benötigte Docker Kommandos:
1. docker run -e POSTGRES_PASSWORD=Welcome4$ -p 5432:5432 -d postgres
2. docker exec -it <NAME DES CONTAINERS> bash 
    Den Namen des Containers kann man mit: "docker container ps" herausfinden
3. psql -h localhost -U postgres
4. \l
    => Zeigt an die existierenden Datenbanken an
5. \c postgres
    => Mit Datenbank "postgres" verbinden
6. \dt 
    => zeigt an, dass keine Tabellen existieren
7. Nun starten wir die Java Anwendung
8. \dt zeigt nun die erstellten Datenbanktabellen
9. Nun können die im Ordner "Postman Collection" enhaltenen Requests ausgeführt werden.
    => Grundlegende CRUD-Funktionen sind enthalten für die Verwaltung der Tagebücher. Die Tagebucheinträge folgen noch.

