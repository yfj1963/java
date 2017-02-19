package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String username = request.getParameter("username");
String password = request.getParameter("password");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\"></title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      out.write("<table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"980\">\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td><!--显示头部信息程序-->\r\n");
      out.write("        <table style=\"border-collapse: collapse;\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"10\"></td>\r\n");
      out.write("              <td width=\"135\"><a href=\"thinkshop.cn.htm\"></a></td>\r\n");
      out.write("              <td width=\"50\"></td>\r\n");
      out.write("              <td width=\"120\"><a target=\"_blank\" href=\"index_bat.php.htm\"><img src=\"images/dazong.gif\" border=\"0\" height=\"47\" width=\"90\"></a></td>\r\n");
      out.write("              <td width=\"120\"><a target=\"_blank\" href=\"happybirthday.php.htm\"><img src=\"images/shenri.gif\" border=\"0\" height=\"47\" width=\"95\"></a></td>\r\n");
      out.write("              <td width=\"120\"><a target=\"_blank\" href=\"brandshop.php.htm\"><img src=\"images/pingpai.gif\" border=\"0\" height=\"47\" width=\"96\"></a></td>\r\n");
      out.write("              <td width=\"120\"><a target=\"_blank\" href=\"powered by Discuz!.htm\"><img src=\"images/luntan.gif\" border=\"0\" height=\"47\" width=\"95\"></a></td>\r\n");
      out.write("              <td width=\"120\"><a target=\"_blank\" href=\"gc.htm\"><img src=\"images/thinkcard.gif\" border=\"0\" height=\"47\" width=\"90\"></a></td>\r\n");
      out.write("              <td align=\"right\" valign=\"bottom\"><map name=\"FPMap_inctop\">\r\n");
      out.write("                  <area href=\"point_exg.php.htm\" shape=\"rect\" coords=\"13,2,81,16\" target=\"_blank\">\r\n");
      out.write("                  <area href=\"my_thinkshop.php.htm\" shape=\"rect\" coords=\"92, 1, 158, 15\" target=\"_blank\">\r\n");
      out.write("                  <area href=\"extend.php.htm\" shape=\"rect\" coords=\"170, 0, 233, 16\" target=\"_blank\">\r\n");
      out.write("                </map>\r\n");
      out.write("                <img src=\"images/top_right.gif\" usemap=\"#FPMap_inctop\" border=\"0\" height=\"22\" width=\"238\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table></td>\r\n");
      out.write("    </tr>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\r\n");
      out.write("                              <td ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"196\" >\r\n");
      out.write("                                  <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><img src=\"images/paihang_top.gif\" height=\"88\" width=\"196\"></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\" background=\"images/paihang_bg.gif\"><table style=\"border-collapse: collapse;\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"170\">\r\n");
      out.write("                                          <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_02.gif\"><a href=\"please input url on here\" class=\"twoji\" title=\"新闻条目\">nothing</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"2\"><img src=\"images/xian.gif\" height=\"1\" width=\"170\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr valign=\"middle\">\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_03.gif\"><a href=\"http://www.thinkshop.cn/index_pi.php?productcode=GT0855\" class=\"twoji\" title=\"new1\">......</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"2\"><img src=\"images/xian.gif\" height=\"1\" width=\"170\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_02.gif\"><a href=\"http://www.thinkshop.cn/index_pi.php?productcode=GT0856\" class=\"twoji\" title=\"new2\">nothing</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("\r\n");
      out.write("                                          </tbody>\r\n");
      out.write("                                        </table></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><img src=\"images/paihang_up.gif\" height=\"17\" width=\"196\"></td>\r\n");
      out.write("                                    </tr> \r\n");
      out.write("                                                                      \r\n");
      out.write("                                  </tbody>\r\n");
      out.write("                                </table></td>\r\n");
      out.write("                              <td align=\"right\" valign=\"top\" width=\"196\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"196\">\r\n");
      out.write("                                  <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><img src=\"images/paihang_top.gif\" height=\"88\" width=\"196\"></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\" background=\"images/paihang_bg.gif\"><table style=\"border-collapse: collapse;\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"170\">\r\n");
      out.write("                                          <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_02.gif\"><a href=\"http://www.thinkshop.cn/index_pi.php?productcode=GT1025\" class=\"twoji\" title=\"贝尔金护腕式鼠标垫\">贝尔金护腕式鼠标垫</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"2\"><img src=\"images/xian.gif\" height=\"1\" width=\"170\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_03.gif\"><a href=\"http://www.thinkshop.cn/index_pi.php?productcode=GT0855\" class=\"twoji\" title=\"3M 屏幕及键盘清洁套装\">3M 屏幕及键盘清洁套装</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("\r\n");
      out.write("                                          </tbody>\r\n");
      out.write("                                        </table></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><img src=\"images/paihang_up.gif\" height=\"17\" width=\"196\"></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                  </tbody>\r\n");
      out.write("                                </table></td>                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                      <tr>\r\n");
      out.write("                              <td ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"196\" >\r\n");
      out.write("                                  <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><img src=\"images/paihang_top.gif\" height=\"88\" width=\"196\"></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\" background=\"images/paihang_bg.gif\"><table style=\"border-collapse: collapse;\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"170\">\r\n");
      out.write("                                          <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_02.gif\"><a href=\"please input url on here\" class=\"twoji\" title=\"新闻条目\">nothing</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"2\"><img src=\"images/xian.gif\" height=\"1\" width=\"170\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr valign=\"middle\">\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_03.gif\"><a href=\"http://www.thinkshop.cn/index_pi.php?productcode=GT0855\" class=\"twoji\" title=\"new1\">......</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"2\"><img src=\"images/xian.gif\" height=\"1\" width=\"170\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                              <td height=\"25\"><img src=\"images/tou_02.gif\"><a href=\"http://www.thinkshop.cn/index_pi.php?productcode=GT0856\" class=\"twoji\" title=\"new2\">nothing</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("\r\n");
      out.write("                                          </tbody>\r\n");
      out.write("                                        </table></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td><img src=\"images/paihang_up.gif\" height=\"17\" width=\"196\"></td>\r\n");
      out.write("                                    </tr> \r\n");
      out.write("                                                                      \r\n");
      out.write("                                  </tbody>\r\n");
      out.write("                                </table></td>\r\n");
      out.write("                            \r\n");
      out.write("    </tr>  \r\n");
      out.write("         \r\n");
      out.write("    <tr>\r\n");
      out.write("                      <td><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                          <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td colspan=\"3\"><img src=\"images/jingcai.gif\" height=\"32\" width=\"190\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td rowspan=\"3\" bgcolor=\"#aab3d5\" width=\"1\"><img src=\"images/line.gif\" height=\"1\" width=\"1\"></td>\r\n");
      out.write("                              <td align=\"center\" bgcolor=\"#e2e4f0\"><table bgcolor=\"#ffffff\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n");
      out.write("                                  <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td class=\"twoji\" align=\"left\">·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=85\" target=\"_blank\">贝尔金成为2006网球大师杯..</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=84\" target=\"_blank\">3M手机防窥膜,特别的爱给特..</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=83\" target=\"_blank\">梁彦春出任贝尔金中国区总..</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=82\" target=\"_blank\">狂飚300M 802.11n无线路由</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=81\" target=\"_blank\">Pre-N 2代宽带无线路由器</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=79\" target=\"_blank\">金山毒霸杀毒U盘重装上阵</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=78\" target=\"_blank\">数码音频转播器真假说明</a><br>\r\n");
      out.write("                                        ·<a class=\"twoji\" href=\"http://www.thinkshop.cn/extend.php?type=file&amp;fileid=77\" target=\"_blank\">贝克曼清洁博士系列介绍</a><br></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                      <td align=\"center\" height=\"10\" valign=\"top\"><a href=\"http://www.thinkshop.cn/extend.php?type=file\"><img src=\"images/more.gif\" border=\"0\" height=\"5\" width=\"158\"></a></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                  </tbody>\r\n");
      out.write("                                </table></td>\r\n");
      out.write("                              <td rowspan=\"3\" bgcolor=\"#aab3d5\" width=\"1\"><img src=\"images/line.gif\" height=\"1\" width=\"1\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td bgcolor=\"#e2e4f0\" height=\"8\"><img src=\"images/line.gif\" height=\"1\" width=\"1\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td bgcolor=\"#aab3d5\" height=\"1\"><img src=\"images/line.gif\" height=\"1\" width=\"1\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          </tbody>\r\n");
      out.write("                        </table></td>    \r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"100%\"><!--底部INC-->\r\n");
      out.write("        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"white\" target=\"_blank\" align=\"center\" bgcolor=\"#383eb6\" height=\"25\"><a href=\"http://www.thinkshop.cn/extend.php#%C9%CC%B3%C7%B6%A8%CE%BB\" class=\"white\" target=\"_blank\">商城定位</a> | <a href=\"http://www.thinkshop.cn/extend.php#%BB%E1%D4%B1%D3%C5%BB%DD\" class=\"white\" target=\"_blank\"><font color=\"#ffffff\">会员优惠</font></a> | <a href=\"http://www.thinkshop.cn/extend.php#%B6%A9%B5%A5%B4%A6%C0%ED%B9%FD%B3%CC\" class=\"white\" target=\"_blank\">订单处理</a> | <a href=\"http://www.thinkshop.cn/extend.php#%D3%D0%B9%D8%BB%FD%B7%D6%B6%D2%BB%BB\" class=\"white\" target=\"_blank\">积分兑换</a> | <a href=\"http://www.thinkshop.cn/extend.php#%B3%A3%BC%FB%CE%CA%CC%E2\" class=\"white\" target=\"_blank\">常见问题</a> | <a href=\"http://www.thinkshop.cn/extend.php#%D0%D1%BF%CD%C0%F1%C8%AF\" class=\"white\" target=\"_blank\">礼券</a> | <a href=\"http://www.thinkshop.cn/extend.php#%B9%BA%C2%F2%B7%BD%CA%BD\" class=\"white\" target=\"_blank\">购买方式</a> | <a href=\"http://www.thinkshop.cn/extend.php#%BC%DB%B8%F1%CB%B5%C3%F7\" class=\"white\" target=\"_blank\">价格说明</a> | <a href=\"http://www.thinkshop.cn/extend.php#%B8%B6%BF%EE%B7%BD%CA%BD\" class=\"white\" target=\"_blank\">付款方式</a> | <a href=\"http://www.thinkshop.cn/extend.php#%C5%E4%CB%CD%B7%BD%CA%BD%D3%EB%B7%D1%D3%C3\" class=\"white\" target=\"_blank\">配送费用</a> | <a href=\"http://www.thinkshop.cn/extend.php#%B1%A3%D0%DE%D3%EB%CD%CB%BB%BB\" class=\"white\" target=\"_blank\">保修退换</a> | <a href=\"http://www.allsmart.com.cn/ThinkPad/bbs/upload/forumdisplay.php?fid=40\" class=\"white\" target=\"_blank\">客服专区</a> | <a href=\"http://www.thinkshop.cn/searchlist.htm\" class=\"white\" target=\"_blank\">快速浏览</a> | <a href=\"http://www.allsmart.com/about_me/about_9.htm\" class=\"white\" target=\"_blank\">招贤纳士</a> <span class=\"white\">| <a href=\"http://www.allsmart.com/about_me/about_10.htm\" class=\"white\" target=\"_blank\">友情链接</a></span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\" height=\"5\"><img src=\"images/line.gif\" height=\"1\" width=\"1\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\"><table style=\"border-collapse: collapse; font-size: 9pt;\" border=\"0\" bordercolor=\"#111111\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                  <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"50\" height=\"38\" align=\"left\"><a href=\"http://www.ebworld.com.cn/html/2006-12-11/2006121183850.asp\" target=\"_blank\"><img src=\"images/2006-TOP100.gif\" alt=\"第二届消费者最喜爱的网站TOP100\" border=\"0\" height=\"43\" width=\"44\"></a></td>\r\n");
      out.write("                      <td><p align=\"left\"><a href=\"http://www.hd315.gov.cn/beian/view.asp?bianhao=010202006053100022\" target=\"_blank\"><img src=\"images/biaoshi.gif\" border=\"0\" height=\"35\" width=\"28\"></a></p></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </tbody>\r\n");
      out.write("                </table></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table></td>\r\n");
      out.write("    </tr> \r\n");
      out.write("       \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>                                \r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
