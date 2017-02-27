<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>autoChangeImages</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    </head>
 <table border="1" background="images/head.GIF" width="100%" height="100px">
<tr>
  <td >...</td>
</tr>


</table>
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

                <tr>.....
        </tr>
        <tr>.....
        </tr>
</body>
</html>
