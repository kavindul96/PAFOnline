jQuery.validator.setDefaults({
  debug: true,
  success: "valid"
});
$( "#myform" ).validate({
  rules: {
	  txtProID: {
      required: true
    }
  }
});