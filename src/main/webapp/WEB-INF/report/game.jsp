<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id='gameBean' class='yatospace_ip.game.manja_veca.bean.GameBean' scope='session'></jsp:useBean>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<c:set var='cnum' value='${gameBean.number}'></c:set>

<ul style='list-style-type: decimal'>
	<c:forEach var='hnum' items='${gameBean.trybox()}'>
		<li>
			<c:if test="${hnum eq cnum}"><div>Број <c:out value="${hnum}"></c:out>: погодак</div></c:if>
			<c:if test="${hnum lt cnum}"><div>Број <c:out value="${hnum}"></c:out>: већи број</div></c:if>	
			<c:if test="${hnum gt cnum}"><div>Број <c:out value="${hnum}"></c:out>: мањи број</div></c:if>	
		</li>
	</c:forEach>
</ul>
<c:if test="${gameBean.end()}"><blockquote>Тражени број је : <c:out value="${gameBean.number}"></c:out></blockquote><br></c:if>
