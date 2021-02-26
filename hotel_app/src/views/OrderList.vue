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
              <li><a href="../assets/House/CityHouse.html">三亚</a></li>
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


<!--    <script type="text/javascript">cssdropdown.startchrome("navMenu")</script>-->
    <!--top 头部结束-->

    <!--颈部-->
    <div id="neck">
      <!--登录注册行-->
      <div class="link">
        <a href="#">手机客户端</a>
        <a href="#">在线客服</a>
        <a href="#">我的天堂鸟</a>
        <a href="index.vue">退出</a>
        <div class="username">
          <a href="#">{{ userName }}</a>
          <span>您好，</span>
        </div>
      </div>

      <!--面包屑导航-->
      <div class="bread">
        <a href="index.vue">天堂鸟</a>
        <span>></span>
        <span>我的订单</span>
      </div>

    </div>
    <!--颈部结束-->

    <div class="clear"></div>


    <!--头部以下，内容部分-->
    <div id="content">
      <!--左侧-->
      <div id="left">
        <!--用户基本信息-->
        <div class="User">
          <ul>
            <li><label>{{ userName }}</label></li>
            <li><span>积分：</span><label>500</label></li>
            <li><a href="../assets/UserInfo/PersonalInfo.html">修改个人资料</a></li>
          </ul>
        </div>

        <!--我的订单-->
        <div class="MyOrders">
          <div class="title">
            <span class="titlename">我的订单</span>
          </div>
          <div class="OrderOption">
            <ul>
              <li><a href="../assets/UserInfo/OrderList.html">订单管理</a></li>
              <li><a href="../assets/UserInfo/ReviewManagement.html">点评管理</a></li>
            </ul>
          </div>
        </div>

        <!--个人中心-->
        <div class="PersonalCenter">
          <div class="title">
            <span class="titlename">个人中心</span>
          </div>
          <div class="personalOption">
            <ul>
              <li><a href="../assets/UserInfo/PersonalInfo.html">个人资料</a></li>
              <li><a href="../assets/UserInfo/AccountBalance.html">账户余额</a></li>
              <li><a href="../assets/UserInfo/AccountReceivable.html">收款账号</a></li>
              <li><a href="../assets/UserInfo/MyPoints.html">我的积分</a></li>
              <li><a href="../assets/UserInfo/MyTickets.html">我的券票</a></li>
              <li><a href="../assets/UserInfo/ModifyPassword.html">修改密码</a></li>
              <li><a href="../assets/UserInfo/MemberClub.html">会员俱乐部</a></li>
              <li><a href="../assets/UserInfo/FriendsRebate.html">好友返利</a></li>
            </ul>
          </div>
        </div>

        <!--消息与通知-->
        <div class="mges-notice">
          <div class="title">
            <span class="titlename">消息与通知</span>
          </div>
          <div class="OrderOption">
            <ul>
              <li><a href="../assets/UserInfo/Notification.html">通知</a></li>
              <li><a href="../assets/UserInfo/News.html">消息</a></li>
            </ul>
          </div>
        </div>


      </div>
      <!--左侧结束-->

      <!--右侧-->
      <div id="right">
        <div class="right-title">
          <span class="rtitle">我的订单</span>
        </div>

        <div class="subtitle">
          <div class="wad">
            <span class="stitle">国内订单</span>
          </div>
        </div>

        <!--全部订单、未付款订单radio选项卡-->
        <div class="radiochoose">
          <!--radio选项-->
          <div class="bankinfo">
            <ul class="choosebank">
