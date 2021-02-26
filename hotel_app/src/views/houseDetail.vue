<template>
  <div id="container">
    <!--top 整个头部-->
    <div id="nav">
      <!--logo-->
      <div class="logo"> <img src="../assets/Common/images/logo.png" width="120" height="50" border="0"/> </div>
      <!--导航-->
      <ul id="navMenu">
        <li><a href="#" rel='dropmenu1'>国内目的地</a></li>
        <li><a href="#" rel='dropmenu2'>主题推荐</a></li>
        <li><a href="#" rel='dropmenu3'>出游类型</a></li>
        <li><a href="#" rel='dropmenu4'>旅游指南</a></li>
      </ul>
<!--      <div class="attention">-->
<!--        <a href="#" class="atnimg"><img src="../assets/Common/images/attention.jpg" width="70" height="25" border="0"/></a>-->
<!--      </div>-->
      <!--手动搜索-->





    </div>

    <!--导航下拉菜单-->
    <div id="dropmenu1" class="dropMenu">
      <table border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="80" class="tdborder">
            <span class="province">直辖市</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">北京</a></li>
              <li><a href="#">上海</a></li>
              <li><a href="#">天津</a></li>
              <li><a href="#">重庆</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">港澳台</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">香港</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">海南</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#/CityHouse?cityName=三亚">三亚</a></li>
              <li><a href="#">博鳌(琼海)</a></li>
              <li><a href="#">文章</a></li>
              <li><a href="#">五指山</a></li>
              <li><a href="#">陵水（三亚）</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">西南</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">桂林</a></li>
              <li><a href="#">大理</a></li>
              <li><a href="#">丽江</a></li>
              <li><a href="#">昆明</a></li>
              <li><a href="#">腾冲</a></li>
              <li><a href="#">西双版纳</a></li>
              <li><a href="#">香格里拉</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">山东</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">青岛</a></li>
              <li><a href="#">威海</a></li>
              <li><a href="#">烟台</a></li>
              <li><a href="#">蓬莱</a></li>
              <li><a href="#">济南</a></li>
              <li><a href="#">栖霞（烟台）</a></li>
              <li><a href="#">枣庄</a></li>
              <li><a href="#">泰安</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">江苏</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">南京</a></li>
              <li><a href="#">无锡</a></li>
              <li><a href="#">苏州</a></li>
              <li><a href="#">南通</a></li>
              <li><a href="#">扬州</a></li>
              <li><a href="#">镇江</a></li>
              <li><a href="#">盱眙</a></li>
              <li><a href="#">周庄</a></li>
              <li><a href="#">常州</a></li>
              <li><a href="#">昆山</a></li>
              <li><a href="#">连云港</a></li>
              <li><a href="#">盐城</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">浙江</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">杭州</a></li>
              <li><a href="#">千岛湖</a></li>
              <li><a href="#">宁波</a></li>
              <li><a href="#">舟山</a></li>
              <li><a href="#">西塘</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">四川</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">成都</a></li>
              <li><a href="#">九寨沟</a></li>
              <li><a href="#">峨眉山</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">广东</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">广州</a></li>
              <li><a href="#">深圳</a></li>
              <li><a href="#">珠海</a></li>
              <li><a href="#">佛山</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">山陕</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">西安</a></li>
              <li><a href="#">延安</a></li>
              <li><a href="#">平遥</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">东北</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">大连</a></li>
              <li><a href="#">营口</a></li>
              <li><a href="#">哈尔滨</a></li>
              <li><a href="#">沈阳</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">安徽</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">合肥</a></li>
              <li><a href="#">黄山</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">福建</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">福州</a></li>
              <li><a href="#">厦门</a></li>
              <li><a href="#">武夷山</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">江西</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">南昌</a></li>
              <li><a href="#">庐山</a></li>
              <li><a href="#">婺源</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">湖南湖北</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">武汉</a></li>
              <li><a href="#">长沙</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">河南</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">郑州汉</a></li>
              <li><a href="#">洛阳</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">河北</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">承德</a></li>
              <li><a href="#">秦皇岛</a></li>
              <li><a href="#">张家口</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">西北</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">兰州</a></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td class="tdborder">
            <span class="province">内蒙古</span>
          </td>
          <td class="tdborder">
            <ul>
              <li><a href="#">呼伦贝尔</a></li>
              <li><a href="#">满洲里</a></li>
            </ul>
          </td>
        </tr>
      </table>
    </div>

    <ul id="dropmenu2" class="dropMenu">
      <li><a href="#">相约海岛</a></li>
      <li><a href="#">海滨漫步</a></li>
      <li><a href="#">休闲时光</a></li>
      <li><a href="#">极致体验</a></li>
      <li><a href="#">赏花踏青</a></li>
    </ul>
    <ul id="dropmenu3" class="dropMenu">
      <li><a href="#">浪漫之旅</a></li>
      <li><a href="#">家庭出游</a></li>
      <li><a href="#">朋友聚会</a></li>
    </ul>



    <!--top 头部结束-->

    <!--颈部-->
    <div id="neck">
      <!--登录注册行-->
      <div class="link">
        <a href="#">手机客户端</a>
        <a href="#">在线客服</a>
        <a href="../UserInfo/OrderList.html">我的天堂鸟</a>
        <a href="javascript:void(0)" @click="tuichu()">退出</a>
        <div class="username">
          <a href="javascript:void(0)" @click="goOrderList()">{{ userName }}</a>
          <span>您好，</span>
        </div>
      </div>

      <!--面包屑导航-->
