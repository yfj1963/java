<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"></title>
	<meta http-equiv="pragma" content="no-cache">

	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
  	<center>
  		欢迎您： <%=username %>

  	</center>
<h4>最上面的标题栏：</h4>
<table border="1" background="images/head.gif" width="100%" height="100px">
<tr>
  <td >。</td>
</tr>


</table>  


<h4>中间的内容：</h4>
<table border="1" width="100%" height="100px" bgColor="#0080ff">
<tr>
  <th colspan="9" background="images/top_right.gif"  >电话</th>
</tr>
<tr> 
  <td  align ="center" colspan="9" >电话</td>
</tr>
<tr>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"> 
$(document).ready(function(){
  $(".flip").mouseover(function(){
    $(this).next("div").slideDown(500);
  });
  $(".content").mouseleave(function(){
    $(this).children("div").slideUp(500);
  });
});
</script>
<style type="text/css"> 
div.panel,p.flip
{
  
margin:0px;
padding:5px;
text-align:center;
background-color: gray;
	<!--
	<这个地方设置颜色>
	-->
border:solid 1px #c3c3c3;
}
div.panel
{
background-color: blue;  
height:120px;
display:none;

}
</style>
   
<body>
 <div class="content" style="float:left;display:block;width:300px;">
<p  class="flip">滑过这里</p>
<div class="panel">
<p><a href="http://www.baidu.com" class="twoji" title="新闻条目">首页</a></p>
<p>2222222222222222222222</p>
</div>
 </div>
<div class="content"  style="float:left;display:block;width:300px;">
<p class="flip">滑过这里</p>
<div class="panel">
<p>11111111111111111</p>
<p>2222222222222222222222</p>
</div>
 </div>
</body>
</tr>
<tr>
  <td  background="images/biankuang.gif" >..</td>

  <td background="images/shouye.gif"><a href="http://www.baidu.com" class="twoji" title="新闻条目">首页</a></td>

  <td>555 77 855</td>
  <td>Bill Gates</td>
  <td>555 77 854</td>
  <td>555 77 855</td>
  <td>555 77 854</td>
  <td>555 77 855</td>
  <td  background="images/biankuang.gif" >..</td>
</tr>
</table>  	
  </body>
                              

</html>
