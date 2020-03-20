var app = new Vue({
    el: '#app',
    data: {
        email: '',
        loading: false,
        buttonEnabled: true,
        counter:120
    },
    methods: {
        handleFindBackPwdClick() {
            console.log('find back pwd click');
            this.loading = true;
            this.buttonEnabled = false;
            this.counter = 120;

            setInterval(function () {
                console.log('count down');
                app.counter--;
                if(counter <0) {
                    app.buttonEnabled = true;
                }
            },1000);
            this.getPwdResetCode();
        },
        getPwdResetCode() {
            axios.get('/administrator/getPwdResetCode', {
                params: {
                    email: this.email
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.loading = false;
                    //alert('重置码已发送到邮箱');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})