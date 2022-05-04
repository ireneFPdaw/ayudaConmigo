
'use strick'

	//-----Al mandar datos onsubmit del formulario
	function validationAlertForm () {
	
	    var date = verifyDate();
	    console.log(date);
	    var place = verifyPlace();          //Recordar que la primera debe ser en mayuscula
	    console.log(place);
	    var allergen = verifyAllergen();    //Recordar que la primera debe ser en mayuscula
	    var annotation = verifyAnnotation();//Recordar que la primera debe ser en mayuscula
	    var product = verifyProduct();
	
	    if (date && place && allergen && annotation && product) {
	        return true;
	
	    }else{
	        return false;
	    }
	}

	//------Limpiamos el formulario
	$("#cancel").click(function(){
	    $('input[type="date"]').val('');
	    $('input[type="text"]').val('');
	    $('input[type="radio"]').val('');
	});


	//---------VALIDACIONES 1º PREGUNTAS
	function verifyDate() {         
		   
			  var date = $('#dateInput').val();
			  var smsDate = $("#smsDate");  
			  var dateNow = new Date();
			  
			  if(date == ""){
				
				smsDate.html("No puede estar vacia.");
				return false;
				
				}else if (date < dateNow ){
					
					smsDate.html("El comienzo debe ser a partir del día de hoy");
					return false;
					
				}else{
					smsDate.hide();
					return true;
				}
	}

	function verifyPlace() {
	   
	   	//Validar el tamaño segun la BD
	        var place = $('#placeInput').val();
	        console.log(place);
	        var mensaje = $('#smsPlace');
	        var ex1 = /[a-zA-Z0-9\s\p{P}]+\.?(( |\-)[a-zA-Z1-9s\p{P}]+\.?)/;
	
	        if (place != "") {
	            if (ex1.test(place)) {
	                mensaje.hide();
	                return true;
	            } else {
	                mensaje.html("Error.Intentelo de nuevo.");
	                return false;
	            }
	        } else {
	            mensaje.html("No puede estar vacia.");
	        }
	}

	function verifyAllergen() {
		
			//Validar tamaño segun la BD
		   var aller = $('#allergenInput').val();
		   console.log(aller);
	       var mensaje = $('#smsAllergen');
	       var ex1 = /^[A-Za-z]+$/;
	
	     
	            if (ex1.test(aller) || aller == "") {
	                mensaje.hide();
	                return true;
	                
	            } else {
	                mensaje.html("Error.Intenteló de nuevo.");
	                return false;
	            }
	       
	}

	function verifyAnnotation() {
				//Validar tamaño sgun la BD
			    var annotation = $('#annotationInput').val();
			    console.log(annotation);
		        var mensaje = $('#smsAnotation');
	
	      
	            if ( annotation != "") {
		 			mensaje.html("Error.Intenteló de nuevo.");
	                return false;
	                
	            } else {
	               mensaje.hide();
	                return true;
	            }       
	
  }

	function verifyProduct() {
		//Validar tamaño segun BD
		
	 	var mensaje = $('#smsProduct'); 
		var proce= document.getElementsByName('producto');
	
		
	    for(i=0; i<proce.length; i++){
	        if(proce[i].checked){
	            //var processor=proce[i].checked;
	            mensaje.hide();
	            return true;
	        }else{
				mensaje.html("Debe seleccionar un producto")
				return false;
				}
		}
	
}