<!--      <div class="bread">-->
<!--        <a href="../Home.html">天堂鸟</a>-->
<!--        <span>></span>-->
<!--        <a href="CityHouse.html">三亚住宿</a>-->
<!--        <span>></span>-->
<!--        <span>亚龙湾公主郡清爽亦然双阳台度假房</span>-->

<!--      </div>-->

    </div>
    <!--颈部结束-->

    <div class="clear"></div>

    <!--中间整体部分-->
    <div id="middle">
      <!--房屋名称-->
      <div class="housetitle">
        <label>{{houseForm.HOUSE_NAME}}</label>
      </div>
      <!--房屋名称结束-->

      <!--中间左部分-->
      <div class="middle-left">
        <!--焦点图部分-->
        <div class="focus">
          <div class="mod_focus_show" id="divimgplay">
            <ul class="mod_focus_pic" id="divimginfog_imgPlayer">
              <li><img src="../assets/House/images/focus/b01.jpg" alt="" width="650" height="320" border="0"/></li>
              <li><img src="../assets/House/images/focus/b02.jpg" alt="" width="650" height="320" border="0"/></li>
              <li><img src="../assets/House/images/focus/b03.jpg" alt="" width="650" height="320" border="0"/></li>
              <li><img src="../assets/House/images/focus/b04.jpg" alt="" width="650" height="320" border="0"/></li>
              <li><img src="../assets/House/images/focus/b05.jpg" alt="" width="650" height="320" border="0"/></li>
              <li><img src="../assets/House/images/focus/b06.jpg" alt="" width="650" height="320" border="0"/></li>

            </ul>
            <ul class="mod_focus_title" id="ptitleg_imgPlayer">
              <li class="current">
                <h3><a href="#" target="_blank"></a></h3>
                <p></p>
              </li>
            </ul>
            <div class="focus_switch"><a href="javascript:;" class="icon_prev"></a><a href="javascript:;" class="icon_next"></a></div>
            <ul class="mod_focus_list" id="divpageinfog_imgPlayer">
              <li class="current"><a  href="javascript:void(0)" >
                <img src="../assets/House/images/focus/small01.jpg" alt="房间1" width="60" height="60" border="0"/><span class="border"></span><span class="mask"></span></a></li>
              <li><a  href="javascript:void(0)" >
                <img src="../assets/House/images/focus/small02.jpg" alt="房间2" width="60" height="60" border="0"/><span class="border"></span><span class="mask"></span></a></li>
              <li><a  href="javascript:void(0)" >
                <img src="../assets/House/images/focus/small03.jpg" alt="房间3" width="60" height="60" border="0"/><span class="border"></span><span class="mask"></span></a></li>
              <li><a  href="javascript:void(0)" >
                <img src="../assets/House/images/focus/small04.jpg" alt="厨房" width="60" height="60" border="0"/><span class="border"></span><span class="mask"></span></a></li>
              <li><a  href="javascript:void(0)" >
                <img src="../assets/House/images/focus/small05.jpg" alt="客厅" width="60" height="60" border="0"/><span class="border"></span><span class="mask"></span></a></li>
              <li><a  href="javascript:void(0)" >
                <img src="../assets/House/images/focus/small06.jpg" alt="海景" width="60" height="60" border="0"/><span class="border"></span><span class="mask"></span></a></li>
            </ul>
          </div>
          <!--焦点图轮换的速度-->
        </div>
        <!--焦点图部分结束-->

        <!--房屋介绍、小区介绍、周边介绍部分的tab选项卡-->
        <div class="tabHouseIntro">
          <DIV id=con>
            <UL id=tags>
              <li class=selectTag><a onClick="selectTag('tagContent0',this)" href="javascript:void(0)">房屋介绍</a> </li>
