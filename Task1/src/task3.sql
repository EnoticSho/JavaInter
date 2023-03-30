Create TEMPORARY TABLE	IF NOT EXISTS temporar AS
Select f.title_film title, SUM(t.count_tickets) total_visitors, ROUND(AVG(t.count_tickets), 0) average_visitors_per_session, SUM(s.price_sessions) total_revenue
FROM film f
JOIN sessions s
	ON s.film_id_sessions = f.id_film
JOIN tickets t
	ON t.id_session_tickets = s.id_sessions
GROUP BY 1
ORDER BY 4 DESC;

SELECT title, total_visitors, average_visitors_per_session, total_revenue
FROM temporar
UNION
SELECT 'итого', SUM(total_visitors), ROUND(AVG(average_visitors_per_session), 2), SUM(total_revenue)
FROM temporar;