package ${PACKAGE_NAME}

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
class ${AdapterName}(private val items: ArrayList<${Type}>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val VIEW_TYPE_HEADER = 0
    private val VIEW_TYPE_ITEM = 1
    private val VIEW_TYPE_FOOTER = 2

    override fun getItemViewType(position: Int): Int {
        return when {
            position == 0 -> VIEW_TYPE_HEADER // Header at the top
            position == itemCount - 1 -> VIEW_TYPE_FOOTER // Footer at the bottom
            else -> VIEW_TYPE_ITEM // Other positions are for items
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            VIEW_TYPE_HEADER -> {
                val binding = ${HeaderViewBinding}.inflate(LayoutInflater.from(parent.context), parent, false)
                ${HeaderViewHolder}(binding)
            }
            VIEW_TYPE_FOOTER -> {
                val binding = ${FooterViewBinding}.inflate(LayoutInflater.from(parent.context), parent, false)
                ${FooterViewHolder}(binding)
            }
            else -> {
                val binding = ${ItemBinding}.inflate(LayoutInflater.from(parent.context), parent, false)
                ${ItemViewHolder}(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ${HeaderViewHolder} -> {
                // Configure header here
            }
            is ${ItemViewHolder} -> {
                // Calculate the position within the items list (adjust for header)
                val itemPosition = position - 1
                val item = items[itemPosition]
                holder.bind(item, itemPosition)
            }
            is ${FooterViewHolder} -> {
                // Configure footer here
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size + 2 // +2 for header and footer
    }

  

    inner class ${HeaderViewHolder}(val binding: ${HeaderViewBinding}) : RecyclerView.ViewHolder(binding.root) {
        // Configure header view here
    }

    inner class ${FooterViewHolder}(val binding: ${FooterViewBinding}) : RecyclerView.ViewHolder(binding.root) {
        // Configure footer view here
    }

    inner class ${ItemViewHolder}(val binding: ${ItemBinding}) : RecyclerView.ViewHolder(binding.root) {
        
    }
}
