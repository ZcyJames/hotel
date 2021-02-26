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
                            <li><a href="#/CityHouse">三亚</a></li>
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
                <a href="../Home.html">退出</a>
                <div class="username">
                    <a href="../UserInfo/OrderList.html">187****9013</a>
                    <span>您好，</span>
                </div>
            </div>


            <!--面包屑导航-->
<!--            <div class="bread">-->
<!--                <a href="../Home.html">天堂鸟</a>-->
<!--                <span>></span>-->
<!--                <span>三亚住宿</span>-->
<!--            </div>-->

        </div>
        <!--颈部结束-->

        <div class="clear"></div>

        <!--城市宣传图片-->
        <div id="cityimg">
            <img src="../assets/House/images/cityimg/cityimg01.jpg" width="960" height="100" border="0"/>
        </div>

        <!--搜索行-->
<!--        <div id="searchrow">-->
<!--            <table >-->
<!--                <tr>-->
<!--                    <td valign="middle">-->
<!--                        <input name="text" type="text" class="cityinput" id="citySelect1" style="border:0;width:95px;height:25px;padding:0 0 0 2px;" value="" />-->
<!--                    </td>-->
<!--                    <td valign="middle" width="250">-->
<!--                        <input name="text" type="text" class="searcText" style="height:25px;width:200px;border:0;padding:0 0 0 2px;" value="地址、商圈、地标"/>-->
<!--                    </td>-->
<!--                    <td valign="middle" width="35">-->
<!--                        <span class="Q">入住</span>-->
<!--                    </td>-->
<!--                    <td valign="middle" width="120">-->
<!--                        <input name="text2" type="text" class="Wdate" style="border:0;width:100px; height:25px;" onclick="WdatePicker()" />-->
<!--&lt;!&ndash;                        <script type="text/javascript" src="../Js/My97DatePicker/WdatePicker.js"></script>&ndash;&gt;-->
<!--                    </td>-->
<!--                    <td valign="middle" width="35">-->
<!--                        <span class="Q">退房</span>-->
<!--                    </td>-->
<!--                    <td valign="middle" width="120">-->
<!--                        <input name="text2" type="text" class="Wdate" style="border:0;width:100px; height:25px;" onclick="WdatePicker()" />-->
<!--                    </td>-->
<!--                    <td valign="middle" width="35">-->
<!--                        <span class="Q">人数</span>-->
<!--                    </td>-->
<!--                    <td valign="middle" width="120">-->
<!--                        <select class="regularSelect" style="border:0; height:25px;">-->
<!--                            <option value="0" selected="selected" data-skip="1">不限</option>-->
<!--                            <option value="1">1</option>-->
<!--                            <option value="2">2</option>-->
<!--                            <option value="3">3</option>-->
<!--                            <option value="4">4</option>-->
<!--                            <option value="5">5</option>-->
<!--                            <option value="6">6</option>-->
<!--                            <option value="7">7</option>-->
<!--                            <option value="8">8</option>-->
<!--                        </select>-->
<!--                    </td>-->
<!--                    <td valign="middle"><input type="submit" value="立即搜索" id="imserbtn"/></td>-->
<!--                </tr>-->
<!--            </table>-->

