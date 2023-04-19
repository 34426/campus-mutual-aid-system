const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmvsto8/",
            name: "ssmvsto8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmvsto8/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校内互助交易平台"
        } 
    }
}
export default base
