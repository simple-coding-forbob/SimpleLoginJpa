<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Title</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 	부트스트랩 css  -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<!-- 	개발자 css -->
	<link rel="stylesheet" href="/css/style.css">

</head>
<body>
	<jsp:include page="/common/header.jsp" />
	<form class="page mt3" id="listForm" name="listForm">
		<div class="input-group mb3 mt3">
			<input type="text" 
			       class="form-control"
				   value="${param.searchKeyword}"
				placeholder="검색어입력">
			<button class="btn btn-primary" 
			        type="button"
			>
			  검색
			</button>
		</div>
		<!-- 카드 디자인: 반복문 -->
		   <div class="col3">
				<div class="card">
					<img src="#" class="card-img-top"
						alt="이미지">
					<div class="card-body">
						<h5 class="card-title">1</h5>
						<p class="card-text">2</p>
						<a href="#" class="btn btn-danger"
						>삭제</a>
					</div>
				</div>
		   </div>
		<!-- 여기: 페이지번호 -->
		<div class="flex-center clear">
			<ul class="pagination" id="pagination"></ul>
		</div>
	</form>
<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 부트스트랩 js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<jsp:include page="/common/footer.jsp" />

</body>
</html>