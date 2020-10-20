/* 페이지 로딩 후 실행 */
$(document).ready(function(){
	
	var category = $('#boardCategory').val();
	
	$(document).on('click', '#board1', function() {
		location.href = "writeForm.do?categoryNum="+category;
	});
	
	$(document).on('click', '#board2', function() {
		location.href = "writeForm.do?categoryNum="+category;
	});
	
	$(document).on('click', '#board3', function() {
		location.href = "writeForm.do?categoryNum="+category;
	});
	
});

/* 함수선언 영역*/
(function($){
	//aaa라는 함수선언
	//aaa = function(){
	
	//};
})(jQuery);