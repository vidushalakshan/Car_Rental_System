/*
$("#CustomerIDBtn").prop('disabled', true);

const baseUrl = `http://localhost:8080/Car_Rental_System_war/api/customer`

$("#btnaddCustomer").click(function () {
    saveCustomer();
    console.log("hellow");
});

/!*
save customer*!/


function saveCustomer() {
    var data = $("#customercontent").serialize();
    $.ajax({
        url: baseUrl,
        method: "POST",
        data: data,
        success: function (res) {
            if (res.code == 200) {
                alert("Successfully Customer Registered..")
            }
        },
        error: function (ob) {
            alert(ob.responeJSON.message);
        }
    });
}


/!*
clear customer input field*!/

function clearForm() {
    $("#CustomerIDBtn").val("");
    $("#CustomerNameBtn").val("");
    $("#CustomerNicNoBtn").val("");
    $("#CustomerAddressBtn").val("");
    $("#CustomerMobileNumBtn").val("");
    $("#CustomerEmailBtn").val("");
}*/
