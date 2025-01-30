package com.example.multiitemrecyclerview.Recycleview
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiitemrecyclerview.ModelClasses.profiles
import com.example.multiitemrecyclerview.databinding.ItemStudentBinding
import com.example.multiitemrecyclerview.databinding.ItemTeacherBinding

class MultiItemRecycleview(
    private val context: Context,
    private val arrContact: ArrayList<profiles>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_STUDENT = 0
        private const val TYPE_TEACHER = 1
    }

    inner class StudentViewHolder(private val binding: ItemStudentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(profile: profiles) {
            binding.tvName.text = profile.Name
            binding.tvAge.text = profile.Age
            binding.tvRoll.text = profile.Rollno
        }
    }

    // ViewHolder for Teacher
    inner class TeacherViewHolder(private val binding: ItemTeacherBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(profile: profiles) {
            binding.tvName.text = profile.Name
            binding.tvAge.text = profile.Age
            binding.tvRoll.text = profile.Rollno
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (arrContact[position].student) {
            TYPE_STUDENT
        } else {
            TYPE_TEACHER
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        return if (viewType == TYPE_STUDENT) {
            val binding = ItemStudentBinding.inflate(inflater, parent, false)
            StudentViewHolder(binding)
        } else {
            val binding = ItemTeacherBinding.inflate(inflater, parent, false)
            TeacherViewHolder(binding)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val profile = arrContact[position]
        when (holder) {
            is StudentViewHolder -> holder.bind(profile)
            is TeacherViewHolder -> holder.bind(profile)
        }
    }

    override fun getItemCount(): Int = arrContact.size
}
