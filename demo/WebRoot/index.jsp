<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>

    
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

<table border="1" background="images/head.GIF" width="100%" height="100px">
<tr>
  <td >。</td>
</tr>


</table>  

 <table border="1"  width="100%" height="100px">
  
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
padding:10px;
text-align:center;
background-color: LightBlue;
font-weight: bold;
	<!--
	<这个地方设置颜色>
	-->
border:solid 1px #c3c3c3;
}

p.flip2
{
  
margin:0px;
padding:10px;
text-align:center;
background-color: Teal;
font-weight: bold;
	<!--
	<这个地方设置颜色>
	-->
border:solid 1px #c3c3c3;
}

div.panel
{
background-color: LightSkyBlue;  
height:120px;
display:none;
}
</style>
<body>
 <div class="content" style="float:left;display:block;width:100px;">
<p  class="flip1"></p>
 </div>


 <div class="content" style="float:left;display:block;width:100px;">
<p  class="flip2" ><a style="color:blue;font-size:16px;" href="http://www.baidu.com" class="twoji" title="新闻条目">首页</a></p>
 </div>

<div class="content"  style="float:left;display:block;width:120px;">
<p class="flip" style="color:blue">关于我们</p>
<div class="panel">
<p><a  href="http://www.baidu.com" class="twoji" title=".">公司介绍</a></p>
<p>公司特色</p>
<p>公司文化</p>
</div>
 </div>

<div class="content"  style="float:left;display:block;width:120px;">
<p class="flip">科技服务</p>
<div class="panel">
<p>服务1</p>
<p>服务2</p>
<p>服务3</p>
</div>
 </div>

<div class="content"  style="float:left;display:block;width:120px;">
<p class="flip">信息咨询</p>
<div class="panel">
<p>咨询1</p>
<p>咨询2</p>
<p>咨询3</p>
</div>
 </div>

<div class="content"  style="float:left;display:block;width:120px;">
<p class="flip">人才招聘</p>
<div class="panel">
<p>招聘1</p>
<p>招聘2</p>
<p>招聘3</p>
</div>
 </div>

<div class="content" style="float:left;display:block;width:100px;">
<p  class="flip1"></p>
 </div>

</body> 
 </table>  

<table border="1"  width="100%" height="100px">

<tr>

  <td rowspan="4" width="400px" height="200px">空白</td>

  <td colspan="5">


<body onLoad = "autoChangeImage();">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"> 
var i = 1;
function autoChangeImage(i){				//鑷姩鏀瑰彉鍥剧墖
		setTimeout("changeImage(i++); ", 1500);
		setTimeout("back(i); ", 1000);
		setTimeout("autoChangeImage(i = (i%5)); ", 1500);
}
function changeImage(idNum){
		document.getElementById("radio" + idNum).checked = "checked";
		switch(idNum){
			case 0:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/1.png)";//鏀瑰彉棣栭〉鍥剧墖
				break;
			case 1:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/2.png)";
				break;
			case 2:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/3.png)";
				break;
			case 3:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/4.png)";
				break;
			case 4:
				document.getElementById("imgIndex").style.backgroundImage = "url(images/4.png)";
				break;
		}
}
</script>
<style type="text/css"> 
			#contain{
				float:left;
				width: 900px;
				height: 240px;
				border: 1px dotted red;
			}
			.imageShow{
				width: 900px;
				height: 238px;
				border: 1px dashed Olive;
				background: url(images/1.png);
			}
			#posi{
				margin: -30px 0 0 700px;
				width: 100px;
				height: 25px;
			}
			.radio{
				width: 15px;
				height: 15px;
				margin-left: -8px;
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
                    <input id = "radio4" class = "radio" name = "lit" type = "radio" value = "0" onClick="changeImage(4)" />
                </div>    
        </div>


</body>


</td>


  <td rowspan="4" width="400px" height="200px">空白</td>
</tr>
<tr>

  <td colspan="3">
  <table border="1">
  <tr>
  <td>热门服务</td>
<td align="right" width="800px" height="90px">构型</td>
  </tr>
  </table>
  </td>


  <td  align="center" width="20px" height="10px" bgColor="#00ffff" nowrap="nowrap">新闻动态</td>
   <td  align="right"><a style="color:blue;font-size:16px;" href="http://www.baidu.com" class="twoji" title="新闻条目">更多<< </a> </td> 
</tr>
<tr>
  <td><img src="images/br0103.gif"  alt=" " /></td>
  <td><img src="images/br0106.gif"  alt=" " /></td>
  <td><img src="images/br0109.gif"  alt=" " /></td>
  <td align="left" rowspan="2" colspan="2">
<table border="1" >
<tr>
  <td> << </td>
  <td width="150px"><a style="color:blue;font-size:16px;" href="http://www.baidu.com" class="twoji" title="新闻条目">xinwen1</a> </td>
  <td align="right" width="10px">3</td>
</tr>

<tr>
  <td> << </td>
  <td width="150px"><a style="color:blue;font-size:16px;" href="http://www.baidu.com" class="twoji" title="新闻条目">xinwen2</a> </td>
  <td align="right" width="10px">3</td>
</tr>
<tr>
  <td> << </td>
  <td width="150px"><a style="color:blue;font-size:16px;" href="http://www.baidu.com" class="twoji" title="新闻条目">xinwen3</a> </td>
  <td align="right" width="10px">3</td>
</tr>

<tr>
  <td> << </td>
  <td width="150px"><a style="color:blue;font-size:16px;" href="http://www.baidu.com" class="twoji" title="新闻条目">xinwen4 </a> </td>
  <td align="right" width="5px">333</td>
</tr>
</table>
  </td>
</tr>
<tr>
  <td bgColor="#0000ff">版权所有</td>
  <td bgColor="#0000ff">版权所有</td>  
  <td bgColor="#0000ff">版权所有</td>  
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
