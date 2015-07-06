--SELECT * FROM Pregunta

BEGIN;
INSERT INTO pregunta (id_pregunta, pregunta) VALUES (1,'Indique la intensidad del dolor');
INSERT INTO pregunta (id_pregunta, pregunta) VALUES (2, 'Indique la ubicacion del dolor');
INSERT INTO pregunta (id_pregunta, pregunta) VALUES (3, 'Que medicamento se encuentra tomando?');
INSERT INTO pregunta (id_pregunta, pregunta) VALUES (4, 'Patrones de sueño');
INSERT INTO pregunta (id_pregunta, pregunta) VALUES (5, 'Que alimento ha consumido en la ultima hora');
--SELECT * FROM Respuesta
/*Intensidad del dolor*/
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (1, 1, 'Muy bajo');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (2, 1, 'Bajo');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (3, 1, 'Medio');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (4, 1, 'Alto');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (5, 1, 'Muy alto');
/*Ubicacion del dolor*/
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (6, 2, 'Parietal derecho');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (7, 2, 'Parietal izquierdo');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (8, 2, 'Zona frontal');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (9, 2, 'Zona anterior');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (10, 2, 'Zona superior');
/*Medicamento utilizado*/
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (11, 3, 'Medicamento1');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (12, 3, 'Medicamento2');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (13, 3, 'Medicamento3');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (14, 3, 'Medicamento4');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (15, 3, 'Medicamento5');
/*PATRONES DE SUEÑO*/
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (16, 4, '0 horas');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (17, 4, '2 horas');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (18, 4, '4 horas');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (19, 4, '6 horas');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (20, 4, '8 horas');
/*Alimentos consumidos*/
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (21, 5, 'Tinto');
INSERT INTO Respuesta (id_respuesta, id_pregunta, respuesta) VALUES (22, 5, 'Gaseosa');
COMMIT;