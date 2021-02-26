import { createRouter, createWebHashHistory } from 'vue-router'
//import Home from '../views/Home.vue'



const routes = [
  {
    path:'/',
    redirect:'/index'  //如果访问项目根路径，重定向首页
  },
  {    //前端url 跳转链接
    path:'/index',
    name:'index',             //指向具体真实的网页组件
    component: () => import('../views/index.vue')
  },
  {
    path:'/houseDetail',
    name:'houseDetail',
    meta:{
      title:'房间详情'
    },
    component:()=> import('../views/houseDetail.vue')
  },
  {
    path:'/order',
    name:'order',
    meta:{
      title:'支付页面'
    },
    component:()=> import('../views/Order.vue')
  },
  {
    path:'/CityHouse',
    name:'CityHouse',
    meta:{
      title:'三亚住宿'
    },
    component:()=> import('../views/CityHouse.vue')
  },
  {
    path: '/OrderList',
    name: 'OrderList',
    meta: {
      title: '订单页'
    },
    component:()=> import('../views/OrderList.vue')
  },
  ,
  {    //前端url 跳转链接
    path:'/login',
    name:'login',             //指向具体真实的网页组件
    component: () => import('../views/login.vue')
  },





]

// const routes = [
//   {
//     path: '/',
//     name: 'Home',
//     component: Home
//   },
//   {
//     path: '/about',
//     name: 'About',
//     // route level code-splitting
//     // this generates a separate chunk (about.[hash].js) for this route
//     // which is lazy-loaded when the route is visited.
//     component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
//   }
// ]



/*
跳转路由，指向配置
后面的一些默认代码就不能删除了，不然路由切换组件会崩溃
 */
const router = createRouter({
  history: createWebHashHistory(),
  routes
})

router.beforeEach((to, from, next) =>{
  if(to.meta.title){
    document.title = to.meta.title;
  }
  next()
})

export default router
