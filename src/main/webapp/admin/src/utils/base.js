const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmvfsrd/",
            name: "ssmvfsrd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmvfsrd/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家庭理财系统"
        } 
    }
}
export default base
