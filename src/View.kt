class View {
    var CornField: CornField = CornField()
    fun  show(){
        println("У вас есть поле размером ${CornField.area} с культурпой ${CornField.currentCulture.name}")
    }
}