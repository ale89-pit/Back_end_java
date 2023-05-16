SELECT * FROM clienti;
SELECT * FROM fornitori;
SELECT * FROM fatture;
SELECT * FROM prodotti;

-- Estrarre il nome e il cognome dei clienti nati nel 1999
SELECT nome, cognome FROM clienti WHERE EXTRACT(YEAR FROM data_nascita) = 1999;

-- Estrarre il numero delle fatture con iva al 20%
SELECT COUNT(*) AS numero_fatture_20  FROM fatture WHERE iva = '20%';

-- Riportare il numero di fatture e la somma dei relativi importi divisi 
-- per anno di fatturazione
SELECT 
	EXTRACT(YEAR FROM data_fattura) AS anno, 
	COUNT(*) AS numero_fatture, 
	SUM(importo) AS importo  
		FROM fatture 
		GROUP BY EXTRACT(YEAR FROM data_fattura);

-- Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio
SELECT * FROM prodotti 
		WHERE EXTRACT(YEAR FROM data_attivazione) = 2017
		AND (in_produzione = true OR in_commercio = true);

-- Considerando soltanto le fatture con iva al 20 per cento, 
-- estrarre il numero di fatture per ogni anno
SELECT EXTRACT(YEAR FROM data_fattura) AS anno, COUNT(*) AS numero_fatture_20 
	FROM fatture 
	WHERE iva = '20%' 
	GROUP BY EXTRACT(YEAR FROM data_fattura);

-- Estrarre gli anni in cui sono state registrate più o uguale a 2 fatture con tipologia ‘A’
SELECT EXTRACT(YEAR FROM data_fattura) AS anno, COUNT(*) AS numero_fatture_A 
		FROM fatture 
		WHERE tipologia = 'A' 
		GROUP BY EXTRACT(YEAR FROM data_fattura)
		HAVING COUNT(*) > 1;
		
-- Riportare l’elenco delle fatture (numero, importo, iva e data) 
-- con in aggiunta il nome del fornitore
SELECT numero_fattura, importo, iva, data_fattura, denominazione
	FROM fatture AS fa INNER JOIN fornitori AS fo ON fa.numero_fornitore = fo.numero_fornitore;

-- Estrarre il totale degli importi delle fatture divisi per residenza dei clienti
SELECT clienti.regione_residenza, COUNT(*), SUM(fatture.importo) FROM fatture 
	INNER JOIN clienti ON fatture.id_cliente = clienti.numero_cliente
	GROUP BY clienti.regione_residenza;

-- Estrarre il numero dei clienti nati nel 1980 che hanno almeno una fattura superiore a 50 euro
SELECT * FROM clienti INNER JOIN fatture ON fatture.id_cliente = clienti.numero_cliente 
WHERE EXTRACT(YEAR FROM data_nascita) = 1999 AND fatture.importo > 50;

-- Estrarre una colonna di nome “Denominazione” contenente il nome, seguito da un carattere “-“, 
-- seguito dal cognome, per i soli clienti residenti nella regione Lombardia
SELECT CONCAT(nome, ' - ', cognome) AS denominazione FROM clienti WHERE regione_residenza = 'Lombardia';