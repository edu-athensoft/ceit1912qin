function listNews(){
    $.ajax({
        type    :   "get",
        url     :	"/ceit1912qin/test/news",
//        data	:	"jsonObjString="+param,
        dataType:   "json",
        timeout :   30000,
        
        success:function(data){
        	//alert("INFO: ok!");
        	//var news = JSON.parse(data);
        	//alert(data);
        	console.log(data);
        	var news = data;
        	console.log(news.globalId);
        	console.log(news.eventUUID);
        	console.log(news.title);
        	
        	var result = news.globalId+","+news.eventUUID+","+news.title;
        	$("#news_data").html(result);
        },
        error:function(XMLHttpRequest, textStatus){
        	
        	if (XMLHttpRequest.readyState==4 && XMLHttpRequest.status == "200") {
        		alert("INFO: ok!");
        		location.href="/ceit1912qin/test/testjson";
        	}else{
        		alert("ERROR: failed!"); 
        	}
        },            
        complete: function(XMLHttpRequest, textStatus){
            //reset to avoid duplication
        }        
    });
}

