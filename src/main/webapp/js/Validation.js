'use strick'

	//-----Al mandar datos onsubmit del formulario
	function validationAlertForm () {
	
	    var date = verifyDate();
	    console.log(date);
	    var place = verifyPlace();          
	    console.log(place);
	    var allergen = verifyAllergen();    
	    var product = verifyProduct();
	
	    if (date && place && allergen && annotation && product) {
			
	        return true;
	
	    }else{
	        return false;
	    }
	}

	//------Limpiamos el formulario
	function clear() {
		
		
	  var inputDate=  $('input[type="date"]');
	  var inputText =   $('input[type="text"]');
	  var inputRadio=  $('input[type="radio"]');
	
		inputDate.val("");
		inputText.val("");
		inputRadio.val("");

	}


	//---------VALIDACIONES 1º PREGUNTAS
	function verifyDate() {         
		   
		   function pad2(n) {
			  return (n < 10 ? '0' : '') + n;
			}
			
			var date = new Date();
			var month = pad2(date.getMonth()+1);//months (0-11)
			var day = pad2(date.getDate());//day (1-31)
			var year= date.getFullYear();
			
			var formattedDate =  year+"-"+month+"-"+day;
			  var date = $('#dateInput').val();
			  console.log(date); // 2022-05-03
			  var smsDate = $("#smsDate");  
			  
			  
			  if(date == ""){
				
				smsDate.html("No puede estar vacia");
				return false;
				
				}else if (date < formattedDate ){
					
				smsDate.html("El comienzo debe ser a partir del dia de hoy");
				return false;
					
				}else{
					smsDate.hide();
					return true;
				}
	}

	function verifyPlace() {
	   
	   	//Validar el tamaño segun la BD
	        var place = $('#placeInput').val();
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
	            return false;
	        }
	}

	function verifyAllergen() {
		
				//Validar tamaño segun la BD
			   var aller = $('#allergenInput').val();
			   console.log(aller);
		       var mensaje = $('#smsAllergen');
		       var ex1 = /^[A-Za-z\s\s]+$/;
	
	    
			if(ex1.test(aller) || aller == "")
			{
				mensaje.hide();
	             return true;
	
            } else {
                mensaje.html("No válidos caracteres especiales ni números.");
                return false;
            }
	       
	}



	function verifyProduct() {
		//Validar tamaño segun BD
		
	 	var mensaje = $('#smsProduct'); 
		var proce= document.getElementsByName('producto');
	
	    for(i=0; i<proce.length; i++){
	        
	        if(proce[i].checked){
	            var processor=proce[i].checked;
	            console.log(processor);
	            mensaje.hide();
	            return true;
	            
	        }else{
				mensaje.html("Debe seleccionar un producto");
				return false;
			}
		}
	
}

