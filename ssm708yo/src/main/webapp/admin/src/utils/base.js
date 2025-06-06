const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm708yo/",
            name: "ssm708yo",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm708yo/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的教学质量评价系统"
        } 
    }
}
export default base
