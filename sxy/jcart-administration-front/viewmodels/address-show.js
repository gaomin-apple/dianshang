var app = new Vue({
    el: '#app',
    data: {
        tag: '',
        conntent: '',
        receiverName: '',
        receiverMobile: ''
    },
    mounted() {
        console.log('view mounted');
        var url = new URL(location.href);
        this.addressId = url.searchParams.get("addressId");
        if(!this.addressId){
            alert('addressId is null');
            return;
        }
        this.getAddressById();
    },
    methods: {
        getAddressById(){
            axuis.get('/address/getById' ,{
                params: {
                    addressId : this.addressId
                }
            })
            .then(function (response){
                console.log(response);
                var address = response.data;
                app.tag = address.tag;
                app.conntent = address.conntent;
                app.receiverName = address.receiverName;
                app.receiverMobile = address.receiverMobile;
            })
            .catch(function (error) {
                console.log(error);
            });
        }
    }
})