<!--              <li><a onClick="selectTag('tagContent1',this)" href="javascript:void(0)">小区介绍</a> </li>-->
<!--              <li><a onClick="selectTag('tagContent2',this)" href="javascript:void(0)">位置及周边</a> </li>-->
            </UL>

            <!--选项卡下面的内容-->
            <DIV id=tagContent>
              <!--第一个标签，房屋介绍的内容-->
              <DIV class="tagContent selectTag" id=tagContent0>
                <!--文字介绍-->
                <div class="textinfo">
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>地属三亚湾 近距离观海享受</h4>
                  <p>房间所属小区位于美丽的三亚湾沿岸，优越的地理位置和面朝大海的观景阳台，完美的诠释了靠海而居的休闲生活。</p>
                  <br/>
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>开放式结构 舒适的居住空间</h4>
                  <p>开放式的空间结构，整个房间显得非常通透，且采光也十分良好。明厨明卫设计，让室内长期保持干燥明亮的生活环境。浅色瓷砖简洁的线条，呈现房屋现代时尚的一面。功能布置区完善细致，在清澈的墙体陪衬基础上，客厅沙发采用不同鲜亮的色彩让其高调出位。现代厨房L型的个性设计的同时，更突出了实用的设计。清澈白灰色的墙面，加上大块透明的玻璃窗，室内充满了明丽的自然光。一切都显得清澈透明，淡雅宁静。</p>

                </div>
                <!--文字介绍结束-->

                <!--基本信息-->
                <div class="basicInfo">
                  <table cellpadding="0" cellspacing="0">
                    <tr height="30">
                      <td class="tabtitle" colspan="2">
                        <span>基本信息</span>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>房屋类型</span>
                      </td>
                      <td class="tdborder">
                        <label>平层</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>房屋面积</span>
                      </td>
                      <td class="tdborder">
                        <label>{{ houseForm.HOUSE_AREA }}平米</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>可住人数</span>
                      </td>
                      <td class="tdborder">
                        <label>{{ houseForm.HOUSE_PEOPLE }}人</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>卧室数</span>
                      </td>
                      <td class="tdborder">
                        <label>1个</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>房屋套数</span>
                      </td>
                      <td class="tdborder">
                        <label>4套</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>床数</span>
                      </td>
                      <td class="tdborder">
                        <label>{{ houseForm.HOUSE_BEDNUM }}个</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>卫生间数</span>
                      </td>
                      <td class="tdborder">
                        <label>1个</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>入住时间</span>
                      </td>
                      <td class="tdborder">
                        <label>{{houseForm.HOUSE_COMETIME}}</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>退房时间</span>
                      </td>
                      <td class="tdborder">
                        <label>{{houseForm.HOUSE_LEAVETIME}}</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>最少天数</span>
                      </td>
                      <td class="tdborder">
                        <label>1天</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>最多天数</span>
                      </td>
                      <td class="tdborder">
                        <label>无限制</label>
                      </td>
                    </tr>
                  </table>
                </div>
                <!--基本信息结束-->

                <!--服务信息-->
                <div class="serviceinfo">
                  <!--设施-->
                  <div class="service">
                    <p class="servicetitle">设施：</p>
                    <ul>
                      <li>空调</li>
                      <li>电视机</li>
                      <li>电冰箱</li>
                      <li>热水器</li>
                      <li>洗衣机</li>
                    </ul>
                  </div>

                  <!--配套-->
                  <div class="service">
                    <p class="servicetitle">配套：</p>
                    <ul>
                      <li>宽带</li>
                      <li>有线电视</li>
                      <li>全天热水</li>
                      <li>门禁</li>
                      <li>停车位</li>
                    </ul>
                  </div>

                  <!--服务-->
                  <div class="service">
                    <p class="servicetitle">服务：</p>
                    <ul>
                      <li>行李寄存</li>
                      <li>商务服务</li>
                      <li>邮寄信件</li>
                      <li>代购服务</li>
                      <li>洗衣服务</li>
                      <li>租借服务</li>
                      <li>加床服务</li>
                    </ul>
                  </div>

                  <!--其他-->
                  <div class="service">
                    <p class="servicetitle">其他：</p>
                    <ul>
                      <li>可以：</li>
                      <li>烧饭</li>
                    </ul>
                    <br/>
                    <ul>
                      <li>禁止：</li>
                      <li>吸烟</li>
                      <li>带宠物</li>
                      <li>聚会</li>

                    </ul>

                  </div>
                </div>
                <!--服务信息结束-->

              </DIV>
              <!--第一个标签，房屋介绍的内容结束-->

              <!--第二个标签，小区介绍的内容-->
              <DIV class=tagContent id=tagContent1>
                <!--文字介绍-->
                <div class="textinfo">
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>交通</h4>
                  <p>小区出行还算方便，附近公交车较多，有6路、8路、24路、27路、30路、旅游专1、旅游专2经过。</p>
                  <p>小区距离市区约7公里，步行至美丽新海岸小区站，乘坐8路可至三亚市各处。</p>
                  <p>小区距离凤凰机场约8公里，步行至美丽新海岸小区站乘27路车即可到达</p>
                  <p>小区距离三亚汽车总站约7公里，步行至美丽新海岸小区站，乘坐8路车至水利大厦，步行400米左右即可到达。</p>
                  <p>小区距离三亚火车站约8公里，步行至美丽新海岸小区站，乘30路即可到达。</p>
                  <br/>
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>特色</h4>
                  <p>高层海景房、酒店式公寓。</p>
                  <br/>
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>安全措施</h4>
                  <p>24小时安保措施、对讲门禁、周界安防系统、访客登记制度。</p>
                  <br/>
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>配套措施</h4>
                  <p>另配套有网球场、下棋亭、航空售票点。</p>
                  <p>泳池10元/次；</p>

                </div>
                <!--文字介绍结束-->

                <!--基本信息-->
                <div class="basicInfo">
                  <table cellpadding="0" cellspacing="0">
                    <tr height="30">
                      <td class="tabtitle" colspan="2">
                        <span>小区信息</span>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>建成年份</span>
                      </td>
                      <td class="tdborder">
                        <label>2009</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>绿化率</span>
                      </td>
                      <td class="tdborder">
                        <label>45%</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>开发商</span>
                      </td>
                      <td class="tdborder">
                        <label>三亚安国海岸建设投资有限公司</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>物业</span>
                      </td>
                      <td class="tdborder">
                        <label>兰海物业管理公司</label>
                      </td>
                    </tr>
                    <tr height="30">
                      <td class="tdborder">
                        <span>停车费</span>
                      </td>
                      <td class="tdborder">
                        <label>收费</label>
                      </td>
                    </tr>

                  </table>
                </div>
                <!--基本信息结束-->

                <!--服务信息,地图-->
                <div class="serviceinfo">
                  <img src="images/community.gif" width="300" height="230" border="0"/>
                </div>

              </DIV>
              <!--第二个标签，小区介绍的内容结束-->

              <!--第三个标签，位置及周边的内容-->
              <DIV class=tagContent id=tagContent2>
                <!--地图-->
                <div class="map">
                  <img src="../assets/House/images/map.gif" width="650" height="390" border="0"/>
                </div>

                <!--文字介绍-->
                <div class="textinfo">
                  <h4><img src="../assets/House/images/list.jpg" width="10" height="10" border="0"/>交通</h4>
                  <p>小区出行还算方便，附近公交车较多，有6路、8路、24路、27路、30路、旅游专1、旅游专2经过。</p>
                  <p>小区距离市区约7公里，步行至美丽新海岸小区站，乘坐8路可至三亚市各处。</p>
                  <p>小区距离凤凰机场约8公里，步行至美丽新海岸小区站乘27路车即可到达</p>
                  <p>小区距离三亚汽车总站约7公里，步行至美丽新海岸小区站，乘坐8路车至水利大厦，步行400米左右即可到达。</p>
                  <p>小区距离三亚火车站约8公里，步行至美丽新海岸小区站，乘30路即可到达。</p>
                </div>
                <!--文字介绍结束-->

              </DIV>
              <!--第三个标签，位置及周边的内容结束-->
            </DIV>
            <!--选项卡下面的内容结束-->

          </DIV>
          <!--选项卡结束-->
        </div>
        <!--房屋介绍、小区介绍、位置及周边部分的tab选项卡结束-->


        <!--房屋评价-->
        <div class="houseComment">
          <!-- 选项卡开始 -->
          <div class="nTab">
            <!-- 标题开始 -->
            <div class="TabTitle">
              <ul id="myTab0">
                <li class="active" onclick="nTabs(this,0);">房屋评价</li>
                <li class="normal" onclick="nTabs(this,1);">其他房屋评价</li>
              </ul>
            </div>

            <!-- 选项卡下面的内容开始 -->
            <div class="TabContent">
              <!--第一个选项内容，房屋评价-->
              <div id="myTab0_Content0">
                <table>
                  <tr>
                    <td valign="top" width="70">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>187****9013</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>最要感谢的就是写这个网站前端的大神啊，太感动了，怎么这么有才哒，太棒了有没有，赞一个先。。。不多说，说多了都是泪。。。</p>
                      </div>
                    </td>
                    <td width="70"></td>
                  </tr>
                  <tr>
                    <td></td>
                    <td>
                      <!--管理员回复-->
                      <div class="reply">
                        <p>您的肯定是我们最大的鼓励，欢迎下次再次光临！</p>
                      </div>

                    </td>
                    <td valign="top">
                      <p><img src="images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>房屋管理员</p>
                    </td>
                  </tr>

                  <tr>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>屌丝女</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>同意楼上观点，真开心，掌柜人真好，房屋挺不错的我喜欢，下次还会再次光临的。</p>
                      </div>

                    </td>
                    <td width="70"></td>
                  </tr>

                  <tr>
                    <td></td>
                    <td>
                      <!--管理员回复-->
                      <div class="reply">
                        <p>您的肯定是我们最大的鼓励，欢迎下次再次光临！</p>
                      </div>

                    </td>
                    <td valign="top">
                      <p><img src="images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>房屋管理员</p>
                    </td>
                  </tr>

                  <tr>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>2b青年</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>楼上妹纸正解啊。。。房间真好有没有，床铺很舒服有没有，阳台很大有没有，风景比妹纸更迷人有没有。。。嘎嘎嘎。。。我不会告诉你掌柜人有多好，有没有。。。敢不敢也来住住。。。</p>
                      </div>

                    </td>
                    <td></td>
                  </tr>

                  <tr>
                    <td></td>
                    <td>
                      <!--管理员回复-->
                      <div class="reply">
                        <p>您的肯定是我们最大的鼓励，欢迎下次再次光临！呵呵。。。2b青年欢乐多啊。。。有没有。。。</p>
                      </div>

                    </td>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>房屋管理员</p>
                    </td>
                  </tr>
                </table>

                <!--分页-->
                <div class="page">
                  <a href="#" class="fristpage">首页</a>
                  <a href="#" class="pre">上一页</a>
                  <a href="#" class="pagenub">1</a>
                  <a href="#" class="pagenub">2</a>
                  <a href="#" class="next">下一页</a>
                  <a href="#" class="lastpage">尾页</a>
                </div>
                <!--分页结束-->
              </div>
              <!--第一个选项内容，房屋评价结束-->

              <!--第二个选项内容，其他房屋评价-->
              <div id="myTab0_Content1" class="none">
                <table>
                  <tr>
                    <td valign="top" width="70">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>变态男</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>不错不错。。。</p>
                      </div>

                    </td>
                    <td width="70"></td>
                  </tr>
                  <tr>
                    <td></td>
                    <td>
                      <!--管理员回复-->
                      <div class="reply">
                        <p>您的肯定是我们最大的鼓励，欢迎下次再次光临！</p>
                      </div>

                    </td>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>房屋管理员</p>
                    </td>
                  </tr>

                  <tr>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>小屁孩</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>掌柜人真好，房屋挺不错的我喜欢，下次还会再次光临的。</p>
                      </div>

                    </td>
                    <td width="70"></td>
                  </tr>

                  <tr>
                    <td></td>
                    <td>
                      <!--管理员回复-->
                      <div class="reply">
                        <p>您的肯定是我们最大的鼓励，欢迎下次再次光临！</p>
                      </div>

                    </td>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>房屋管理员</p>
                    </td>
                  </tr>

                  <tr>
                    <td valign="top">
                      <p><img src="images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>一群db</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>楼上妹纸正解啊。。。房间真好有没有，床铺很舒服有没有，阳台很大有没有，风景比妹纸更迷人有没有。。。嘎嘎嘎。。。我不会告诉你掌柜人有多好，有没有。。。敢不敢也来住住。。。</p>
                      </div>

                    </td>
                    <td></td>
                  </tr>

                  <tr>
                    <td></td>
                    <td>
                      <!--管理员回复-->
                      <div class="reply">
                        <p>您的肯定是我们最大的鼓励，欢迎下次再次光临！呵呵。。。2b青年欢乐多啊。。。有没有。。。</p>
                      </div>

                    </td>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>房屋管理员</p>
                    </td>
                  </tr>

                  <tr>
                    <td valign="top">
                      <p><img src="../assets/House/images/userimg01.jpg" width="70" height="70" border="0"/></p>
                      <p>nb的人儿</p>
                    </td>
                    <td>
                      <div class="commetncnt">
                        <p>掌柜回复老是这么几句，不想多说了,说多了都是泪。。。</p>
                      </div>

                    </td>
                    <td></td>
                  </tr>
                </table>

                <!--分页-->
                <div class="page">
                  <a href="#" class="fristpage">首页</a>
                  <a href="#" class="pre">上一页</a>
                  <a href="#" class="pagenub">1</a>
                  <a href="#" class="pagenub">2</a>
                  <a href="#" class="next">下一页</a>
                  <a href="#" class="lastpage">尾页</a>
                </div>
                <!--分页结束-->

              </div>
              <!--第二个选项内容，其他房屋评价-->
            </div>
            <!-- 选项卡下面的内容结束 -->
          </div>
          <!-- 选项卡结束 -->

        </div>
        <!--房屋评价结束-->

      </div>
      <!--中间左部分结束-->

      <!--中间右部分-->
      <div class="middle-right">
        <!--预定房间、客服-->
        <div class="reservation">
          <p class="price">￥<label>{{ houseForm.HOUSE_PRICE }}元</label>每天</p>
          <div class="clear"></div>
          <div class="date">
            <span>入住日期</span>
            <input id="comeDate"  name="text2" type="text" class="Wdate" style="border:0;width:150px; height:20px;margin-top:10px;" />

          </div>
          <div class="date">
            <span>退房日期</span>
            <input id="leaveDate"  name="text2" type="text" class="Wdate" style="border:0;width:150px; height:20px;margin-top:10px;"

            />
          </div>
          <!--合计-->
          <div class="totalprice">

            <p>共入住：<label>{{ liveDays }}</label>天</p>
            <p>合计：￥<label>{{ liveDays * houseForm.HOUSE_PRICE }}</label></p>

          </div>
          <input type="button" value="预定" id="bookbtn" @click="goOrder();"/>
          <input type="submit" value="天堂鸟客服" id="cusserbtn"/>
          <div class="servicecase">
            <p>回复率：<label>100%</label></p>
            <p>订单处理率：<label>98%</label></p>
            <p>订单平均处理时间：<label>﹤1分钟</label></p>
          </div>
        </div>
        <!--预定房间、客服结束-->

        <!--该公司其他房源-->
        <div class="CompanyOtherList">
          <h4>该公司其他房源</h4>
          <a href="#" class="readall">查看全部>></a>

          <div class="clear"></div>

          <div class="OtherList">
            <a href="#"><img src="../assets/House/images/nearby/nearby01.jpg" width="100" height="80" border="0" /></a>
            <div class="OtherListname">
              <p><a href="#">三亚高层热带风情海景公寓</a></p>
              <p><label>1室1厅</label></p>
            </div>
          </div>

          <div class="clear"></div>

          <div class="OtherList">
            <a href="#"><img src="../assets/House/images/nearby/nearby02.jpg" width="100" height="80" border="0" /></a>
            <div class="OtherListname">
              <p><a href="#">三亚高层度假公寓</a></p>
              <p><label>2室1厅</label></p>
            </div>
          </div>

          <div class="clear"></div>

          <div class="OtherList">
            <a href="#"><img src="../assets/House/images/nearby/nearby03.jpg" width="100" height="80" border="0" /></a>
            <div class="OtherListname">
              <p><a href="#">三亚高层热带风情海景公寓</a></p>
              <p><label>1室1厅</label></p>
            </div>
          </div>

        </div>
        <!--该公司其他房源结束-->

        <div class="clear"></div>

        <!--附近房源-->
        <div class="NearbyList">
          <h4>附近房源</h4>

          <div class="clear"></div>

          <div class="OtherList">
            <a href="#"><img src="images/nearby/nearby01.jpg" width="100" height="80" border="0" /></a>
            <div class="OtherListname">
              <p><a href="#">三亚高层热带风情海景公寓</a></p>
              <p><label>1室1厅</label></p>
            </div>
          </div>

          <div class="clear"></div>

          <div class="OtherList">
            <a href="#"><img src="../assets/House/images/nearby/nearby02.jpg" width="100" height="80" border="0" /></a>
            <div class="OtherListname">
              <p><a href="#">三亚高层度假公寓</a></p>
              <p><label>2室1厅</label></p>
            </div>
          </div>

          <div class="clear"></div>

          <div class="OtherList">
            <a href="#"><img src="../assets/House/images/nearby/nearby03.jpg" width="100" height="80" border="0" /></a>
            <div class="OtherListname">
              <p><a href="#">三亚高层热带风情海景公寓</a></p>
              <p><label>1室1厅</label></p>
            </div>
          </div>
        </div>
        <!--附近房源结束-->

        <!--为什么选择-->
        <div class="whychoose">
          <h4>为什么选择天堂鸟</h4>
          <table>
            <tr height="50">
              <td width="50">
                <img src="../assets/House/images/sloganimg1.jpg" width="40" height="40" border="0"/>
              </td>
              <td>
                <p>实地验真，真是点评，如实描述。</p>
              </td>
            </tr>
            <tr height="50">
              <td><img src="../assets/House/images/sloganimg2.jpg" width="40" height="40" border="0"/></td>
              <td>
                <p>订金由天堂鸟担保，离店后付款。</p>
              </td>
            </tr>
            <tr height="50">
              <td><img src="../assets/House/images/sloganimg3.jpg" width="40" height="40" border="0"/></td>
              <td>
                <p>保障入住，1000万资金保障金现行赔付，7×24小时客服。</p>
              </td>
            </tr>
            <tr height="50">
              <td><img src="../assets/House/images/sloganimg4.jpg" width="40" height="40" border="0"/></td>
              <td>
                <p>实力雄厚：携程网荣誉出品，品质保障。</p>
              </td>
            </tr>
          </table>

        </div>
        <!--为什么选择结束-->

      </div>
      <!--中间右部分结束-->

    </div>
    <!--中间整体部分结束-->

    <div class="clear"></div>



    <!--foot-->
    <div id="foot">
      <a href="#">关于我们 |</a>
      <a href="#">业务介绍 |</a>
      <a href="#">加入天堂鸟 |</a>
      <a href="#">帮助中心 |</a>
      <a href="#">网站地图</a>
      <p>@ Copyright 2020 tiantangniao.com 天堂鸟 版权所有 不得转载</p>
      <p>京ICP备11043397号</p>
    </div>
    <!--foot结束-->


  </div>
