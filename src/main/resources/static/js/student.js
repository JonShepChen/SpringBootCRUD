$(document).ready(function() {
	
	var updatePage = function(resp) {
		$('#target').html(JSON.stringify(resp[0]));
	};
	
	var printError = function(req, status, err) {
		console.log('this sucks', status, err);
	};
	
	var testPayload = JSON.stringify({
			grade:8,
			firstName:"Jonathan",
			lastName:"Chen"
	});
	
	console.log(jQuery.isPlainObject(testPayload));

	$.ajax({
		type: "POST",
		url: "http://localhost:8080/student",
		data: testPayload,
		dataType: "json",
		contentType: "application/json",
		success: function(resp, status, err) {
			console.log(status);
		},
		error: printError
		
	});
	
	$.ajax({
		url:"http://localhost:8080/student",
		dataType: 'json',
		success: updatePage,
		error: printError
	})
	
	
});