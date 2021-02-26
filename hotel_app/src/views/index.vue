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
                <li><a href="Theme/TravelGuide.html" rel='dropmenu4'>旅游指南</a></li>
            </ul>
<!--            <div class="attention">-->
<!--                <a href="#" class="atnimg"><img src="../assets/Common/images/attention.jpg" width="70" height="25" border="0"/></a>-->
<!--            </div>-->
            <!--手动搜索-->
<!--            <div class="search" valign="middle">-->

<!--                &lt;!&ndash;下拉框&ndash;&gt;-->
<!--                <div class="selectBox">-->
<!--                    <input type="text" class="cityinput" id="citySelect" value="城市名" style="border:0;background: none transparent scroll repeat 0% 0%;width:95px;height:20px;">-->

<!--                </div>-->

<!--                <input name="text" type="text" class="searcText" style="border:0;background: none transparent scroll repeat 0% 0%;width:130px;height:20px;margin:10px 0 0 2px;float:left;"/>-->
<!--                <div class="searcher">-->
<!--                    <a href="#"><img src="../assets/Common/images/searcher.jpg" width="20" height="20" border="0"/></a>-->
<!--                </div>-->
<!--            </div>-->
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
                            <li><a href="#/CityHouse?cityName=三亚" target="_blank">三亚</a></li>
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
            <li><a href="Theme/SpecialTopic.html" target="_blank">海滨漫步</a></li>
            <li><a href="#">休闲时光</a></li>
            <li><a href="#">极致体验</a></li>
            <li><a href="#">赏花踏青</a></li>
        </ul>
        <ul id="dropmenu3" class="dropMenu">
            <li><a href="#">浪漫之旅</a></li>
            <li><a href="#">家庭出游</a></li>
            <li><a href="#">朋友聚会</a></li>
        </ul>


       <!-- <script type="text/javascript">cssdropdown.startchrome("navMenu")</script>-->
        <!--top 头部结束-->


        <!--banner焦点图内部-->
        <div id="focus">
            <div id="inner">
                <div class="hot-event">
                    <!--登录注册行-->
                    <div class="link">
                        <a href="javascript:void(0)">手机客户端</a>
                        <a href="javascript:void(0)">在线客服</a>
                        <!--	<a href="UserInfo/OrderList.html">我的天堂鸟</a>-->
                        <a v-if="userName===''||userName===null||userName===undefined"  href="#/login" @click="">注册</a>
                        <a v-else  href="javascript:void(0)" @click="tuichu()">退出</a>

                        <a v-if="userName===''||userName===null||userName===undefined" href="#/login" @click="">登录</a>
                        <div v-else>
                          <a href="javascript:void(0)" @click="goOrderList()">{{ userName }}</a>
                          <p style="margin-left: 90px;padding-top: 5px;font-size: 16px">您好!</p>
                        </div>
                        <!--<a href="../index.html">退出</a>
                        <div class="username">
                            <a href="UserInfo/OrderList.html">187****9013</a>
                            <span>您好，</span>
                        </div>-->
                    </div>

                    <!--浮动在焦点图上的搜索-->
                    <div class="searching">
                        <table>
                            <tr height="40">
                                <td align="right" width="100">
                                    <span class="q1">目的地</span>	</td>
                                <td width="20">						</td>
                                <td width="258" align="left">
                                    <!--下拉框-->
                                    <div class="selectBox2">
                                        <div class="textbg"><!--加一个背景图片-->
                                            <select class="textbg" v-model="destinationCity"
                                                   style="border:0;background: none transparent scroll repeat 0% 0%;width:180px;height:20px;margin-top:5px;">
                                              <option>武汉</option>
                                              <option>上海</option>
                                              <option>三亚</option>
                                            </select>

                                        </div>
                                    </div>
                                </td>
                            </tr>

                          <tr height="40">
                            <td align="right">
                              <span class="q1">房间类型</span>
                            </td>
                            <td width="20"></td>

                            <!--                                <td class="nubroom">-->
                            <!--                                    <a href="#"  class="nubroom1">一室</a>-->
                            <!--                                    <a href="#" class="nubroom2">二室</a>-->
                            <!--                                    <a href="#" class="nubroom3">三室</a>-->
                            <!--                                    <a href="#" class="nubroom4">不限</a>-->
                            <!--                                </td>-->

                            <td class="nubroom">
                              <div class="textbg"><!--加一个背景图片-->
                                <select v-model="roomKind"  class="cityinput" id="citykindindSelect1"
                                        style="border:0;background: none transparent scroll repeat 0% 0%;width:180px;height:20px;margin-top:5px;">
                                  <option >不限</option>
                                  <option>大床房</option>
                                  <option>双人床</option>
                                </select>
                              </div>
                            </td>

                          </tr>

                            <tr height="40">
                                <td align="right">
                                    <span class="q1">入住日期</span>
                                </td>

                                <td width="20"></td>
                                <td valign="middle">
                                    <div class="textbg">
                                        <input v-model="comeDate" name="text2"  class="Wdate"
                                               style="border:0;background: none transparent scroll repeat 0% 0%;width:180px;height:20px;margin-top:5px;"
                                               type="text" id="comeDate" />
                                    </div>
                                </td>
                            </tr>
                            <tr height="40">
                                <td align="right">
                                    <span class="q1">退房日期</span>
                                </td>
                                <td width="20"></td>
                                <td>
                                    <div class="textbg">
                                        <input v-model="leaveDate" id="leaveDate" name="text2"  class="Wdate" style="border:0;background: none transparent scroll repeat 0% 0%;width:180px;height:20px;margin-top:5px;"
                                               type="text" />
                                    </div>
                                </td>
                            </tr>


                            <tr align="center" height="50">
                                <td colspan="3">
                                    <input type="button" value="搜索" id="btn" @click="search();"/>
                                </td>
                            </tr>
                        </table>
                    </div>


                    <div class="switch-nav">
                        <a href="#" onclick="return false;" class="prev">
                        <i class="ico i-prev"></i>
                        <span class="hide-clip">上一个</span>
                        </a>
                        <a href="#" onclick="return false;" class="next">
                            <i class="ico i-next"></i><span class="hide-clip">下一个</span></a>
                    </div>
                    <div class="event-item" style="display: block;">
                        <span class="event-item" style="display: block;">
                            <a href="#" class="banner">
                                <img src="../assets/Images/focus/banner01.jpg" class="photo" style="width: 960px; height: 350px;" />
                            </a></span></div>
                    <div class="event-item" style="display: none;">
                        <a href="#" class="banner">
                            <img src="../assets/Images/focus/banner02.jpg" class="photo" style="width: 960px; height: 350px;"/>
                        </a>
                    </div>
                    <div class="event-item" style="display: none;">
                        <a href="#" class="banner">
                            <img src="../assets/Images/focus/banner03.jpg" class="photo" style="width: 960px; height: 350px;"  />
                        </a>
                    </div>
                    <div class="event-item" style="display: none;">
                        <a href="#" class="banner">
                            <img src="../assets/Images/focus/banner04.jpg" class="photo" style="width: 960px; height: 350px;" />
                        </a>
                    </div>
                    <div class="event-item" style="display: none;">
                        <a href="#" class="banner">
                            <img src="../assets/Images/focus/banner05.jpg" class="photo" style="width: 960px; height: 350px;" />
                        </a>
                    </div>
                    <div class="switch-tab">
                        <a href="#" onclick="return false;" class="current">1</a>
                        <a href="#" onclick="return false;">2</a>
                        <a href="#" onclick="return false;">3</a>
                        <a href="#" onclick="return false;">4</a>
                        <a href="#" onclick="return false;">5</a>
                    </div>
                </div>
            </div>
        </div>
        <!--banner焦点图内部结束-->

        <!--热门城市-->
        <div id="hotcity">
            <!--标题栏-->
            <div class="title">
                <span class="titlename1">热门城市</span>
            </div>

            <!--热门城市左侧-->
            <div class="hotcityleft">
                <!--map地图-->
                <div class="map">
                    <img src="../assets/Images/rmdcity/rmdcity01.jpg" width="470" height="380" border="0"/>
                </div>

                <!--top城市-->
                <div class="Topcity">
                    <span class="topct">Top城市：</span>
                    1.<a href="#">上海 </a>
                    2.<a href="#">武汉 </a>


                </div>
            </div>

            <!--map地图右侧-->
            <div class="citydetial">
                <!--城市图片-->
                <div class="citydetialimg">
                    <a href="#"><img src="../assets/Images/citydetial/citydetial01.jpg" width="150" height="100" border="0"/></a>
                </div>

                <!--城市简介-->
                <div class="textdetail">
                    <p><a class="cityname">{{ cityForm.CITY_NAME}}</a>,
                     {{ cityForm.CITY_DESCRIBE }}</p>
                </div>

                <!--城市著名景点-->