<!--        </div>-->
        <!--搜索行结束-->

        <!--细节搜索-->
        <div id="searchdetail">
            <table>
                <tr>
                    <td width="45">
                        <span class="detailtitle">房型：</span>
                    </td>
                  <td class="nubroom">
                    <div class="textbg"><!--加一个背景图片-->
                      <select v-model="houseKind"  class="cityinput" id="citykindindSelect1"
                              style="border:0;background: none transparent scroll repeat 0% 0%;width:180px;height:20px;margin-top:5px;">
                        <option >不限</option>
                        <option>大床房</option>
                        <option>双人床</option>
                      </select>
                    </div>
                  </td>

                </tr>
                <tr>
                    <td>
                        <span class="detailtitle">价格：</span>
                    </td>

                    <td>
                        <span class="mulchoice" style="margin-left: 10px">自定义价格区间：</span>
                        <input v-model="lowPrice" type="number" style="width:40px;"/> - <input v-model="highPrice" type="number" style="width:40px;"/>
                       &nbsp;&nbsp;  <input  type="button" @click="getSanyaHouse();" style="width:40px;height:20px;background-color: #CFEBEE" value="搜索"/>
                    </td>
                </tr>

            </table>

        </div>
        <!--细节搜索结束-->

        <!--‘所有房屋’标题-->
        <div class="subtitle">
            <div class="wad">
                <span class="stitle">所有房屋</span>
            </div>
        </div>
        <!--‘所有房屋’标题结束-->

        <!--排序-->
        <div id="sequence">
        </div>
        <!--排序结束-->

        <!--房屋列表-->
        <div id="House">
            <!--排序方式-->

            <table v-for="(house,index) in cityHouseList" width="960" cellpadding="0" cellspacing="0" id="houseslist">
                <tr height="180">
                    <td width="150" class="trbottom" valign="top">
                        <a href="HouseDetail.html" target="_blank"><img :src="require('../assets/House/images/ordering0'+ (index+1) +'.jpg') "  width="150" height="120" border="0" /></a>						</td>

                    <td width="400" class="trbottom">
                        <div class="roominfo">
                            <p class="namerow"><a :href="'#/houseDetail?houseId=' + house.HOUSE_ID" class="housename" target="_blank">{{ house.HOUSE_NAME }}</a>（<label>{{ house.HOUSE_MARK }}</label>分）</p>
                            <p>
                                <img src="../assets/House/images/star.jpg" width="15" height="15" border="0"/>
                                <img src="../assets/House/images/star.jpg" width="15" height="15" border="0"/>
                                <img src="../assets/House/images/star.jpg" width="15" height="15" border="0"/>
                                <img src="../assets/House/images/star.jpg" width="15" height="15" border="0"/>
                                <img src="../assets/House/images/star.jpg" width="15" height="15" border="0"/>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="#" class="clrgray">12条点评</a>
                                已被预订<label  class="wet">294</label>晚
                                &nbsp;&nbsp;
                                房屋编号：<label class="wet">{{ house.HOUSE_ID }}</label>
                            </p>
                            <p><a href="#" class="convenience1">预订</a>
                                <a href="#" class="convenience2">实拍</a>
                                <a href="#" class="convenience3">可退</a>
                                <a href="#" class="convenience4">优惠</a></p>

                            <div class="clear"></div>

                            <p class="address">{{ house.HOUSE_NAME }}  &nbsp;&nbsp;<a href="#" class="clrblue">[地图]</a></p>
                            <p><label>平层</label> | <label>{{ house.HOUSE_KIND }}</label> | <label>{{ house.HOUSE_AREA }}平米</label> | <label>床数{{ house.HOUSE_BEDNUM}}</label> | <label>推荐入住{{ house.HOUSE_PEOPLE}}人</label> &nbsp;&nbsp;<a href="#" class="clrblue">[哪天有房]</a></p>
                            <p><a href="#" class="clrgray">园景</a>
                                <a href="#" class="clrgray">落地窗</a>
                                <a href="#" class="clrgray">双阳台</a>
                                <a href="#" class="clrgray">中央空调</a></p>

                        </div>						</td>


                    <td align="center" width="100" class="trbottom">
                        <label>-</label>						</td>

                    <td align="center" width="200" class="trbottom">
                        <p class="price">￥<label class="money">{{ house.HOUSE_PRICE}}</label>元/晚</p>
                        <br/>
                        <p><a :href=" '#/houseDetail?houseId=' + house.HOUSE_ID" class="detailbtn" target="_blank">房屋详情</a></p>						</td>
                </tr>


            </table>

            <!--分页-->
            <div v-show="flag1" id="changpage" style="margin-left: 300px" >

                <a href="javascript:void(0)" @click="prePage()" class="pre"> &lt </a>
                <a v-for="(value,index) in totalPage" href="javascript:void(0)" @click="thisPage(index)" class="pagenub">{{index + 1}}</a>
                <a href="javascript:void(0)" @click="nextPage()" class="next"> &gt </a>

            </div>
          <div v-show="flag2"  id="changpage" style="margin-left: 300px" >
         2
            <a href="javascript:void(0)" @click="prePage2()" class="pre"> &lt </a>
            <a v-for="(value,index) in totalPage" href="javascript:void(0)" @click="thisPage2(index)" class="pagenub">{{index + 1}}</a>
            <a href="javascript:void(0)" @click="nextPage2()" class="next"> &gt </a>

          </div>
            <!--分页结束-->

        </div>
        <!--房屋列表结束-->


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
import axios from 'axios/dist/axios.min';
import qs from 'qs/dist/qs.js';
    export default {
      name: "CityHouse",
      data() {
        return {
          cityName: this.$route.query.cityName,
          cityHouseList: '',
          pageNum: 1, //当前页码
          limit: 5,  //分页条数
          // totalPage:'', //总页数
          total: '',//数据总条数
          houseKind: '',
          lowPrice: '',
          highPrice: '',
          flag1: true,
          flag2: false

        }
      },
      mounted() {
        const _this = this;
        axios.post('/api/getCityHouse', qs.stringify({
          "cityName": _this.cityName,
          "pageNum": _this.pageNum,
          "limit": _this.limit
        }))
            .then(function (response) {
              const data = response.data;
              _this.cityHouseList = data.data.houseList;
              console.log(_this.cityHouseList);
              //alert('同步加载条数' + data.data.total);
              _this.total = data.data.total;

            });

      },
      methods: {
        thisPage: function (index) {
          const _this = this;
          _this.pageNum = index + 1;
          // alert( '当前页码:' + _this.pageNum);
          axios.post('/api/getCityHouse', qs.stringify({
            "cityName": _this.cityName,
            "pageNum": _this.pageNum,
            "limit": _this.limit
          }))
              .then(function (response) {
                const data = response.data;
                _this.cityHouseList = data.data.houseList;
                // alert("查询成功");
              });
        },
        prePage: function () {
          const _this = this;
          if (_this.pageNum == 1) {
            alert('已到达首页');
          } else {
            _this.pageNum--;
            axios.post('/api/getCityHouse', qs.stringify({
              "cityName": _this.cityName,
              "pageNum": _this.pageNum,
              "limit": _this.limit
            }))
                .then(function (response) {
                  const data = response.data;
                  _this.cityHouseList = data.data.houseList;
                  //alert("查询成功");
                });
          }

        },

        nextPage: function () {
          const _this = this;
          //alert(_this.pageNum);
          if (_this.pageNum == _this.totalPage) {
            alert('已到达尾页');
          } else {
            _this.pageNum++;
            axios.post('/api/getCityHouse', qs.stringify({
              "cityName": _this.cityName,
              "pageNum": _this.pageNum,
              "limit": _this.limit
            }))
                .then(function (response) {
                  const data = response.data;
                  _this.cityHouseList = data.data.houseList;
                 // alert("查询成功");
                });
          }
        },
        //第二种查询
        thisPage2: function (index) {
          const _this = this;
          _this.pageNum = index + 1;
          // alert( _this.pageNum + '页');
          axios.post('/api/getSanyaHouseByWhere', qs.stringify({
            "cityName": _this.cityName,
            "pageNum": _this.pageNum,
            "limit": _this.limit,
            "houseKind":_this.houseKind
          }))
              .then(function (response) {
                const data = response.data;
                _this.cityHouseList = data.data.houseArray;
                //alert("查询成功");
              });
        },
        prePage2: function () {
          const _this = this;
          if (_this.pageNum == 1) {
            alert('已到达首页');
          } else {
            _this.pageNum--;
           // alert( _this.pageNum-- + '页');
            axios.post('/api/getSanyaHouseByWhere', qs.stringify({
              "cityName": _this.cityName,
              "pageNum": _this.pageNum,
              "limit": _this.limit,
              "houseKind":_this.houseKind
            }))
                .then(function (response) {
                  const data = response.data;
                  _this.cityHouseList = data.data.houseArray;
                  //alert("查询成功");
                });
          }
        },
        nextPage2: function () {
          const _this = this;
          if (_this.pageNum == _this.totalPage) {
            alert('已到达尾页');
          } else {
            _this.pageNum++;
            //alert(_this.pageNum + '页');
            axios.post('/api/getSanyaHouseByWhere', qs.stringify({
              "cityName": _this.cityName,
              "pageNum": _this.pageNum,
              "limit": _this.limit,
              "houseKind":_this.houseKind
            }))
                .then(function (response) {
                  const data = response.data;
                  _this.cityHouseList = data.data.houseArray;
                  //alert("查询成功");
                });
          }
        },

        getSanyaHouse: function () {
          /* houseKind:'',
                lowPrice:'',
                highPrice:'',*/
          const _this = this;
          //alert( _this.lowPrice.trim());
          //如果有条件查询则走第二种查询
          if ( _this.lowPrice.trim().length != 0 || _this.highPrice.trim().length != 0
               || (_this.houseKind.trim().length != 0 &&_this.houseKind.trim() !='不限')
            ) {
            _this.flag1 = false;
            _this.flag2 = true;
            //alert(_this.lowPrice);
            //console.log('最削金额为' + _this.lowPrice.length);
           // alert('走2' + _this.flag2);
            if (_this.lowPrice > _this.highPrice) {
              alert("数据输入有误！");
            } else {
              _this.pageNum = 1;
              axios.post('/api/getSanyaHouseByWhere', qs.stringify({
                'cityName': _this.cityName,
                'houseKind': _this.houseKind,
                'lowPrice': _this.lowPrice,
                'highPrice': _this.highPrice,
                "pageNum": _this.pageNum,
                "limit": _this.limit
              })).then(function (response) {
                const data = response.data;
                console.log(data);
                if (data.code == 200) {
                  _this.cityHouseList = data.data.houseArray;
                  console.log(_this.cityHouseList);
                  _this.total = data.data.total;
                } else {
                  alert('三亚查询失败！');
                }
              });
            }

          } else {//无条件查询走第一种
            _this.flag1 = true;
            _this.flag2 = false;
            _this.pageNum = 1;
            alert("走1" +  _this.flag1);
            axios.post('/api/getCityHouse', qs.stringify({
              "cityName": _this.cityName,
              "pageNum": _this.pageNum,
              "limit": _this.limit
            }))
                .then(function (response) {
                  const data = response.data;
                  _this.cityHouseList = data.data.houseList;
                  console.log(_this.cityHouseList);
                  //alert('同步加载条数' + data.data.total);
                  _this.total = data.data.total;
                });
          }

        }
        },
        computed: {
          totalPage: function () {
            const _this=this;
            if (_this.total <= _this.limit) {
              return 1;
            }
           // alert('动态计算条数:' + _this.total / _this.limit);
            return Math.ceil(_this.total / _this.limit);

          }
        },


    }
</script>

<style scoped src="../assets/css/Home.css"/>
<style scoped src="../assets/css/CityHouseList.css"></style>
<style scoped src="../assets/css/common/head.css"></style>
<style scoped src="../assets/css/common/foot.css"></style>
<style scoped src="../assets/css/common/neck.css"></style>
<style scoped>
#changpage a:hover{
  background-color: #66F4DF;
}
</style>