object ${Name}{
    fun showAlertDialog(context: Context,
                       message: String,
                       title: String,
                       positiveButton: String,
                       negativeButton: String,
                        onConfirm:()-> Unit,
                        onCancel: ()-> Unit) {
    val builder = AlertDialog.Builder(context)
    builder.setMessage(message)
    builder.setCancelable(true)
    builder.setTitle(title)

    builder.setPositiveButton(positiveButton) { dialog, _ ->
        onConfirm()
        dialog.dismiss()
    }
    builder.setNegativeButton(negativeButton) { dialog, _ ->
        onCancel()
        dialog.dismiss()

    }
    val dialog = builder.create()

    dialog.show()

}

}