<!--              <li class="cur" id="ban1"><input type="radio" checked="checked" class="radiobtn" value="" id="bank1" name="1" />&nbsp;&nbsp;<span>全部订单</span></li>-->
<!--              <li id="ban2"><input type="radio" class="radiobtn" value="" id="bank2" name="1" />&nbsp;&nbsp;<span>未付款订单</span></li>-->
            </ul>
            <div class="clear"></div>
          </div>
          <!--radio选项结束-->

          <!--radio选项卡下面的内容-->
          <div class="bankbox" align="center">
            <!--选项卡，第一个radio全部订单下面的内容-->
            <div class="bankcon">
              <table width="770" cellpadding="0" cellspacing="0" v-for="(order,i) in orderList">
                <tr height="30" class="trbg">
                  <td colspan="4" height="30">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <span>订单号：<label>{{order.ORDER_ID}}</label></span>&nbsp;&nbsp;&nbsp;&nbsp;
                    <span>订单时间：<label>2021年2月26日</label></span>
                  </td>
                  <td align="center">
                    <a :href="'#/Order?orderId='+ order.ORDER_ID">查看订单详情>></a>
                  </td>
                </tr>
                <tr height="120">
                  <td width="128" class="tdborder">
                    <a href="#"><img src="../assets/UserInfo/images/ordering01.jpg" width="120" height="80" border="0" /></a>								</td>
                  <td width="279" align="left" class="tdborder">
                    <p><a :href=" '#/houseDetail?houseId=' + order.HOUSE_ID" class="roomtitle">{{order.HOUSE_NAME}}【{{order.HOUSE_CITY}}】</a></p>
                    <p>入住：<label>{{ order.ORDER_COMEDATE }}</label> </p>
                    <p>退房：<label>{{order.ORDER_LEAVEDATE}}</label></p>
<!--                    <p>管理公司：<a href="#">芒果假日酒店公寓</a></p>-->

                  </td>
                  <td width="120" align="left" class="tdborder">
                    <p>总房费：<label class="money">￥{{order.ORDER_TOTALPRICE}}</label></p>
<!--                    <p>定金：<label class="money">￥267.00</label></p>-->
                  </td>
                  <td width="100" align="left" class="tdborder">
                    <p>订单状态：</p>
                    <p><label v-show="order.ORDER_STATUS == -1" class="status">订单已取消</label></p>
                    <p><label v-show="order.ORDER_STATUS == 0" class="status">等待支付</label></p>
                    <p><label v-show="order.ORDER_STATUS == 1" class="status">订单已支付</label></p>
<!--                    <p><label class="status">等待支付定金</label></p>-->
                  </td>
                  <td width="140" align="center" class="tdborder">
                    <p v-if="order.ORDER_STATUS != -1"><a href="javascript:void(0)" @click="cancelOrder(i);">取消订单</a></p>
                    <p v-if="order.ORDER_STATUS == 0" class="pay"><input type="button" @click="goPay(i)" value="立即支付" id="impaybtn"/></p>
                  </td>
                </tr>
<!--                <tr height="30" class="trbg">-->
<!--                  <td colspan="4" height="30">-->
<!--                    &nbsp;&nbsp;&nbsp;&nbsp;-->
<!--                    <span>订单号：<label>MN54250333</label></span>&nbsp;&nbsp;&nbsp;&nbsp;-->
<!--                    <span>订单时间：<label>2020年8月1日</label></span>-->
<!--                  </td>-->
<!--                  <td align="center">-->
<!--                    <a href="../assets/UserInfo/OrderDetail.html">查看订单详情>></a>-->
<!--                  </td>-->
<!--                </tr>-->
<!--                <tr height="120">-->
<!--                  <td width="128" class="tdborder">-->
<!--                    <a href="#"><img src="../assets/UserInfo/images/ordering01.jpg" width="120" height="80" border="0" /></a>								</td>-->
<!--                  <td width="279" align="left" class="tdborder">-->
<!--                    <p><a href="#" class="roomtitle">阳光酒店公寓独立阳台【三亚】</a></p>-->
<!--                    <p>入住：<label>2020-08-03</label> </p>-->
<!--                    <p>退房：<label>2020-08-10</label></p>-->
<!--&lt;!&ndash;                    <p>管理公司：<a href="#">阳光酒店公寓</a></p>&ndash;&gt;-->

<!--                  </td>-->
<!--                  <td width="120" align="left" class="tdborder">-->
<!--                    <p>总房费：<label class="money">￥600.00</label></p>-->
<!--&lt;!&ndash;                    <p>定金：<label class="money">￥300.00</label></p>&ndash;&gt;-->
<!--                  </td>-->
<!--                  <td width="100" align="left" class="tdborder">-->
<!--                    <p>订单状态：</p>-->
<!--                    <p>-->
<!--                      <label class="status">取消</label>-->
<!--                    </p>-->
<!--                  </td>-->
<!--                  <td width="140" align="center" class="tdborder">-->

