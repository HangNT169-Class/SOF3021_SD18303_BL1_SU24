<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Product ID </th>
        <th>Category code </th>
        <th>Category name </th>
        <th>Gia </th>
        <th>Product code </th>
        <th>Product name </th>
        <th>action</th>
    </tr>
    <tbody>
        <c:forEach items="${lists}" var="x">
            <tr>
                <td>${x.id}</td>
                <td>${x.category1.categoryCode1}</td>
                <td>${x.category1.catecoryName}</td>
                <td>${x.price}</td>
                <td>${x.productCode}</td>
                <td>${x.productName}</td>
                <td></td>

            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>