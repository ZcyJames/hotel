
<template>
    <div>
      <p class="p2"> </p>
      <div id="div0">
        <p class="p1 p2">一起旅居，追寻梦与远方</p>
        <div align="center" style="margin-right: 55px;margin-top: 50px;">
          <input type="button" class="b1 in1" value="注册" @click="servet1();">
          <input type="button" class="b2 in1" value="登录" @click="login();"></div>
      </div>


      <center><div style="width: 430px;height: 445px;background:rgba(255,255,255,0.5);display: none;border-radius:10px"  id="div1">
        <!-- 登录表单-->
        <div id="div2">
          <form class="layui-form" action="" method="post" @submit.prevent>
            <div>
              <label class="layui-form-label"><a href="javascript:void(0)" @click="checkType(0)">帐密登录</a></label>
              <a class="css21" href="javascript:void(0)" @click="checkType(1)">手机号登录</a>
              <a class="css21" href="javascript:void(0)" @click="checkType(2)">忘记密码</a>
            </div>
            <!--帐密登录-->
            <div class="layui-form-item css1" v-if="checkNumber===0">
              <div class="layui-input-inline">
                <input type="text" name="title" required id="usn1" lay-verify="required" placeholder="用户名"
                       v-model="userName" autocomplete="off" class="layui-input">
              </div>
              <div class="layui-input-inline">
                <input type="password" name="password" id="usp1" required lay-verify="required" placeholder="密码"
                       v-model="userPassWord" autocomplete="off" class="layui-input">
              </div>

            </div>
            <!--手机号登录-->
            <div class="layui-form-item css1" v-else-if="checkNumber===1">
              <div class="layui-input-inline">
                <input type="text" name="title" required id="usn4" lay-verify="required" placeholder="请输入手机号"
                       v-model="userPhone" autocomplete="off" class="layui-input">
              </div>
              <div class="layui-input-inline">
                <input type="text" name="password" id="usp4" required lay-verify="required" placeholder="验证码"
                       v-model="yanZhengma" autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux css4"><a class="css2" @click="getCode()">获取验证码</a></div>
            </div>
            <!--手机号登录-->
            <div class="layui-form-item css1" v-else>
              <div class="layui-input-inline">
                <input type="text" name="title" required id="usn5" lay-verify="required" placeholder="请输入手机号"
                       v-model="userPhone" autocomplete="off" class="layui-input">
              </div>
              <div class="layui-input-inline">
                <input type="text" name="password" id="usp5" required lay-verify="required" placeholder="验证码"
                       v-model="yanZhengma" autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux css4"><a class="css2" @click="getCode()">获取验证码</a></div>
              <div class="layui-input-inline">
                <input type="password" name="password" id="usp6" required lay-verify="required" placeholder="输入新密码"
                       v-model="userUpPassWord" autocomplete="off" class="layui-input">
              </div>
            </div>

            <!-- 输入验证提示信息显示在此div中-->
            <div class="layui-form-item">
              <div class="css6"><span class="css7" id="span0"></span></div>
            </div>

            <div class="layui-form-item">
              <div class="layui-form-mid layui-word-aux css5">登录即同意<a class="css3">用户协议</a>和<a class="css3">隐私政策</a></div>
            </div>
            <div class="layui-form-item" v-if="checkNumber===0||checkNumber===1">
              <button class="layui-btn css8" lay-submit lay-filter="formDemo" @click="validate1(checkNumber);">登录</button>
            </div>
            <div class="layui-form-item" v-else>
              <button class="layui-btn css8" lay-submit lay-filter="formDemo" @click="upLoadPsd()">修改密码</button>
            </div>
          </form>
          <div class="layui-form-item">
            <img class="css9" src="../assets/Images/QQ20210118193116.png" />
          </div>
          <div class="layui-form-item css10">
            <div class="css12">
              <ul >
                <li class="css11"><a class="css13" @click="servet();">立即注册</a></li>
                <li class="css14">|</li>
                <li class="css11"><a class="css13">登录遇到问题</a></li>
              </ul>
            </div>
          </div>
        </div>
        <!-- 注册表单-->
        <div id="div3" style="display: none;">
          <form class="layui-form" action="" method="post" @submit.prevent>
            <div><label class="layui-form-label css15">注册</label>
            </div>
            <div class="layui-form-item css1">
              <div class="layui-input-inline">
                <input type="text" name="title" required id="usn2" lay-verify="required" placeholder="用户名"
                       v-model="userNewName" autocomplete="off" class="layui-input" @keyup="do0();">
              </div>
              <div class="layui-input-inline">
                <input type="password" name="password" id="usp2" required lay-verify="required" placeholder="密码"
                       v-model="userNewPassWord" autocomplete="off" class="layui-input" @keyup="do0();">
              </div>
              <div class="layui-input-inline">
                <input type="text" name="title" required id="usn3" lay-verify="required" placeholder="输入手机号"
                       v-model="userNewPhone" autocomplete="off" class="layui-input" @keyup="do1()">
              </div>
              <div class="layui-input-inline">
                <input type="text" name="password" id="usp3" required lay-verify="required" placeholder="验证码"
                       v-model="newYanZhengMa" autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux css4"><a class="css2" @click="getCode()">获取验证码</a></div>
            </div>

            <!-- 输入验证提示信息显示在此div中-->
            <div class="layui-form-item">
              <div class="css6"><span class="css7" id="span1"></span></div>
            </div>

            <div class="layui-form-item">
              <div>
                <input type="checkbox" checked name="" id="check1" lay-skin="primary" />
                <div class="layui-form-mid layui-word-aux css5">我已阅读并同意<a class="css3">用户协议</a>和<a class="css3">隐私政策</a></div>
              </div>
            </div>
            <div class="layui-form-item">
              <button class="layui-btn css8"  lay-submit lay-filter="formDemo" id="btn1" @click="validate2();">注册</button>
            </div>
          </form>
          <div class="layui-form-item css19">
            <div class="css20">
              <ul >
                <li class="css16"><a class="css13" @click="login1();">立即登录</a></li>
              </ul>
            </div>
          </div>
        </div>

      </div></center>


        <!--foot-->
        <div id="foot">
          <a href="javascript:void(0)">关于我们 |</a>
          <a href="javascript:void(0)">业务介绍 |</a>
          <a href="javascript:void(0)">加入旅居 |</a>
          <a href="javascript:void(0)">帮助中心 |</a>
          <a href="javascript:void(0)">网站地图</a>
          <p>@ Copyright 2020 lvju.com 旅居 版权所有 不得转载</p>
          <p>京ICP备11043397号</p>
        </div>
        <!--foot结束-->


      </div>