<!--                  </td>-->
<!--                </tr>-->
              </table>
            </div>
            <!--选项卡，第一个radio全部订单下面的内容结束-->

            <!--选项卡，第二个radio未付款订单下面的内容-->
            <div style="display:none;" class="bankcon">
              <table width="770" cellpadding="0" cellspacing="0">
                <tr height="30" class="trbg">
                  <td colspan="4" height="30">
                    <span>订单号：<label>MN54250232</label></span>&nbsp;&nbsp;&nbsp;&nbsp;
                    <span>订单时间：<label>2020年7月27日</label></span>
                  </td>
                  <td align="center">
                    <a href="#">查看订单详情>></a>
                  </td>
                </tr>
                <tr height="120">
                  <td width="128">
                    <a href="#"><img src="../assets/UserInfo/images/ordering01.jpg" width="120" height="80" border="0" /></a>								</td>
                  <td width="279" align="left" class="roominfo">
                    <p><a href="#" class="roomtitle">芒果假日酒店公寓二室一厅【北京】</a></p>
                    <p>入住：<label>2020-07-31</label> </p>
                    <p>退房：<label>2020-08-10</label></p>
<!--                    <p>管理公司：<a href="#">芒果假日酒店公寓</a></p>-->

                  </td>
                  <td width="120" align="left">
                    <p>总房费：<label class="money">￥534.00</label></p>
<!--                    <p>定金：<label class="money">￥267.00</label></p>-->
                  </td>
                  <td width="100" align="left">
                    <p>订单状态：</p>
                    <p><label class="status">等待支付定金</label></p>
                  </td>
                  <td width="140" align="center">
                    <p><a href="#">取消订单</a></p>
                    <p class="pay"><input type="submit" value="立即支付" id="impaybtn2"/></p>
                  </td>
                </tr>

              </table>
            </div>
            <!--选项卡，第二个radio未付款订单下面的内容结束-->

          </div>
          <!--radio选项卡下面的内容结束-->
        </div>
        <!--全部订单、未付款订单radio选项卡结束-->


      </div>
      <!--右侧结束-->

    </div>
    <!--头部以下，内容部分结束-->

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
import qs from 'qs/dist/qs.js';
import '../assets/Js/ThemeFocus/jquery-1.9.1.min.js';
import '../assets/Js/ThemeFocus/jquery.nav.js';
import jm from '../assets/Js/jiami.js';
import Cookies from "js-cookie";
// import '../../public/js/head.js';
// import '../../public/js/radio.js';
//import '../assets/Js/getUrl.js';
import axios from "axios";
export default {
  name: "OrderList",
  data(){
    return{
      orderList:[],
      userName:'',
      userId:'',
    }
  },
  mounted() {
    const _this = this;
    cssdropdown.startchrome("navMenu");
    // sessionStorage.setItem("userName","肖程浩");
    // sessionStorage.setItem("userId","1");
    _this.userName = jm.jiemi(Cookies.get("userName"));
    _this.userId = Cookies.get("userId");
    axios.post("/api/getOrderList",qs.stringify({"userId": _this.userId})).then(
        function (response){
          console.log(response.data);
          _this.orderList=response.data.data;
          console.log(_this.orderList);
        }
    )

  },
  methods:{

    cancelOrder: function (a){
      const _this = this;
      let r = confirm("亲，您确定取消该订单吗？");
      // alert(_this.orderList[a].ORDER_ID);
      if (r == true) {
        // this.$router.push({path: '/login?url=' + this.$route.path});
        // this.$router.push({path: 'OrderList'});
        axios.post("/api/cancelOrder",qs.stringify({"orderId":_this.orderList[a].ORDER_ID})).then(
            function (response){
                alert(response.data);
                if (response.data.code==200){
                  alert("已取消");
                }else {
                  alert("取消失败，请联系客服");
                }
            }
        )
        window.location.reload();
      }

    },
    goPay:function (a){
      this.$router.push("'#/Order?orderId="+this.orderList[a].ORDER_ID);
    }
  },

}
</script>

<style scoped src="../assets/css/OrderList.css"/>
<style scoped src="../assets/css/common/head.css"/>
<style scoped src="../assets/css/common/foot.css"/>
<style scoped src="../assets/css/common/UserInfoLeft.css"/>
<style scoped src="../assets/css/common/neck.css"/>

<style scoped>

</style>