<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link href="/css/main_white.css" rel="stylesheet" type="text/css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="nav_bar">
		<a href="/"><img src="/images/main/logo_web.png" alt="logoimg"></a>
		<nav>
			<ul class="nav_menu">
				<li><a href="/view_sh/kCar">국내</a></li>
				<li><a href="/view_sh/fCar">해외</a></li>
				<li><a href="/view_sh/ecoCar">친환경</a></li>
				<li><a href="/view_sh/sellMyCar">내차팔기</a></li>
				<li><a href="/view_jw/cs">고객지원</a></li>
			</ul>
		</nav>
		<div class="nav_user">
			<a class="nav_menu_login" href="/view_mh/join">회원가입</a>
			<button class="nav_but_login">
				<a href="/view_jm/login">로그인</a>
			</button>
		</div>
	</div>
</body>
</html>