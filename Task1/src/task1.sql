Select f1.title_film 'фильм 1', s1.starttime_sessions 'время начала', f1.duration_film 'длительность',
	f2.title_film 'фильм 1', s2.starttime_sessions 'время начала', f2.duration_film 'длительность'
FROM sessions s1
JOIN film f1
ON f1.id_film = s1.film_id_sessions
JOIN sessions s2
	ON s2.starttime_sessions < ADDTIME(s1.starttime_sessions, f1.duration_film) AND s2.starttime_sessions > s1.starttime_sessions
JOIN film f2
	ON f2.id_film = s2.film_id_sessions
ORDER BY 2;