$("#dashboard").css("display", "");
$("#admin").css("display", "none");
$("#vidusha").css("display", "none");

$("#dashboardlink").click(function () {
    $("#dashboard").css("display", "none");
    $("#admin").css("display", "none");
    $("#driver").css("display", "block");
});

$("#adminlink").click(function () {
    $("#dashboard").css("display", "none");
    $("#admin").css("display", "block");
    $("#driver").css("display", "none");
});

$("#driverlink").click(function () {
    $("#dashboard").css("display", "");
    $("#admin").css("display", "none");
    $("#driver").css("display", "none");
});
