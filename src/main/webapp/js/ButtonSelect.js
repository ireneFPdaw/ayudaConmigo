'use strick'

function selectHide() {
	
	
	 // Bounce button
    $("#animatebutton").click(function(){
        const element =  document.querySelector('.animatebutton');
        element.classList.add('animated', 'rubberBand');
        
        setTimeout(function() {
          element.classList.remove('rubberBand'); 
  		},2000); 
  		
  		var element = document.getElementById("myDiv").value;
  		var elementButton = document.getElementById("animatebutton").value;
  		if(element == elementButton){
			 element.style.display = "none";
		}
       
  		
    });

	
}
   