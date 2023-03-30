SELECT
    CASE
        WHEN s.starttime_sessions BETWEEN '2023-03-29 09:00:00' AND '2023-03-29 15:00:00' THEN 'с 9 до 15'
        WHEN s.starttime_sessions BETWEEN '2023-03-29 15:00:01' AND '2023-03-29 18:00:00' THEN 'с 15 до 18'
        WHEN s.starttime_sessions BETWEEN '2023-03-29 18:00:01' AND '2023-03-29 21:00:00' THEN 'с 18 до 21'
        WHEN s.starttime_sessions BETWEEN '2023-03-29 21:00:01' AND '2023-03-30 00:00:00' THEN 'с 21 до 00'
        ELSE 'неизвестный интервал'
        END intervala,
  SUM(t.count_tickets) visitors,
  SUM(s.price_sessions) revenue
FROM sessions s
JOIN tickets t
    ON s.id_sessions = t.id_session_tickets
GROUP BY intervala;