
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>도서관 책 정보</title>

</head>
<body>
<h1> ${ param.bookId }번 책의 정보 </h1>
<h4> 책이름 : ${ selectOneBook.bookName }</h4>
<h4> 저자명  : ${ selectOneBook.autourName }</h4>
<h4> 출판사명 : ${ selectOneBook.pubName }</h4>
<h4> 대여 가능 여부 : ${ selectOneBook.ability }</h4>


</body>
</html>
