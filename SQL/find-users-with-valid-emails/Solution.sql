SELECT user_id, name, mail
FROM Users
WHERE Mail REGEXP "^[A-Za-z][A-Za-z0-9_\.\-]*@leetcode(\\?com)?\\.com$"