<!--                <div class="attraction">-->
<!--                    <a href="#">徐家汇</a>-->
<!--                    <a href="#">陆家嘴</a>-->
<!--                    <a href="#">中山公园</a>-->
<!--                    <a href="#">人民广场</a>-->
<!--                </div>-->

                <div class="clear"></div>

                <!--房屋关注率排行-->
                <div class="attentionrate">
                    <span class="textatnrate">附近房屋推荐：</span>
                    <table v-for="(value, index) in roomForm">
                        <tr height="30">
                            <td width="20">
                                {{index + 1}}.
                            </td>
                            <td>
                                <a :href=" '#/houseDetail?houseId=' + value.HOUSE_ID">{{value.HOUSE_NAME}}</a>
                            </td>
                            <td width="120">
                                <span class="city-nubroom">{{value.HOUSE_KIND}}</span>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </div>
        <!--热门城市结束-->

        <!--特色推荐-->
        <div id="recommend">
            <!--标题栏-->
            <div class="title">
                <span class="titlename2">特色推荐</span>
            </div>

            <!--推荐地点-->
            <div class="rmdcity">
                <a href="#/houseDetail?" class="rightpitch"><img src="../assets/Images/rmdcity/rmdcity01.jpg" width="234" height="160" border="0"/></a>
                <a href="#" class="rightpitch"><img src="../assets/Images/rmdcity/rmdcity03.jpg" width="234" height="160" border="0"/></a>
                <a href="#" class="rightpitch"><img src="../assets/Images/rmdcity/rmdcity02.jpg" width="234" height="160" border="0"/></a>
                <a href="#"><img src="../assets/Images/rmdcity/rmdcity04.jpg" width="234" height="160" border="0"/></a>
            </div>

        </div>
        <!--特色推荐结束-->

        <!--广告语-->
        <div id="slogan">
            <div id="slogan1">
                <div class="sloganimg">
                    <a href="#"><img src="../assets/Images/sloganimg1.jpg" width="40" height="40" border="0"/></a>
                </div>
                <div class="textslogan">
                    <a href="#">100%真实房源</a>
                    <p>专业验证员实地验真，确保每一套房屋真实有效。</p>
                </div>
            </div>
            <div class = "slogan1">
                <div class="sloganimg">
                    <a href="#"><img src="../assets/Images/sloganimg2.jpg" width="40" height="40" border="0"/></a>
                </div>
                <div class="textslogan">
                    <a href="#">特色房屋，性价比高</a>
                    <p>配备家电，可洗衣做饭的一居、多居房全面满足各种需求。</p>
                </div>
            </div>
            <div class="slogan1">
                <div class="sloganimg">
                    <a href="#"><img src="../assets/Images/sloganimg3.jpg" width="40" height="40" border="0" /></a>
                </div>
                <div class="textslogan">
                    <a href="#">到店无房，赔付首晚</a>
                    <p>预订成功到店无房赔付首晚房费，1000万保障基金先行赔付。</p>
                </div>
            </div>
            <div class="slogan2">
                <div class="sloganimg">
                    <a href="#"><img src="../assets/Images/sloganimg4.jpg" width="40" height="40" border="0"/></a>
                </div>
                <div class="textslogan">
                    <a href="#">7×24小时服务专线</a>
                    <p>400客服专线随时解答处理任何问题。</p>
                </div>
            </div>
        </div>
        <!--广告语结束-->

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

    import axios from 'axios/dist/axios.min';
    import qs from 'qs/dist/qs.js';
    // import {cssdropdown1} from '../../public/js/head.js';
   // import '../assets/Js/My97DatePicker/WdatePicker.js';
    import '../assets/Js/ThemeFocus/jquery-1.9.1.min.js';
    import '../assets/Js/ThemeFocus/jquery.nav.js';
    import 'layui-src/dist/css/layui.css';
    import Cookies from "js-cookie";
    import jm from '../assets/Js/jiami.js'
    //import '../assets/Js/DestinationSearch/citySelector.js';
    // $('#inner').nav({ t: 3000, a: 1000 });
    // var test=new Vcity.CitySelector({input:'citySelect'});
    // var test2=new Vcity.CitySelector({input:'citySelect1'});

    export default {
        name: "index",
        data(){
            return{
              comeDate:'',
              leaveDate:'',
              destinationCity:'武汉',
              roomKind:'',
              cityForm:'',  //城市信息
              roomForm:'', //酒店信息
              userName:Cookies.get("userName")==null?'':jm.jiemi(Cookies.get("userName")),

            }
        },
        mounted() {
          const _this=this;
          $('#inner').nav({ t: 3000, a: 1000 });
          //alert(cssdropdown1());
         cssdropdown.startchrome("navMenu");

          layui.use(['laypage','layer','laydate'],function () {
            var  laypage=layui.laypage,layer=layui.layer;
            var laydate=layui.laydate;
            laydate.render({
              elem:'#comeDate',
              trigger: 'click',
              max:0,
              done:function (value){  //防止点击提交后文本内消失
                _this.comeDate = value;
              },
              format: 'yyyy-MM-dd' //可任意组合
            });
            laydate.render({
              elem:'#leaveDate',
              trigger: 'click',
              max:0,
              done:function (value){
                _this.leaveDate = value;
              },
              format: 'yyyy-MM-dd' //可任意组合
            });
          });

          //   axios.post('/api/test',qs.stringify({"userName":"张三"})).then(function (response) {
          //       const data = response.data;
          //       console.log(data);
          //
          //
          //   });

          //同步加载当前城市
          axios.post('/api/getCity',qs.stringify({"cityName":_this.destinationCity})).then(function (response){
            const data = response.data;
            console.log(data);
            _this.cityForm = data.data;
          });
          //同步加载当前城市热门酒店信息
          axios.post('/api/getRooms',qs.stringify({"cityName":_this.destinationCity})).then(function (response){
            const data = response.data;
            _this.roomForm = data.data;
            //console.log(data);
          });


        },

      methods:{
        goOrderList:function (){
          this.$router.push("/orderList");
        },
          //根据搜索条件异步加载城市数据
        search:function (){
          const _this = this;
          //alert(_this.destinationCity);

          //单条件查询
          if(_this.roomKind == '' || _this.roomKind == null) {
            //获取城市信息
            axios.post('/api/getCity', qs.stringify({"cityName": _this.destinationCity})).then(function (response) {
              const data = response.data;
              _this.cityForm = data.data;
            });

            //获取酒店信息
            axios.post('/api/getRooms', qs.stringify({"cityName": _this.destinationCity})).then(function (response) {
              const data = response.data;
              _this.roomForm = data.data;
              //console.log(data);
            });
          }else{  //双条件查询
            axios.post('/api/getCity', qs.stringify({"cityName": _this.destinationCity})).then(function (response) {
              const data = response.data;
              _this.cityForm = data.data;
            });

            //查询房间类型
            axios.post('/api/getSpecialRooms',qs.stringify({"cityName": _this.destinationCity,"roomKind":_this.roomKind})).then(
                function (response){
                  const data = response.data;
                  _this.roomForm = data.data;
                 // console.log(data);

                }
            );
          }
        },

        //退出登录
        tuichu:function(){
          const _this = this;
          /*Cookies.set("userName",'');
          Cookies.set("userPassWord",'');*/
          Cookies.remove("userName");
          Cookies.remove("userPassWord");
          Cookies.remove("userId");
          _this.$router.push('login')
        }



      }
    }


</script>


<style scoped src="../assets/css/Home.css"/>
<style scoped src="../assets/css/common/head.css"/>
<style scoped src="../assets/css/common/foot.css"/>
<style scoped src="../assets/Js/My97DatePicker/skin/WdatePicker.css"/>
<style scoped>

</style>