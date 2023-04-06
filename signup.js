 function validatesignup(){
  var s_id = document.getElementById("s_id").value;
  var fname = document.getElementById("first_name").value;
  var lname = document.getElementById("last_name").value; 
  var Gender = document.signupform.gender;
  var Mobileno = document.getElementById("Mobile_no").value;
  var Address = document.getElementById("adrs").value;
  var Course = document.getElementById("Course").value;
  var email = document.getElementById("email").value;
  var Password = document.getElementById("Password").value;
  
  if(s_id == ''){
				alert("please enter s_id");
				return false;
				}
  if(fname == '' || fname.length < 4 || fname.length > 20){
			alert('First name must be minimum 4 char and less than 20 chars long');
			document.getElementById("first_name").focus()
			return false;

            }
  if(lname == ''){
                alert("Please enter last name");
				document.getElementById("last_name").focus()
                return false;
            } 
  if(!document.querySelector('input[name="gender"]:checked')){
						alert('Please select gender');
						return false;
            }   
   if(Mobileno == ''){
				alert("please enter Mobile_no");
				return false;
				}
   if(Address == ''){
                alert("Please enter Address");
                return false;
            }	
   if(Course == ''){
                alert("Please choose Course");
                return false;
            }
   if(email == ''){
                alert("Please enter email");
                return false;
            }
   if(Password == ''){
                alert("Please enter Password");
                return false;
            }        		 
 }