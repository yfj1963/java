<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>

    
    <title>My JSP 'index.jsp' starting page<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"></title>
	<meta http-equiv="pragma" content="no-cache">

	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
	<meta http-equiv="description" content="This is my  ">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>

<table border="1" background="images/head.GIF" width="100%" height="100px">
<tr>
  <td >。</td>
</tr>


</table>  




 <table border="1"  width="100%" height="100px">
 <script type="text/javascript" src="images/lanrenzhijia.js"></script> 
<script type="text/javascript"> 
$(document).ready(function(){
$("ul.lanrenzhijia").parent().append("<span></span>"); 
$("ul.topnav li span").click(function() { 
	$(this).parent().find("ul.lanrenzhijia").slideDown('fast').show(); 

	$(this).parent().hover(function() {
	}, function(){
		$(this).parent().find("ul.lanrenzhijia").slideUp('slow'); 
	});
	}).hover(function() { 
		$(this).addClass("subhover"); 
	}, function(){	
		$(this).removeClass("subhover"); 
});
});
</script>
<link href="images/lanrenzhijia.css" type="text/css" rel="stylesheet" />
<body>
<table >
<div class="lanrenzhijia">
    <div id="header">
        <ul class="topnav">
            <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
            <li>
                <a href="http://www.lanrenzhijia.com">您自定义</a>
                <ul class="lanrenzhijia">
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>

                </ul>
            </li>
            <li>
                <a href="#">您的网站</a>
                <ul class="lanrenzhijia">
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">你自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                    <li><a href="http://www.lanrenzhijia.com">您自定义</a></li>
                </ul>
            </li>
			<li>
                <a href="#">加入我们</a>
                <ul class="lanrenzhijia">
                    <li><a href="Analysts.jsp">分析员</a></li>
                    <li><a href="Engineer.jsp">工程师</a></li>
                    <li><a href="LabAssist.jsp">实验员</a></li>

                </ul>
            </li>
            <li><a href="#">您的网站</a></li>
            <li><a href="#">您的网站</a></li>
        </ul>
    </div>
</div>
</table>
</body>
 </table>  
 
 
 
 

<table border="1"  width="100%" height="100px">

<tr>


  <td rowspan="4" width="400px" height="200px">空白11</td>
  <td colspan="5"  >


<body onLoad = "autoChangeImage();">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"> 
var i = 1;
function autoChangeImage(i){				//鑷姩鏀瑰彉鍥剧墖
		setTimeout("changeImage(i++); ", 1500);
		setTimeout("back(i); ", 1000);
		setTimeout("autoChangeImage(i = (i%4)); ", 1500);
}
function changeImage(idNum){
		document.getElementById("radio" + idNum).checked = "checked";
		switch(idNum){
			case 0:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/one.png)";//鏀瑰彉棣栭〉鍥剧墖
				break;
			case 1:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/two.png)";
				break;
			case 2:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/three.png)";
				break;
			case 3:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/four.png)";
				break;

		}
}
</script>
<style type="text/css"> 
			#contain{
				float:left;
				width: 1100px;
				height: 440px;
				border: 1px dotted red;
			}
			.imageShow{
				width: 1100px;
				height: 438px;
				border: 1px dashed Olive;
				background: url(images/one.png);
			}
			#posi{
				margin: -30px 0 0 700px;
				width: 100px;
				height: 25px;
			}
			.radio{
				width: 15px;
				height: 15px;
				margin-left: -1px;
				cursor: pointer;
				background: red;
			}
</style>
        <div id = "contain">  <!--图片展示内容框-->
                <div id = "imgIndex" class = "imageShow">     <!--默认显示图片框-->
                </div>
                <div id = "posi"><!--按钮位置-->
                    <input id = "radio0" class = "radio" name = "lit" type = "radio" value = "0" onClick="changeImage(0)" />
                    <input id = "radio1" class = "radio" name = "lit" type = "radio" value = "0" onClick="changeImage(1)" />
                    <input id = "radio2" class = "radio" name = "lit" type = "radio" value = "0" onClick="changeImage(2)" />
                    <input id = "radio3" class = "radio" name = "lit" type = "radio" value = "0" onClick="changeImage(3)" />
               </div>    
        </div>


</body>


</td>


  <td rowspan="4" width="400px" height="200px">空白11</td>
</tr>
<tr>

  <td colspan="3">
  <table border="1">
  <tr>
  <td>热门服务</td>
<td align="right" width="800px" height="90px">构型</td>
  </tr>
    <tr>
  <td>热门服务</td>
<td align="right" width="800px" height="90px">构型</td>
  </tr>
  </table>
  </td>
</tr>


</table> 

 <table border="1" width="100%" bgColor="#0000ff">

<tr>

  <td rowspan="3" width="150px">空白</td>

  <td >关于我们</td>
  <td >程序</td>
  <td >测量</td>
  <td >科技服务</td>
  <td >公司产品</td>
  <td >人才招聘</td>
  <td rowspan="4" width="150px">空白</td>
</tr>
<tr>
  <td>
<table border="1" width="100%">
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
</table>
</td>
  <td>
<table border="1" width="100%">
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
</table>
</td>
  <td>
<table border="1" width="100%">
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
</table>
</td>
  <td>
<table border="1" width="100%">
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
</table>
</td>
  <td>
<table border="1" width="100%">
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
</table>
</td>
  <td  >
<table border="1" width="100%">
<tr >
  <td>555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
<tr>
  <td  >555 788 36</td>
</tr>
</table>
</td>
</tr>
<tr>
  <td colspan="3" width="150px">
 <select width="100%" >  
  <option value ="1">Volvfffffffffffffbbbbbbbbbbbbbbbb fffffffffffo</option>  
  <option value ="2">Saab</option>  
  <option value="3">Opel</option>  
  <option value="4">Audi</option>  
</select>     
  </td>

  <td colspan="3" >版权所有</td>
</tr>

</table>



</table>


 	
  </body>
                              

</html>
