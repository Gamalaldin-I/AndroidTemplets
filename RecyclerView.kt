package ${PACKAGE_NAME}

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ${AdapterName}(private val data: ArrayList<${ModelName}>) : RecyclerView.Adapter<${AdapterName}.${ViewHolderName}>() {

    // Create ViewHolder class
    class ${ViewHolderName}(val binding: ${ItemName}) : RecyclerView.ViewHolder(binding.root)

    // Create ViewHolder and inflate the item layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${ViewHolderName} {
        val binding=${ItemName}.inflate(LayoutInflater.from(parent.context),parent,false)
        return ${ViewHolderName}(binding)
    }

    // Bind data to the ViewHolder
    override fun onBindViewHolder(holder: ${ViewHolderName}, position: Int) {

    }

    // Return the size of the data list
    override fun getItemCount(): Int {
        return data.size
    }
}