</template>

<script>
import '../assets/css/Login.css';
import axios from "axios";
import Cookies from "js-cookie";
import Qs from "qs";
import jm from '../assets/Js/jiami.js'

export default {
  name: "login",
  data(){
    return{
      yanZM:'',
      userPhone:Cookies.get("userPhone")==undefined?'':jm.jiemi(Cookies.get("userPhone")),
      yanZhengma:'',
      userName:Cookies.get("userName")==undefined?'':jm.jiemi(Cookies.get("userName")),
      userPassWord:Cookies.get("userPassWord")==undefined?'':jm.jiemi(Cookies.get("userPassWord")),
      userNewPassWord:'',
      userNewName:'',
      userNewPhone:'',
      newYanZhengMa:'',
      checkNumber:0,
      userUpPassWord:''
    }
  },
  mounted() {
  },
  methods: {
    /*登录按钮*/
    login: function () {
      $("#div0").hide();
      $("#div1").show();
    },
    /*登录界面  立即注册按钮*/
    servet: function () {
      $("#div2").hide();
      $("#div3").show();
      $("#span1").html("");
      $("#span0").html("");
      this.userPassWord = "";
      this.userName = ""

    },
    /*注册界面  立即登录按钮*/
    login1: function () {
      $("#div3").hide().removeClass("show");
      $("#div2").show().addClass("show");
      $("#span1").html("");
      $("#span0").html("");
      this.userNewPassWord = "";
      this.userNewName = ""
    },
    /*注册按钮*/
    servet1: function () {
      $("#div0").hide();
      $("#div1").show();
      $("#div2").hide();
      $("#div3").show();
    },
    /* check:function(){
        if(($('#check1').prop('checked'))==true){
            $("#btn1").removeClass("css18");
            $("#btn1").addClass("css8");
        }
        else {
            $("#btn1").removeClass("css8");
            $("#btn1").addClass("css18");
        }
    }, */

    /* 注册验证*/
    //用户名和密码判断
    do0: function () {
      if (this.userNewName.trim() == "" || this.userNewPassWord.trim() == "") {
        $("#span1").html("输入不能为空!");

      } else if (this.userNewName.trim().length > 5 || this.userNewName.trim().length < 2 || this.userNewPassWord.trim().length > 12 || this.userNewPassWord.trim().length < 8) {
        $("#span1").html("大小写字母、数字,用户名(长度2-5),密码(长度8-12)");
      } else {
        $("#span1").html("");
      }

    },
    do1:function (){
      const _this = this;
      let reg = /^1(3[0-9]|4[5,7]|5[0,1,2,3,5,6,7,8,9]|6[2,5,6,7]|7[0,1,7,8]|8[0-9]|9[1,8,9])\d{8}$/;
      if (!reg.test(_this.userNewPhone)){
        $("#span1").html("请输入合法的手机号");
      }else {
        $("#span1").html("");
      }
    },

    /* 选择登录方式*/
    checkType:function (value){
      this.checkNumber=value;
    },

    /* 登录和修改密码获取验证码*/
    getCode:function (){
      const _this = this;
          let reg = /^1(3[0-9]|4[5,7]|5[0,1,2,3,5,6,7,8,9]|6[2,5,6,7]|7[0,1,7,8]|8[0-9]|9[1,8,9])\d{8}$/;
          if(reg.test(_this.userPhone)){
            $("#span0").html("");
            axios.post('/api/phoneMsg', Qs.stringify({
              'phoneNumbers': _this.userPhone,
            })).then(function (response) {
              const data = response.data;
              // console.log(data)
              _this.yanZM=data.data;
              console.log(_this.yanZM)
            })
          }else {
            $("#span0").html("请输入合法的手机号码!");
          }

    },

    /* 注册获取验证码*/
    getCode1:function (){
      const _this = this;
      let reg = /^1(3[0-9]|4[5,7]|5[0,1,2,3,5,6,7,8,9]|6[2,5,6,7]|7[0,1,7,8]|8[0-9]|9[1,8,9])\d{8}$/;
      if(reg.test(_this.userNewPhone)){
        $("#span0").html("");
        axios.post('/api/phoneMsg', Qs.stringify({
          'phoneNumbers': _this.userNewPhone,
        })).then(function (response) {
          const data = response.data;
          // console.log(data)
          _this.yanZM=data.data;
          console.log(_this.yanZM)
        })
      }else {
        $("#span0").html("请输入合法的手机号码!");
      }

    },
    /* 忘记密码  修改密码*/
    upLoadPsd:function (){
      const _this = this;
      /*if (_this.yanZM===_this.yanZhengma&&_this.userUpPassWord.trim()!=null
          &&_this.userUpPassWord.trim()!=''&&_this.userUpPassWord.trim().length>=8&&_this.userUpPassWord.trim().length<=12){
      }else{
        $("#span0").html("请正确输入!");
      }*/
      if (_this.yanZM!=_this.yanZhengma){
        if (_this.userUpPassWord.trim()==null
            ||_this.userUpPassWord.trim()==''
            ||_this.userUpPassWord.trim().length<8
            ||_this.userUpPassWord.trim().length>12){
          alert("请正确输入验证码和密码!")
        }else {
          alert("请正确输入验证码!")
        }
      }else{
        if (_this.userUpPassWord.trim()==null
            ||_this.userUpPassWord.trim()==''
            ||_this.userUpPassWord.trim().length<8
            ||_this.userUpPassWord.trim().length>12){
          alert("请正确输入密码(8-12位)!")
        }else {
          axios.post('/api/upDatePsd',Qs.stringify({
                'userPassWord':_this.userUpPassWord,
                'userPhone':_this.userPhone
              }
          )).then(function (response){
            const data = response.data;
            if (data.code == 200){
              alert("密码修改成功!")
              location.reload();
            }else {
              alert("请先注册！")
            }
          })
        }
      }
    },


    /* 登录提交  axios异步验证*/
    validate1: function (checkNumber) {
      //登录验证
      const _this = this;
      /*const valicode = new TencentCaptcha('2099213336', function (res) {
        if (res.ret === 0) {*/
          /*帐密登录*/
          if(checkNumber===0){
            if (_this.userName.trim() == "" || _this.userPassWord.trim() == "") {
              $("#span0").html("输入不能为空!");

            }else {
              axios.post('/api/loginServlet', Qs.stringify({
                'userName': _this.userName,
                'userPassWord': _this.userPassWord
              })).then(function (response) {
                const data = response.data;
                if (data.code === 200) {
                  Cookies.set("userName", jm.jiami(data.data[0].userName), "2m");
                  Cookies.set("userPassWord", jm.jiami(data.data[0].userPassWord), "2m");
                  Cookies.set("userId",data.data[0].userId);
                  /*$cookies.set("roleResource", data.data.roleId, "2m");*/
                  console.log(data.data[0].userId)
                  _this.$router.push('#/index?userName='+jm.jiami(_this.userName));
                } else {
                  console.log(data.code)
                  $("#span0").html("账号或密码输入错误");
                }
              })
            }
          }
          /* 手机号登录*/
          else {
            if (_this.yanZhengma.trim()===''){
              $("#span0").html("请输入手机号或验证码！");
            }else {
              if (_this.yanZM===_this.yanZhengma){
                axios.post('/api/loginServlet', Qs.stringify({
                  'userPhone': _this.userPhone,
                })).then(function (response) {
                  const data = response.data;
                  console.log(data)
                  // console.log(data)
                  if (data.code == 200) {
                    Cookies.set("userName", jm.jiami(data.data[0].userName), "2m");
                    Cookies.set("userPassWord", jm.jiami(data.data[0].userPassWord), "2m");
                    Cookies.set("userId",data.data[0].userId);
                    /*$cookies.set("roleResource", data.data.roleId, "2m");*/
                    _this.$router.push('#/index?userName='+jm.jiami(data.data[0].userName));
                  } else {
                    console.log(data.code)
                    $("#span0").html("账户不存在");
                  }
                })
              }else {
                $("#span0").html("验证码输入错误,请检查后重新输入");
              }
            }

          }

        /*} else {
          alert("验证出错！");
        }
      });
      valicode.show();
      //console.log(_this.userName);*/

    },

    /* 注册提交 axios异步验证*/
    validate2: function () {
      const _this = this;
      if (_this.yanZM===_this.newYanZhengMa){
        if ($("#span1").text() == "" && _this.userNewName.trim() != "" && _this.userNewPassWord.trim() != "") {

          const valicode = new TencentCaptcha('2099213336', function (res) {
            if (res.ret === 0) {
              axios.post('/api/loginServlet', Qs.stringify({
                'userName': '',
                'userPassWord':'',
                'userPhone':_this.userNewPhone
              })).then(function (response) {
                const data = response.data;
                if (data.code === 402) {
                  axios.post('/api/registerServlet', Qs.stringify({
                    'userName': _this.userNewName,
                    'userPassWord': _this.userNewPassWord,
                    'userPhone':_this.userNewPhone
                  })).then(function (response) {
                    const data = response.data;
                    if (data.code === 200) {
                      Cookies.set("userName", jm.jiami(_this.userNewName), "2m");
                      Cookies.set("userPassWord", jm.jiami(_this.userNewPassWord), "2m");
                      Cookies.set("userPhone", jm.jiami(_this.userPhone), "2m");
                      /*$cookies.set("roleResource", data.data.roleId, "2m");*/
                      /*location.href="index.html";*/
                      location.reload();
                    } else {
                      $("#span1").html("抱歉,注册失败!");
                    }

                  })
                } else {
                  $("#span1").html("用户已存在");
                }
              });
            } else {
              alert("验证出错！");
            }
          });
          valicode.show();

        } else {
          $("#span1").html("抱歉,请正确输入用户名和密码!");
        }
      }else {
        $("#span1").html("请正确输入验证码!");
      }

    },
  }
}
</script>

<style scoped>

</style>