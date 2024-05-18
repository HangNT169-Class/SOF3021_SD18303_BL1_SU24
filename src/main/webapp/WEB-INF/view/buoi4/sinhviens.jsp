<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/sinh-vien/view-add">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${a}" var="sv">
        <tr>
            <td>1</td>
            <td>${sv.mssv}</td>
            <td>${sv.ten}</td>
            <td>${sv.diaChi}</td>
            <td>${sv.gioiTinh}</td>
            <td>${sv.tuoi}</td>
            <td>
                <%-- J4: ? => controller : @RequestParam           --%>
<%--                <a href="/sinh-vien/remove?a=${sv.mssv}">Delete</a>--%>
                <%--   J5: /gia tri can lay tren duong dan => controller: @Pathvariable     --%>
                <a href="/sinh-vien/remove/${sv.mssv}">Delete</a>
                <a href="/sinh-vien/view-update/${sv.mssv}">Update</a>
                <a href="/sinh-vien/detail/${sv.mssv}">Detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
