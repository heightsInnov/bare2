/*ORACLE SQL QUERY USED*/
SELECT *
	FROM T1 T
 WHERE NOT EXISTS (SELECT 1
					FROM T2 S
				 WHERE S.ID = T.ID
					 AND S.NAME = T.NAME
					 AND S.AGE = T.AGE)