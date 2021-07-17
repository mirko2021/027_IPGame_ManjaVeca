<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page import="yatospace_ip.game.manja_veca.util.BeanGenerator"%>
<%@page import="yatospace_ip.game.manja_veca.bean.BootstrapBean"%>

<%
	BootstrapBean themeBean = BeanGenerator.bootstrapBean(request.getSession()); 
	String themeParameter = request.getParameter("theme"); 
	if(themeParameter!=null){
		if(themeParameter.contentEquals("LUX")) themeBean.setBootstrapLuxTemplate(); 
		else themeBean.setNoThemeTemplate(); 
	}
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Мања Већа - Bootstrap</title>
		<script>
			function select_lux_bootstrap(){
				var form = document.getElementById('theme_form');
				var data = document.getElementById('theme_id');
				data.value = 'LUX'; 
				form.submit();
			}
			function select_non_theme(){
				var form = document.getElementById('theme_form');
				var data = document.getElementById('theme_id');
				data.value = ''; 
				form.submit();
			}
		</script>
		<jsp:include page="/WEB-INF/theme/theme-switch.jsp"></jsp:include>
	</head>
	<body>
		<div id='theme_form_div' class='theme_div'>
			<dl>
				<dt>Теме веб сајта</dt>
				<dd><br></dd>
				<dd><a href='javascript:select_non_theme()'    >Без теме  - стандардно</a></dd>
				<dd><a href='javascript:select_lux_bootstrap()'>Bootstrap - LUX</a></dd>
			</dl>
			<form name='theme_form' id='theme_form' method='POST'>
				<input type='hidden' name='theme' id='theme_id' value=''/>
			</form>
			<div>
				Тренутна тема је : <br><blockquote>
				<% 
					if(themeBean.isBootstrapLuxTemplate()) out.println("Bootstrap - LUX".toUpperCase());
					else out.println("Без теме  - стандардно".toUpperCase());
				%>
				</blockquote>
			</div>
		</div>
	</body>
</html>