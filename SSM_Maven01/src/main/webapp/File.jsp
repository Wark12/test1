<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
<script type="text/javascript">
$(function(){
	$.ajax({
		type:'get',
		url:'find.do',
		dataType:'json',
		success:function(data){
			var obj=$("#provice");
			for (var i = 0;i<data.length; i++) {
				var ob="<option value='"+data[i].pid+"'>"+data[i].pname+"</option>";
				obj.append(ob);
			}
		}
	});
});
</script>
<select name="provice" id="provice">
<option value="0">请选择</option>
</select>
<select name="city" id="city">
<option value="0">请选择</option>
</select>
<select name="street" id="street">
<option value="0">请选择</option>
</select>
<script type="text/javascript">
$("#provice").change(function(){
	$("#city option").remove();
	$.ajax({
		type:'get',
		url:'findcity?id='+$("#provice").val(),
		dataType:'json',
		success:function(data){
			var obj=$("#city");
			for (var i = 0;i<data.length; i++) {
				var ob="<option value='"+data[i].cid+"'>"+data[i].cname+"</option>";
				obj.append(ob);
			}
		}
	 });
});
</script>
<script type="text/javascript">
$("#city").change(function(){
	$("#street option").remove();
	$.ajax({
		type:'get',
		url:'findstreet?id='+$("#city").val(),
		dataType:'json',
		success:function(data){
			var obj=$("#street");
			for (var i = 0;i<data.length; i++) {
				var ob="<option value='"+data[i].sid+"'>"+data[i].sname+"</option>";
				obj.append(ob);
			}
		}
	 });
});
</script>
</body>
</html>