</template>

<script>
import 'layui-src/dist/css/layui.css';
import Cookies from "js-cookie";
import axios from 'axios/dist/axios.min';
import qs from 'qs/dist/qs.js';
//import {cssdropdown}  from "../../public/js/head.js";
import "../../public/js/tab.js";
//import { foucsbox } from  "../assets/Js/HouseDetailFocus/foucs.js";
import "../assets/Js/My97DatePicker/WdatePicker.js";
import "../assets/Js/HouseTab2.js";
import jm from "@/assets/Js/jiami";

export default {
  name: "houseDetail",
  data(){
    return {
      houseId:this.$route.query.houseId,
      houseForm:'',
      comeDate:'',
      leaveDate:'',
      liveDays:0,
      totalPrice:0,
      orderId:'',
      userId:'',
      userName:jm.jiemi(Cookies.get("userName"))===null?'':jm.jiemi(Cookies.get("userName")),
    }

  },
  mounted() {

    const _this = this;
    _this.userId = Cookies.get('userId');
    alert(_this.userId);
    cssdropdown.startchrome("navMenu");
    foucsbox(2000);
    //alert(_this.houseId);
     //alert(_this.uuid);
       _this.orderId = _this.uuid;
    //根据房间id同步加载房间信息
    axios.post('/api/getRoomById',qs.stringify({"houseId":_this.houseId})).then(function (response){
       const data = response.data;
       console.log(data);
       _this.houseForm = data.data;
    });

    layui.use(['laypage','layer','laydate'],function () {
      var  laypage=layui.laypage,layer=layui.layer;
      var laydate=layui.laydate;
      var date = new Date();
      laydate.render({
        elem:'#comeDate',
        trigger: 'click',
        min:'date',
        done:function (value){  //防止点击提交后文本内消失
          _this.comeDate = value;
        },
        format: 'yyyy-MM-dd' //可任意组合
      });
      laydate.render({
        elem:'#leaveDate',
        trigger: 'click',
        min:'_this.comeDate',
        done:function (value){
          _this.leaveDate = value;
        },
        format: 'yyyy-MM-dd' //可任意组合
      });
    });

    //动态计算时间
  },
  methods:{
    //退出
    tuichu:function(){
      const _this = this;
      /*Cookies.set("userName",'');
      Cookies.set("userPassWord",'');*/
      Cookies.remove("userName");
      Cookies.remove("userPassWord");
      Cookies.remove("userId");
      _this.$router.push('login')
    },

    goOrderList:function (){
      this.$router.push("/orderList");
    },
    //预订异步填写订单表
    goOrder:function (){
      const _this = this;
      _this.liveDays = (new Date(_this.leaveDate) - new Date(_this.comeDate)) / 1000 / 60 / 60 / 24;
      //alert(_this.orderId);
      if(_this.leaveDate <= _this.comeDate){
        alert('日期选择有误');
      }else{
        if(_this.userId == null){
         this.$router.push('/login');
        }else{
          axios.post('/api/toOrder',qs.stringify(
              {"orderId":_this.orderId,"comeDate":_this.comeDate,"leaveDate":_this.leaveDate,
                "liveDays":_this.liveDays,"totalPrice":_this.liveDays * _this.houseForm.HOUSE_PRICE,
                "houseId":_this.houseId,"userId":_this.userId
              })).then(function (response){
            const data = response.data;
            if(data.code == 200){
              //alert('提交成功！');
              _this.$router.push('order?orderId=' + _this.orderId); //跳转订单页面
            }else{
              //alert('失败了');
            }

            //
          });
        }


      }


      }


  },
  computed:{
    liveDays:function (){
      let Days = 0;
      const _this = this;
      if(_this.comeDate != null && _this.leaveDate != null && _this.leaveDate > _this.comeDate) {
        Days = (new Date(this.leaveDate) - new Date(this.comeDate)) / 1000 / 60 / 60 / 24;
      }
      //alert( Days );
      return Days;
    },
    /* 获取订单编号uuid*/
    uuid:function () {
      var s = [];
      var hexDigits = 'abcdef1234567890';
      for (var i = 0; i < 12; i++) {
        s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
      }
      s[14] = '4';
      s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1);
     // s[8] = s[13] = s[18] = s[23] = '-';

      this.uuidA = s.join('');
      console.log(s.join(''), 's.join("")');
      return this.uuidA;
    },
  }

}
</script>

<style scoped src="../assets/css/HouseDetail.css"/>
<style scoped src="../assets/css/HouseDetailfoucs.css"/>
<style scoped src="../assets/css/common/head.css"/>
<style scoped src="../assets/css/common/foot.css"/>
<style scoped src="../assets/css/common/neck.css"/>

<style scoped>
</style>