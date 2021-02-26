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
              <li><a href="#">三亚</a></li>
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
        <a href="../assets/UserInfo/OrderList.html">我的天堂鸟</a>
        <a href="#">退出</a>
        <div class="username">
          <a :href=" '#/orderlist' ">{{ userName }}</a>
          <span>您好，</span>
        </div>
      </div>


    </div>
    <!--颈部结束-->

    <div class="clear"></div>

    <!--填写预定信息、支付定金、入住并点评-->
    <div id="Tradingstep">
      <ul>
        <li class="fillin">填写预定信息</li>
        <li class="payment">支付定金</li>
        <li class="checkincmt">入住并点评</li>
      </ul>
    </div>


    <!--标题-->
    <div class="orderInfo-title">
      <span>房客信息</span>
    </div>
    <!--第一部分，房客信息开始-->
    <div class="GuestInfo">
      <!--左侧，房客信息填写部分-->
      <div class="GuestInfoleft">
        <table>
          <tr height="60">
            <td align="right">
              <span class="remind">*</span><span class="field">姓名：</span>
            </td>
            <td>
              <input type="text" style="background:transparent;border:1px solid  #006666;width:200px;height:30px;-moz-border-radius:5px;-webkit-border-radius:5px;" v-model="ordererName">
            </td>
          </tr>
          <!--<tr height="60">
            &lt;!&ndash;<td align="right">
              <span class="remind">*</span><span class="field">入住人数：</span>
            </td>&ndash;&gt;
            &lt;!&ndash;<td>
              <select data-val="true" id="peoplenub" name="peoplenub" style="background:transparent;border:1px solid  #006666;width:200px;height:30px;-moz-border-radius:5px;-webkit-border-radius:5px;">
                <option selected="selected" value="不限">不限</option>
                <option value="1">1</option>
                <option value="2">2</option>
              </select>
            </td>&ndash;&gt;
          </tr>-->
          <tr height="60">
            <td height="36" align="right">
              <span class="remind">*</span><span class="field">联系手机：</span>					</td>
            <td>
              <input type="text" style="background:transparent;border:1px solid  #006666;width:200px;height:30px;-moz-border-radius:5px;-webkit-border-radius:5px;" v-model="orderPhone"/>
            </td>
          </tr>
          <!--<tr height="60">
            <td align="right">
              <span class="field">E-Mail：</span>
            </td>
            <td>
              <input type="text" style="background:transparent;border:1px solid  #006666;width:200px;height:30px;-moz-border-radius:5px;-webkit-border-radius:5px;"/>
            </td>
          </tr>-->
        </table>
      </div>
      <!--左侧，房客信息填写部分结束-->

      <!--右侧，预定的房屋信息部分-->
      <div class="GuestInforight">
        <a href="../assets/House/HouseDetail.html"><img src="../assets/Images/houseinfoimg.jpg" width="470" height="250" border="0"/></a>

        <!--您预定的房间-->
        <div class="houseintro">

          <p><span class="Q1">您预定的房间：</span><a href="#">{{ roomName }}</a></p>
          <p><span class="Q1">房屋编号：</span>{{ houseId }}</p>
          <p><span class="Q1">地址：</span>{{ roomCity }}</p>
        </div>

      </div>
      <!--右侧，预定的房屋信息部分结束-->

    </div>
    <!--第一部分，房客信息结束-->


    <!--标题-->
    <div class="orderInfo-title">
      <span>订单信息</span>
    </div>
    <!--第二部分，订单信息开始-->
    <div class="OrderInformation">
      <table cellpadding="0" cellspacing="0">
        <tr height="40">
          <td width="200"><span class="tableft">入住日期</span> </td>
          <td><label>{{ orderComeDate }}</label>
            <span>15:00以后办理入住</span> </td>
        </tr>
        <tr height="40">
          <td><span class="tableft">退房日期</span> </td>
          <td><label>{{ orderLeaveDate }}</label>
            <span>12:00以前离店</span> </td>
        </tr>
        <tr height="40">
          <td><span class="tableft">入住天数</span> </td>
          <td><label>{{ orderDay }}</label>
            <span>天</span> </td>
        </tr>
        <tr height="40">
          <td><span class="tableft">原价总金额</span> </td>
          <td><span>￥</span>
            <label>{{ orderMoney }}</label>
          </td>
        </tr>
        <!-- <tr height="40">
           <td><span class="tableft">订单总金额</span> </td>
           <td><span>￥</span>
             <label>930.00</label>
           </td>
         </tr>
         <tr height="40">
           <td><span class="tableft">在线支付定金</span> </td>
           <td><span>￥</span>
             <label>230.00</label>
           </td>
         </tr>-->
      </table>
    </div>
    <!--第二部分，订单信息结束-->

    <!--标题-->
    <div class="orderInfo-title">
      <span>交易规则</span>
    </div>
    <!--第三部分，交易信息开始-->
    <div class="RuleInfo">
      <p>1.确认订单需预付0.00元作为定金。</p>
      <p>2.需15:00之后办理住宿，早到可能需要等待。</p>
      <p>3.房屋保留至07月19日18:00，如不能及时到达，请联系天堂鸟客服。</p>
    </div>
    <!--第三部分，交易信息结束-->
    <div v-if="showImg">
      <img style="width: 200px; height: auto;" :src="require('../assets/Images/pay.jpg')"  />
      <input type="button" @click="changeStatus(),changeOrder()" value="已支付" id="suborderbtn " />
    </div>

    <!--提交订单按钮-->
    <div v-show="orderStatus==0" class="submitorder">
      <input type="button" @click="payOrder()" value="支付订单" id="suborderbtn" />
    </div>
    <div v-show="orderStatus==1" class="submitorder">
      <input type="button" @click="changeOrder()" value="修改订单" id="suborderbtn" />
    </div>
    <!--提交订单按钮结束-->


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
// import $route from "express";
import qs from 'qs/dist/qs.js';
import '../assets/Js/ThemeFocus/jquery-1.9.1.min.js';
import '../assets/Js/ThemeFocus/jquery.nav.js';
import '../../public/js/head.js';
import Cookies from "js-cookie";
import jm from '../assets/Js/jiami.js';

