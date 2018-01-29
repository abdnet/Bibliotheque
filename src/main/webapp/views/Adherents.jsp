<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <jq:head/>
<%-- <link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript">
	$(function() {
		getSubForm($("#typeAb").val());
	});
	function getSubForm(type) {
		$.get("getSubForm?type=" + type, function(data) {
			$("#subForm").html(data);
		});
	}
</script> --%>
</head>
<body>
   <div class="cadre">
    <s:form action="save" method="post">
      <s:textfield name="id" label="ID AB"></s:textfield>
      <s:textfield name="nom" label="Nom"></s:textfield>
      <s:textfield name="prenom" label="Prenom"></s:textfield>
      <s:textfield name="email" label="Email"></s:textfield>
      <s:textfield name="mdp" label="mdp"></s:textfield>
     <s:textfield name="adresse" label="adresse"></s:textfield>
      
      <s:submit value="Save"></s:submit>
    </s:form>
   </div>
   <div class="cadre">
    <table class="table1">
      <tr>
        <th>ID</th><th>Date</th><th>Soldes</th><th>Type</th><th>Actif</th>
      </tr>
      <s:iterator value="adherents">
       <tr>
        <td><s:property value="id"/></td>
        <td><s:property value="nom"/></td>
        <td><s:property value="prenom"/></td>
        <td><s:property value="adresse"/></td>
        <td><s:property value="email"/></td>
       </tr>
      </s:iterator>
    </table>
   </div>
   
</body>
</html>