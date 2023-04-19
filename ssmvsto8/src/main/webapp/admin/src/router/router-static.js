import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xuesheng from '@/views/modules/xuesheng/list'
    import ziyuangoumai from '@/views/modules/ziyuangoumai/list'
    import discussxiaoyuanzixun from '@/views/modules/discussxiaoyuanzixun/list'
    import ziyuanxinxi from '@/views/modules/ziyuanxinxi/list'
    import discussrenwuxinxi from '@/views/modules/discussrenwuxinxi/list'
    import forum from '@/views/modules/forum/list'
    import fabuzhe from '@/views/modules/fabuzhe/list'
    import renwufenlei from '@/views/modules/renwufenlei/list'
    import renwulingqu from '@/views/modules/renwulingqu/list'
    import xiaoyuanzixun from '@/views/modules/xiaoyuanzixun/list'
    import messages from '@/views/modules/messages/list'
    import discussziyuanxinxi from '@/views/modules/discussziyuanxinxi/list'
    import renwuxinxi from '@/views/modules/renwuxinxi/list'
    import ziyuanfenlei from '@/views/modules/ziyuanfenlei/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/ziyuangoumai',
        name: '资源购买',
        component: ziyuangoumai
      }
      ,{
	path: '/discussxiaoyuanzixun',
        name: '校园资讯评论',
        component: discussxiaoyuanzixun
      }
      ,{
	path: '/ziyuanxinxi',
        name: '资源信息',
        component: ziyuanxinxi
      }
      ,{
	path: '/discussrenwuxinxi',
        name: '任务信息评论',
        component: discussrenwuxinxi
      }
      ,{
	path: '/forum',
        name: '校园论坛',
        component: forum
      }
      ,{
	path: '/fabuzhe',
        name: '发布者',
        component: fabuzhe
      }
      ,{
	path: '/renwufenlei',
        name: '任务分类',
        component: renwufenlei
      }
      ,{
	path: '/renwulingqu',
        name: '任务领取',
        component: renwulingqu
      }
      ,{
	path: '/xiaoyuanzixun',
        name: '校园资讯',
        component: xiaoyuanzixun
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/discussziyuanxinxi',
        name: '资源信息评论',
        component: discussziyuanxinxi
      }
      ,{
	path: '/renwuxinxi',
        name: '任务信息',
        component: renwuxinxi
      }
      ,{
	path: '/ziyuanfenlei',
        name: '资源分类',
        component: ziyuanfenlei
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
