<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/validate.css" type="text/css">
<script type="text/javascript">
	function registerValid(){
		
		return true;
	}
</script>
</head>
<body>
	<div class="container">
    <h1>회원가입</h1>
    <form action="VariousInputTypeServlet" method="POST">
        <p>아래 항목을 기입해 주세요. ( *은 필수 항목입니다.)</p>
        <hr/>
        <label for="userId"><b>아이디(*) :</b></label>
        <input type="text" name="userId" id="userId">

        <label for="pwd1"><b>비밀번호(*) :</b></label>
        <input type="password" name="pwd1" id="pwd1">

        <label for="pwd2"><b>비밀번호 확인(*) :</b></label>
        <input type="password" id="pwd2">

        <label for="email"><b>이메일(*) :</b></label>
        <input type="text" name="email" id="email">

        <label for="mobile"><b>휴대폰 번호(*) :</b></label>
        <input type="text" name="mobile" id="mobile">

        <fieldset>
            <legend>성별 (*)<span></span><span id="radio-result"></span></legend>            
        <div class="form-check">
            <input type="radio" class="form-check-input" id="female" name="gender" value="female" >
            <label class="form-check-label" for="female">여성</label>
        </div>
        <div class="form-check">
            <input type="radio" class="form-check-input" id="male" name="gender" value="male" >
            <label class="form-check-label" for="male">남성</label>
        </div>
        </fieldset>

        <fieldset>
            <legend>취미</legend>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="check1" name="hobby" value="study">
                <label class="form-check-label" for="check1">공부</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="check2" name="hobby" value="music">
                <label class="form-check-label" for="check2">음악감상</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="check3" name="hobby" value="travel">
                <label class="form-check-label" for="check3">여행</label>
            </div>
        </fieldset>

        <label for="job" class="form-label">직업 (*) (select one):</label>
        <!-- <select class="form-select" id="job" name="job" multiple> -->
        <select class="form-select" id="job" name="job">
            <option value="">--직업을 선택하세요--</option>
            <option value="student">학생</option>
            <option value="creator">크리에이터</option>
            <option value="landlord">건물주</option>
            <option value="official">공무원</option>
        </select>

        <div class="mb-3 mt-3">
            <label for="memo">메모:</label>
            <textarea class="form-control" rows="5" id="memo" name="memo"></textarea>
        </div>

        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="agree" name="agree" value="Y">
            <label class="form-check-label" for="agree">가입조항에 동의합니다 (*) </label>
            <div id="result-agree">
                <button type="submit" class="signupBtn" onclick="return registerValid();">가입하기</button>
                <button type="reset" class="cancelBtn">취소</button>
            </div>
        </div>
    </form>
    </div>
	
</body>
</html>