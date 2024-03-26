SELECT GenreID, GenreName FROM 
Genres WHERE 
GenreID NOT IN (SELECT DISTINCT GenreID FROM Movies)

SELECT StudentID FROM Attendance
WHERE COUNT(IsPresent = True)






