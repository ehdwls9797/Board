/* 페이지 로딩 후 실행 */
$(document).ready(function(){
	
	$(document).on('click', '#deleteBtn', function() {
		var boardNum = $('#btnD1').val();
		var categoryNum = $('#btnD2').val();
		
		location.href = "delete.do?categoryNum="+ categoryNum+"&boardNum="+boardNum;
		
	});
	
	$(document).on('click', '#updateBtn', function() {
		var boardNum = $('#btnD1').val();
		var categoryNum = $('#btnD2').val();
		
		location.href = "updateForm.do?categoryNum="+ categoryNum+"&boardNum="+boardNum;
		
	});
	
});

/* 함수선언 영역*/
(function($){
	//aaa라는 함수선언
	//aaa = function(){
	
	//};
})(jQuery);