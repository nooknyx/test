import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.customertest.MainActivity
import com.example.customertest.R

import com.example.customertest.databinding.FragmentHomeBinding
import com.example.customertest.databinding.FragmentNotificationBinding

import kotlinx.coroutines.NonDisposableHandle.parent

class Notification:Fragment(R.layout.fragment_notification)
{

    private lateinit var binding :FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNotificationBinding.inflate(layoutInflater)

        return binding.root
    }

    /*override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)


        var notiinfo = notidata.getData()

        val notilistview = binding.findViewById<ListView>(R.id.notipage)

        binding.listview.isClickable = true
        listview.adapter = notiadapter(this, notidata)
        listview.setOnItemClickListener { parent, viewm position, id ->

            val notihead = notidata[position].notihead
            val notidetail = notidata[position].notidetail
            val noticover = notidata[position].notipic


    }*/
}







