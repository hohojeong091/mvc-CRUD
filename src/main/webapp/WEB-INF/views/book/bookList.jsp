<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>전체 책 조회하기</title>
</head>
<body>
<h1> 책 전체 조회 </h1>
<table>
    <tr>
        <th> 책 번호</th>
        <th> 책 이름</th>
        <th> 저자명</th>
        <th> 출판사명</th>
        <th> 장르 번호</th>
        <th> 대여 가능 여부</th>
    </tr>
    <c:forEach items="${ selectAllBook }" var="book">
        <tr>
            <td> ${ book.bookId }</td>
            <td> ${ book.bookName }</td>
            <td> ${ book.autourName }</td>
            <td> ${ book.pubName }</td>
            <td> ${ book.catNum }</td>
            <td> ${ book.ability  }</td>
        </tr>

    </c:forEach>


</table>
</body>
</html>
