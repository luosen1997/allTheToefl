$(function() {
    $("#myFile").change(function(e) {
        debugger;
        var imgFile = e.currentTarget.files[0];
        var fr = new FileReader();
        fr.readAsDataURL(imgFile);
        fr.onload = function(e) {
            $(".fileUploadLabelOther").css({
                background: "url(" + this.result + ")",
                backgroundSize:"100% 100%"
            })
            $(".fileUploadLabelOther").html("")

            $(".fileUploadLabel150").css({
                background: "url(" + this.result + ")",
                backgroundSize:"100% 100%"
            })
            $(".fileUploadLabel150").html("")

            $(".fileUploadLabel60").css({
                background: "url(" + this.result + ")",
                backgroundSize:"100% 100%"
            })
            $(".fileUploadLabel60").html("")

            $(".fileUploadLabel30").css({
                background: "url(" + this.result + ")",
                backgroundSize:"100% 100%"
            })
            $(".fileUploadLabel30").html("")
        }
    })


})
