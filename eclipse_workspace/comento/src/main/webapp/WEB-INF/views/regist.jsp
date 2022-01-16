<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
</head>
<form method = "post">
<body>
<p><Label>제목</Label><input type="text" name = "title"></p>

<p><Lable>작성자</Lable><input type = "text" name="wirter" size="15"></p>
<label>내용</label><p>
<textarea rows="15" cols="65" name="content"></textarea><p>

<button type = "submit"> 등록 </button>
</form>
</body>
</html>