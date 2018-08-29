<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div >
    <table border="1" style="text-align: center">
       <tr >
       <td>订单编号</td>
       <td>商品名称</td>
       <td>供应商</td>
       <td>订单金额</td>
       <td>是否付款</td>
       <td>创建时间</td>
       </tr>
       <c:forEach items="${list}" var="jjj">
          <tr>
          <td>${jjj.code}</td>
          <td>${jjj.name}</td>
          <td>${jjj.supplier}</td>
          <td>${jjj.money}</td>
          <td>
           <c:if test="${jjj.isPayment == 1}">已付款</c:if>
           <c:if test="${jjj.isPayment == 2}">未付款</c:if>
           </td>
          <td>${jjj.time}</td>
          </tr>
       
       </c:forEach>
    
    </table>
    </div>
</body>
</html>