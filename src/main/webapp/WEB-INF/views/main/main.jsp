<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>

<h1> 대출 희망 도서 상태 조회</h1>
<form action="${pageContext.servletContext.contextPath}/lib/select">
    <label> 조회할 도서 번호 (~6) : </label>
    <input type="text" name="rentBook" id="rentBook">
    <button> 검색하기 </button>
</form>

<hr>

<h1> 전체 책 조회 </h1>
<button onclick="location.href=`${pageContext.servletContext.contextPath}/book/list`">
    전체 책 조회하기
</button>

<hr>

<h1> 신규 도서 정보 추가 </h1>
<form action="${ pageContext.servletContext.contextPath}/book/insert" method="post">
    추가할 도서 정보를 입력해주세요 <br>
    책 번호 : <input type="text" name="bookId"><br>
    책 이름 : <input type="text" name="bookName"><br>
    저자명 : <input type="text" name="autourName"><br>
    출판사명 : <input type="text" name="pubName"><br>
    장르 번호 : <input type="text" name="catNum"><br>
    대여 가능 여부 :
    <select name="ability">
        <option value="Y">가능</option>
        <option value="N">불가능</option>
    </select>
    <br>
    <button> 신규 도서 등록하기 </button>
</form>

<hr>
<h1> 도서관 책 정보 수정 </h1>
<form action ="${pageContext.servletContext.contextPath}/book/update" method="post">
    책 번호 : <input type="text" name="bookId"/>
    변경할 책 제목 : <input type="text" name="bookName"/>
    변경할 저자명: <input type="text" name="autourName"/><br>
    <button> 도서 정보 변경 </button>
</form>

<hr>

<h1> 도서 정보 삭제 </h1>
<form action="${ pageContext.servletContext.contextPath}/book/delete" method="post">
    삭제할 책 번호 : <input type="text" name="bookId"/>
    <button type="submit"> 도서 정보 삭제</button>

</form>
</body>
</html>
