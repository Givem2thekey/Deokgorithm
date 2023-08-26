-- 코드를 입력하세요
SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d')
FROM USED_GOODS_BOARD b JOIN USED_GOODS_REPLY r
WHERE b.board_id = r.board_id AND b.created_date LIKE '%2022-10%'
ORDER BY r.created_date, b.title;