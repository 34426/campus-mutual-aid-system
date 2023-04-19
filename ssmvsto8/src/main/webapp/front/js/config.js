
var projectName = '校内互助交易平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '资源信息',
	url: './pages/ziyuanxinxi/list.html'
}, 
{
	name: '任务信息',
	url: './pages/renwuxinxi/list.html'
}, 

{
	name: '校园论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmvsto8/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"发布者","menuJump":"列表","tableName":"fabuzhe"}],"menu":"发布者管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"校园资讯","menuJump":"列表","tableName":"xiaoyuanzixun"}],"menu":"校园资讯管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"资源信息","menuJump":"列表","tableName":"ziyuanxinxi"}],"menu":"资源信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"任务信息","menuJump":"列表","tableName":"renwuxinxi"}],"menu":"任务信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"资源分类","menuJump":"列表","tableName":"ziyuanfenlei"}],"menu":"资源分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"任务分类","menuJump":"列表","tableName":"renwufenlei"}],"menu":"任务分类管理"},{"child":[{"buttons":["查看","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","删除"],"menu":"校园论坛","tableName":"forum"}],"menu":"校园论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"资源信息列表","menuJump":"列表","tableName":"ziyuanxinxi"}],"menu":"资源信息模块"},{"child":[{"buttons":["查看","领取"],"menu":"任务信息列表","menuJump":"列表","tableName":"renwuxinxi"}],"menu":"任务信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付"],"menu":"资源购买","menuJump":"列表","tableName":"ziyuangoumai"}],"menu":"资源购买管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"任务领取","menuJump":"列表","tableName":"renwulingqu"}],"menu":"任务领取管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"资源信息列表","menuJump":"列表","tableName":"ziyuanxinxi"}],"menu":"资源信息模块"},{"child":[{"buttons":["查看","领取"],"menu":"任务信息列表","menuJump":"列表","tableName":"renwuxinxi"}],"menu":"任务信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"资源信息","menuJump":"列表","tableName":"ziyuanxinxi"}],"menu":"资源信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"任务信息","menuJump":"列表","tableName":"renwuxinxi"}],"menu":"任务信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"资源购买","menuJump":"列表","tableName":"ziyuangoumai"}],"menu":"资源购买管理"},{"child":[{"buttons":["查看","删除","审核","支付"],"menu":"任务领取","menuJump":"列表","tableName":"renwulingqu"}],"menu":"任务领取管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"资源信息列表","menuJump":"列表","tableName":"ziyuanxinxi"}],"menu":"资源信息模块"},{"child":[{"buttons":["查看","领取"],"menu":"任务信息列表","menuJump":"列表","tableName":"renwuxinxi"}],"menu":"任务信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"发布者","tableName":"fabuzhe"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
