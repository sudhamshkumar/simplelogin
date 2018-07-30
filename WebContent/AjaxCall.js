function validuserid()
{
	var uid = document.getElementById("na").value;
	alert(uid);
	var xml= new XMLHttpRequest();
	xml.onreadystagechange= function validuserid(){
		if(this.status ==200 && this.readystate==4)
			alert((this.responseText));
	}
	xml.open("Post","AjaxServlet?uid="+uid,true);
	xml.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xml.send();
}
