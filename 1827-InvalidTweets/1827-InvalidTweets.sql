-- Last updated: 21/07/2026, 23:11:16
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;