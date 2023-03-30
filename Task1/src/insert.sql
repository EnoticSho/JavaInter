CREATE TABLE `lesson4`.`film` (
  `id_film` INT NOT NULL AUTO_INCREMENT,
  `title_film` VARCHAR(45) NOT NULL,
  `duration_film` TIME NOT NULL,
  PRIMARY KEY (`id_film`));

Insert INTO `lesson4`.film(title_film, duration_film) VALUES('film1', '01:30:00'),
  ('film2', '02:00:00'),
  ('film3', '01:00:00'),
  ('film4', '02:00:00'),
  ('film5', '01:30:00');

CREATE TABLE `lesson4`.`sessions` (
  `id_sessions` INT NOT NULL AUTO_INCREMENT,
  `film_id_sessions` INT NOT NULL,
  `starttime_sessions` DATETIME NOT NULL,
  `price_sessions` INT NOT NULL,
  PRIMARY KEY (`id_sessions`),
  INDEX `fk_sessions_film_idx` (`film_id_sessions` ASC) VISIBLE,
  CONSTRAINT `fk_sessions_film`
    FOREIGN KEY (`film_id_sessions`)
    REFERENCES `lesson4`.`film` (`id_film`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `lesson4`.`tickets` (
  `id_tickets` INT NOT NULL AUTO_INCREMENT,
  `count_tickets` INT NOT NULL,
  `id_session_tickets` INT NOT NULL,
  PRIMARY KEY (`id_tickets`),
  INDEX `fk_tickets_session_idx` (`id_session_tickets` ASC) VISIBLE,
  CONSTRAINT `fk_tickets_session`
    FOREIGN KEY (`id_session_tickets`)
    REFERENCES `lesson4`.`sessions` (`id_sessions`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

Insert INTO sessions(film_id_sessions, starttime_sessions, price_sessions) VALUES(1, '2023-03-29 09:00:00', 90),
(2, '2023-03-29 11:00:00', 290),
(3, '2023-03-29 13:00:00', 490),
(4, '2023-03-29 13:30:00', 5190),
(5, '2023-03-29 15:00:00', 590),
(1, '2023-03-29 18:00:00', 1690),
(2, '2023-03-29 20:00:00', 2960),
(3, '2023-03-29 20:30:00', 4690),
(4, '2023-03-29 22:30:00', 5190),
(5, '2023-03-29 23:30:00', 5490);

Insert INTO tickets(count_tickets, id_session_tickets) VALUES(12, 1),
(22, 2),
(33, 3),
(45, 4),
(561, 5),
(66, 6),
(72, 7),
(86, 8),
(93, 9),
(106, 10);



