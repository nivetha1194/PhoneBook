
function validateform(){  
var firstname=document.myform.firstname.value;  
var home_phone=document.myform.home_phone.value;

if (firstname==null || firstname==""){  
  alert("Name can't be blank");  
  return false;  
}
else if(firstname=="A -Z" || firstname=="a-z" || firstname=="1-9" ){
	alert("Fistname should have characters from A to Z and 1 to 9");
	}
else if(firstname.length>9){
	alert("Name should have less than 9 characters");
	}

else if(home_phone==null||home_phone=="")
	{
	alert("Home number cannot be left blank");
	}
else if(home_phone=="0-9" && home_phone!="a-z")
	{
	alert("Can contain only numbers");
	}
else if(home.phone.length<10)
	{
	alert("Can contain only 10 digits");
	}
}  