//import '../assets/Js/getUrl.js';
import axios from "axios";
import Index from "@/views/index";


export default {
  name: "order",
  components: {Index},
  data(){
    return{
      userName:'',
      nowUserId:'',
      orderId:'',
      ordererName:'',
      orderPhone:'',
      orderComeDate:'',
      orderLeaveDate:'',
      orderDay:'',
      orderMoney:'',
      houseId:'',
      userId:'',
      roomName:'',
      roomCity:'',
      orderStatus:'',
      showImg:false,
    }
  },
  mounted() {
    const _this = this;
    console.log(this.$route.query.orderId);
    // sessionStorage.setItem("userId","1");
    // sessionStorage.setItem("userName","肖程浩");
    _this.userName = jm.jiemi(Cookies.get("userName"));
    _this.userId = Cookies.get("userId");

    axios.post('/api/detail',qs.stringify({'orderId':_this.$route.query.orderId})).then(
        function (response){
          console.log(response.data);
          _this.houseId = response.data.data.HOUSE_ID;
          _this.orderComeDate = response.data.data.ORDER_COMEDATE;
          _this.orderId = response.data.data.ORDER_ID;
          _this.orderLeaveDate = response.data.data.ORDER_LEAVEDATE;
          _this.orderDay = response.data.data.ORDER_LIVEDAYS;
          _this.orderMoney = response.data.data.ORDER_TOTALPRICE;
          _this.userId = response.data.data.USER_ID;
          _this.ordererName = response.data.data.USER_NAME;
          _this.orderPhone = response.data.data.USER_PHONE;
          _this.roomName = response.data.data.HOUSE_NAME;
          _this.roomCity = response.data.data.HOUSE_CITY;
          _this.orderStatus = response.data.data.ORDER_STATUS;

          // alert(_this.nowUserId+"比较"+_this.userId);
          // if (_this.nowUserId != _this.userId){
          //   alert("登录信息不匹配");
          //   _this.$router.push({path: '/index'});
          // }
        }
    )
  },
  methods:{
    changeStatus:function (){
      const _this = this;
      // alert(_this.orderId);
      axios.post("/api/changeStatusWhat",qs.stringify({"orderId":_this.orderId})).then(
          function (response){
            if(response.data.data == 1){
              alert("支付成功");
            }else {
              alert("支付失败");
            }

            window.location.reload();
          }
      )
    },
    payOrder:function (){
      this.showImg = !this.showImg;
    },
    changeOrder:function (){
      const _this = this;
      // alert(_this.ordererName+_this.orderPhone);
      axios.post("/api/changeInfo",qs.stringify({"orderId":_this.orderId,"odererName":_this.ordererName,"orderPhone":_this.orderPhone})).then(
          function (response){
            console.log(response.data.data);
            if (response.data.data == 1){
              alert("修改成功");
            }else {
              alert("修改失败");
            }
            window.location.reload();
          }
      )
    }
  }
}
</script>


<style scoped src="../assets/css/OrderInfo.css"/>
<style scoped src="../assets/css/common/head.css"/>
<style scoped src="../assets/css/common/foot.css"/>
<style scoped src="../assets/css/common/neck.css"/>
