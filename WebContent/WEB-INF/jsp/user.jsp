<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>password</td>
        <td>shijian </td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.uid}</td>
            <td>${c.username}</td>
            <td>${c.password}</td>
            <td>${c.time}</td>
               
        </tr>
    </c:forEach>
</table>