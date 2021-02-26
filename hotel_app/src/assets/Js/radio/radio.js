$(document).ready(function(){
	$(".bankbox > div:first").show();
	$(".choosebank li").each(function(index){
		$(this).click(function(){
			addrssid = $(this).attr("id");
			id = addrssid.replace('ban','');
			if($("#bank"+id).attr("checked")) {
				$(".choosebank li").removeClass('cur');
				$("#ban"+id).addClass('cur');
				$(".bankbox > div:visible").hide();
				$(".bankbox > div:eq(" + index + ")").show();	
			}
		});
	});											
});