SELECT * FROM quiz.quiz_table;
SELECT * from quiz.quiz_table where Sporgsmaal = ?;
insert into quiz.quiz_table (Sporgsmaal, Svar1, Svar2, Svar3, Svar4) values (?,?,?,?,?);
update quiz.quiz_table SET Sporgsmaal = ?, Svar1 = ?, Svar2 = ?, Svar3 = ?, Svar4 = ? where Sporgsmaal = ?;
delete from quiz.quiz_table where Sporgsmaal = ?;
